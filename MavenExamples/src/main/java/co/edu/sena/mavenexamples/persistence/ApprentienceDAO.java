/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.mavenexamples.persistence;

import co.edu.sena.mavenexamples.model.Apprentice;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Aprendiz
 */
public class ApprentienceDAO implements IApprentienceDAO{

    @Override
    public Apprentice findById(long document) throws Exception {
        try {
            return EntityManagerHelper.getEntityManager().find(Apprentice.class, document);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Apprentice> finAll() throws Exception {
        try {
            Query query= EntityManagerHelper.getEntityManager().createNamedQuery("Apprentice.findAll");
            return query.getResultList();
        } catch (Exception e) {
            throw e;
        }
    }
    
}
