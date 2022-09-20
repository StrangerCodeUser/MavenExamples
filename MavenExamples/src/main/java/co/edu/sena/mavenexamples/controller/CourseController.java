/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.mavenexamples.controller;

import co.edu.sena.mavenexamples.model.Apprentice;
import co.edu.sena.mavenexamples.model.Course;
import co.edu.sena.mavenexamples.persistence.DAOFactory;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class CourseController {
    public Course findById(Integer id)throws Exception{
        if (id ==0) {
            throw  new Exception ("el curso es obligatorio");
        }
        return DAOFactory.getCourseDAO().findById(id);
    }
    public List<Course> finAll()throws Exception{
        return DAOFactory.getCourseDAO().finAll();
    }
}