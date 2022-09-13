/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.mavenexamples.controller;

import co.edu.sena.mavenexamples.model.Apprentice;
import co.edu.sena.mavenexamples.persistence.DAOFactory;
import java.util.List;

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
}

