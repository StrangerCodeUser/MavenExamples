/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.mavenexamples.persistence;

/**
 *
 * @author Aprendiz
 */
public class DAOFactory {
    private static IApprentienceDAO  apprendiceDAO =  new ApprentienceDAO();
    private static ILateArrivalDAO lateArrivalDAO = new LateArrivalDAO();
    private static ICourseDAO courseDAO= new CouserDAO();

    public static IApprentienceDAO getApprendiceDAO() {
        return apprendiceDAO;
    }

    public static ILateArrivalDAO getArrivalDAO() {
        return lateArrivalDAO;
    }

    public static ICourseDAO getCourseDAO() {
        return courseDAO;
    }
    
}

