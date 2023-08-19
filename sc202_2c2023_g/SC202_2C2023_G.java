/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sc202_2c2023_g;

import com.sun.jdi.connect.Connector;
import javax.swing.JOptionPane;

/**
 *
 * @author Samy
 */
public class SC202_2C2023_G {

    public static void main(String[] args) {
        Medicos[] Ame = new Medicos [5];
        String empleador;
        
        int De_menu = JOptionPane.showConfirmDialog(null, "Bienvenido al hospital que desea acceder");
         
                    switch (De_menu) {
                        
                        case 1:
                            JOptionPane.showConfirmDialog(null, "Administracion de empleados");
                            break;
                        default:
                            throw new AssertionError();
            
        }
        
    }
}
