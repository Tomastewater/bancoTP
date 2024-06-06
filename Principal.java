/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Banco;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author tomas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Registro registro = new Registro();
        cambiarClave cc = new cambiarClave();
        
        registro.setVisible(true);
        
        Cliente cliente = new Cliente();
        cliente.ingresoUsuario("Hola", "nada");
        
  //      Calendar calendario = new GregorianCalendar();
        

    }
    
}
