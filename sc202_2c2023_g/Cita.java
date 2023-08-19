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
public class Cita {
    
    public String dia;
    public String año;
    public String mes;
    public String semana;
    public String hora;
    public String minutos;
    private String citas;
    private String precio;
    private String duracion;
    

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void setCita(String cita) {
        this.citas = cita;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }

    public void setCitas(String citas) {
        this.citas = citas;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAño() {
        return año;
    }

    public String getCitas() {
        return citas;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getMes() {
        return mes;
    }

    public String getMinutos() {
        return minutos;
    }

    public String getPrecio() {
        return precio;
    }

    public String getSemana() {
        return semana;
    }

    public String getDuracion() {
        return duracion;
    }

    
    public ciita(Cita [](String ){
        int day = 4;
        switch (day) {
         case 1:
             System.out.println("Monday");
             break;
        case 2:
             System.out.println("Tuesday");
              break;
         case 3:
              System.out.println("Wednesday");
              break;
         case 4:
           System.out.println("Thursday");
              break;
        case 5:
              System.out.println("Friday");
              break;
        case 6:
              System.out.println("Saturday");
              break;
        case 7:
             System.out.println("Sunday");
             break;
        default:
            JOptionPane.showInputDialog("Intente de nuevo.");
    }

    
    
    
}
