/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.ArrayList;

/**
 * 
 * @author tomas
 */
public class operacionUsuario {
    
    ArrayList<Cliente> usuarios;

    public operacionUsuario() {
        usuarios = new ArrayList<Cliente>();
    }
    
    public int buscar(String usuario){    // Metodo para saber si ya el usuario existe, si retorna n=-1, 
                                          // el usuario no existe, por lo tanto podemos ingresarlo con el metodo siguiente insertar()
        int n = -1;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getUsuario().equals(usuario)){
                n = i;
                break;
            }
        }
        return n;
    }
    
    public boolean insertar(Cliente cliente){  // Ingresa el usuario si no existe dentro de la lista
        
        if(buscar(cliente.getUsuario()) == -1){
            usuarios.add(cliente);
            return true;
        } else {
            return false;
        }
        
    }
    
    public Cliente obtener(String usuario){     // Con el nombre de usuario, me obtiene el objeto cliente que se encuentra
                                                // dentro de la lista
        
        if(buscar(usuario) != -1){
            return usuarios.get(buscar(usuario));
        } else {
            return null;
        }
        
    }

    
}
