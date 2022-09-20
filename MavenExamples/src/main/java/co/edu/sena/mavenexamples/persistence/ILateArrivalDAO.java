/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.mavenexamples.persistence;

import co.edu.sena.mavenexamples.model.LateArrival;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public interface ILateArrivalDAO {
     public LateArrival findById(Integer id )throws Exception;
     public List<LateArrival>finAll() throws Exception;
}
