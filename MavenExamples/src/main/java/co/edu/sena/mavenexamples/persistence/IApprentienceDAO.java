/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.mavenexamples.persistence;

import co.edu.sena.mavenexamples.model.Apprentice;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public interface IApprentienceDAO {
     public Apprentice findById(long document )throws Exception;
     public List<Apprentice>finAll() throws Exception;
     
}
