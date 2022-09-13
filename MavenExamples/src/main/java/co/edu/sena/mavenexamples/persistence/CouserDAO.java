/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.mavenexamples.persistence;

import co.edu.sena.mavenexamples.model.Course;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Aprendiz
 */
public class CouserDAO  implements ICourseDAO{

    @Override
    public Course findById(Integer id) throws Exception {
          try {
            return EntityManagerHelper.getEntityManager().find(Course.class, id);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Course> finAll() throws Exception {
        try {
            Query query= EntityManagerHelper.getEntityManager().createNamedQuery("Course.findAll");
            return query.getResultList();
        } catch (Exception e) {
            throw e;
        }
    }
    
}
