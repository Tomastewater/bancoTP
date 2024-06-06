/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.ArrayList;

/**
 * Interfaz Usuario
 * @author tomas
 */
public abstract class Usuario {
    
    protected String usuario;
    protected String pass;
    protected float cuenta = 10000f;
    protected ArrayList<String> movimientos = new ArrayList<String>();
    protected ArrayList<String> transfer = new ArrayList<String>();
    
    public abstract void ingresoUsuario(String usuario, String pass);
    public abstract void depositar(float monto);
    public abstract void retirar(float monto);
    public abstract void ingresarMovimiento(String movimiento);
    public abstract void ingresarTrasferencia(String transfer);
    
}
