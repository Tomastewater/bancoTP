/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author tomas
 */
public class noCliente extends Usuario {
    
    private String Banco = "otroBanco";
    
    

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    @Override
    public void ingresoUsuario(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

    @Override
    public void depositar(float monto) {
        this.cuenta += monto;
    }

    @Override
    public void retirar(float monto) {
        this.cuenta -= monto;
    }

    @Override
    public void ingresarMovimiento(String movimiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ingresarTrasferencia(String transfer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
