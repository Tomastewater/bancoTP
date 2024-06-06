/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.Collections;
import java.util.Iterator;

/**
 *
 * Usuario del mismo banco
 * 
 * @author tomas
 * @since 10/11/2022
 */
public class Cliente extends Usuario {
    
    private String Banco = "Mercantil";
   
    public Cliente() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    
    public void setPass(String pass) {
        this.pass = pass;
    }
    

    public String getBanco() {
        return Banco;
    }

   
    public void setBanco(String Banco) {
        this.Banco = Banco;
    }
    
    /**
     * <p>Función que recibe como parametros un Usuario y un Pass (Contraseña) para
     * para colocarlos como atributos del objeto Cliente.</p>
     * 
     * @param usuario Nombre del usuario
     * @param pass Contraseña del usuario
     */
    @Override
    public void ingresoUsuario(String usuario, String pass) {
        
        this.usuario = usuario;
        this.pass = pass;
        
    }

    /**
     * Método que modifica positivamente la cantidad de dinero en cuenta
     * 
     * @param monto Descripcion: Monto que se sumará a la cuenta.
     */
    @Override
    public void depositar(float monto) {
        this.cuenta += monto;
    }

    /**
     * <p>Funcion que modifica negativamente la cantidad de dinero en cuenta,
     * recibiendo como parametro un valor positivo tipo float</p>
     * 
     * @param monto 
     */
    @Override
    public void retirar(float monto) {
        this.cuenta -= monto;
    }
    
    /**
     * <p>Funcion que muestra el dinero total en cuenta que posee un cliente</p>
     * @return Descripcion: Retorna un valor String que posee un mensaje con el monto de la cuenta del usuario. 
     */
    public String mostrarDatos(){
        String fila = "=================================="
                + "\nCAJA DE AHORROS"
                + "\n\nMonto: AR$ "+this.cuenta;
        
        return fila;
        
    }
    
    /**
     * <p>Método que muestra los movimientos que han ocurrido en la cuenta del usuario
     * tales como:</p>
     * <ul><li> Depósitos. <li>Retiros. <li> Transferencias </ul>
     * 
     * @return Descripción: Retorna una cadena de caracteres que posee los movimientos de la cuenta
     */
    public String mostrarMovimientos(){
        String fila = "MOVIMIENTOS  ==============================\n\n";
        Collections.reverse(super.movimientos);   // Invertir lista
        Iterator<String> it = super.movimientos.iterator();
        
        while (it.hasNext()){
            fila += it.next()+"\n\n";
        }
        
        return fila;
    }

    /**
     * <p>Método que ingresa un registro de movimientos a la lista de movimientos del usuario,
     * pueden ser:</p>
     * <ul><li> Depósitos. <li>Retiros. <li> Transferencias </ul>
     * 
     * @param movimiento 
     */
    @Override
    public void ingresarMovimiento(String movimiento) {
        
        super.movimientos.add(movimiento);
        
    }

    /**
     * <p>Método que ingresa un registro de TRANSFERENCIA a la lista de Transferencias del usuario</p>
     * 
     * @param transfer Descripcion: Cadena de caracteres que contiene información de la trasferencia realizada.
     * <i>tipo_de_transacción ------ monto en AR$ -------- fecha de la transferencia</i>
     */
    @Override
    public void ingresarTrasferencia(String transfer) {
        super.transfer.add(transfer);
    }
    
    /**
     * <p>Método que muestra las transferencias que ha realizado el usuario</p>
     * 
     * @return Descripcion: Retorna una cadena de caracteres con información de todas las transferencias realizadas.
     */
    public String mostrarTransferencias(){
        String fila = "TRANSFERENCIAS  ==============================\n\n";
        Collections.reverse(super.transfer);   // Invertir lista
        Iterator<String> it = super.transfer.iterator();
        
        while (it.hasNext()){
            fila += it.next()+"\n\n";
        }
        
        return fila;
    }
    
    
}
