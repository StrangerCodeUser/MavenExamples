/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.mavenexamples.utils;

import javax.swing.JOptionPane;

/**
 *@date 13/09/2022
 * @author AshWavesCode
 * objetivo:clase de utilidades para mensaje en pantalla
 */
public class MessageUtils {
    public static void showInfoMessage(String message){
        JOptionPane.showMessageDialog(null,message, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }
     public static void showWarningMessage(String message){
        JOptionPane.showMessageDialog(null,message, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
      public static void showErrorMessage(String message){
        JOptionPane.showMessageDialog(null,message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
