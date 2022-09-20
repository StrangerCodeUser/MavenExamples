/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.mavenexamples.controller;

import co.edu.sena.mavenexamples.model.Apprentice;
import co.edu.sena.mavenexamples.persistence.DAOFactory;
import co.edu.sena.mavenexamples.utils.Constants;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Aprendiz
 */
public class ApprenticeContoller {
    public Apprentice findById(long document)throws Exception{
        if (document ==0) {
            throw  new Exception ("el documento es obligatorio");
        }
        return DAOFactory.getApprendiceDAO().findById(document);
    }
    public List<Apprentice> finAll()throws Exception{
        return DAOFactory.getApprendiceDAO().finAll();
    }
    public String setMessage() throws Exception{
        String message="";
        try {
            List<Apprentice>apprentieces=finAll();
            message = "<p>Cordial saludo se envia el reporte de aprendices registrados en ARLET </p>"+"<table border='1'"+"<tr><th>Documento</th><th>Nombre</th><th>program</th></tr>";
                for (Apprentice apprentiece : apprentieces) {
                    message+="<tr>"+"<td>" +apprentiece.getDocument()+"</td>"
                    +"<td>" +apprentiece.getFullName()+"</td>"
                    +"<td>" +apprentiece.getIdCourse()+"</td>"+"</tr>";
            }
                message+="</table>";
        } catch (Exception e) {
            throw e;
        }
        return message;
    }
    public void sendEmail(String to ,String subject )throws Exception{
        Properties props=new Properties();
        props.put("mail.transport.protocool",Constants.PROTOCOL);
        props.put("mail.smtp.host",Constants.HOST);
        props.put("mail.smtp.socketFactoryPort",Constants.SOOCKET_FACTORY_PORT);
        props.put("mail.smtp.socketFactory",Constants.SOOCKET_FACTORY);
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port",Constants.PORT);
        props.put("mail.smtp.user",Constants.USER);
        props.put("mail.smtp.password",Constants.PASSWORD);
        props.put("mail.smtp.starttls.enable","true");
        
        Session session= Session.getDefaultInstance(props);
        MimeMessage message =new MimeMessage(session);
        String bodyMessage =setMessage();
        
        
        InternetAddress from = new InternetAddress(props.getProperty("mail.smtp.user"));
        message.setFrom(from);
        message.setSubject(subject);
        message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        message.setContent(bodyMessage, "text/html; charset=utf-8");
        Transport trasnport =session.getTransport(Constants.PROTOCOL);
        trasnport.connect(props.getProperty("mail.smtp.host"),props.getProperty("mail.smtp.user"),props.getProperty("mail.smtp.password"));
        trasnport.sendMessage(message, message.getAllRecipients());
        trasnport.close();
    }
}

