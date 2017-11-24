/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author heltonsmith
 */
public class Auto {
    
    private String nombre;
    private String password;
    
    public Auto(){
        
    }

    public Auto(String nombre, String password) {
        this.nombre=nombre;
        this.password=password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    
    
}
