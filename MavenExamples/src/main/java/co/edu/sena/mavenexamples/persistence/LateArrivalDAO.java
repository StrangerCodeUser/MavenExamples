/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.mavenexamples.persistence;

import co.edu.sena.mavenexamples.model.LateArrival;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Aprendiz
 */
public class LateArrivalDAO implements ILateArrivalDAO{

    @Override
    public LateArrival findById(Integer id) throws Exception {
         try {
            return EntityManagerHelper.getEntityManager().find(LateArrival.class, id);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<LateArrival> finAll() throws Exception {
         try {
            Query query= EntityManagerHelper.getEntityManager().createNamedQuery("LateArrival.findAll");
            return query.getResultList();
        } catch (Exception e) {
            throw e;
        }
    }
    
}
