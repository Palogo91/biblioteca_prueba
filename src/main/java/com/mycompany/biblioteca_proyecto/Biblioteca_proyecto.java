/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca_proyecto;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Paloma Lobo
 */
public class Biblioteca_proyecto {

    public static void main(String[] args) {
       conectarBaseDatos();
    }
    
    public static void conectarBaseDatos(){
        try{
         
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3308/biblioteca", "root", "");
            //localhoost:3308/biblioteca es el nombre de mi base de datos
            System.out.println("Conectado");
        
        }catch(Exception ex){
            System.out.println("No conectado. Error: ");
            ex.printStackTrace();
        
        }
    }
}
