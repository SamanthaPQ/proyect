/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc202_2c2023_g;

import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Samy
 */
public class Medicos {
    
    public String nombre_medico;
    public int especialidad;
    public int almuerzo;
    private int id;
    
    
    public String getNombre(){
        
        return nombre_medico;
    }
    
    public int getEspecialidad(){
        return especialidad;
    }
    
    public int getAlmuerzo (){
        return almuerzo;
    }
    
    public void setNombre (String Nombre_medico){
        this.nombre_medico = Nombre_medico;
    }
    
    public void setEspecialidad (int especialidad){
        this.especialidad = especialidad;
    }
    
    public void setAlmuerzo (int almuerzo){
        this.almuerzo = almuerzo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre_medico(String nombre_medico) {
        this.nombre_medico = nombre_medico;
    }

    public int getId() {
        return id;
    }

    public String getNombre_medico() {
        return nombre_medico;
    }
            
    public Medicos(String nombre_medicos, int especialidad, int almuerzo){
        this.almuerzo = almuerzo;
        this.especialidad = especialidad;
        this.nombre_medico = nombre_medico;
        
    }
    public static int mstrarMenu(){
        String opccin = JOptionPane.showInputDialog(message"EMPLEADOR");
    }
    
    public static void main(String[] args) {
        
       int edicc = JOptionPane.showInternalConfirmDialog(null,"Empleador");
       
       
         switch (edicc) {
            
            case 1:
                ModificaPersonal ();
                JOptionPane.showConfirmDialog(null, "ver personal");
                break;
                
            case 2:
                EiminarPersonal (),;
                break;
                
             case 3:
                verdatos ();
                break;
                
             case 4:
                
                break;
                
            default:
                JOptionPane.showInputDialog("Intente de nuevo.");
        }
        }
              public static void Agregar_medico ( Medicos[] arreglo_Medicos){
                  
                  Medicos[] arreglo = new Medicos[5];
                  
                  int id = -1;
                  
                  System.out.println(arreglo_Medicos.getNombre_medico());
        
                for (int i = 0; i < arreglo_Medicos.length; i++) {

                     if (arreglo_Medicos [i] == null) {
                
                     id = i;
                break;
                
            }  
           arreglo_Medicos.setNombre_medico()(JOptionPane.showInputDialog(null, "ingrese el nombre del medico");
           
        }
        
    }
}