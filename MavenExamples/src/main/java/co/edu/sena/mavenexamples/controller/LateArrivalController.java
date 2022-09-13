/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.mavenexamples.controller;

import co.edu.sena.mavenexamples.model.LateArrival;
import co.edu.sena.mavenexamples.persistence.DAOFactory;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class LateArrivalController {
    public LateArrival findById(Integer id)throws Exception{
        if (id ==0) {
            throw  new Exception ("es obligatorio");
        }
        return DAOFactory.getArrivalDAO().findById(id);
    }
    public List<LateArrival> finAll()throws Exception{
        return DAOFactory.getArrivalDAO().finAll();
    }
}
