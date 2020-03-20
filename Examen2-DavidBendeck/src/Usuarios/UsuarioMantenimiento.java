/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import examen2.davidbendeck.ATM;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author davidbendeck
 */
public class UsuarioMantenimiento extends Usuario implements Serializable {
    
    private ArrayList<ATM> atms;

    public UsuarioMantenimiento() {
    }

    public UsuarioMantenimiento(ArrayList<ATM> atms, String id, String nombre1, String nombre2, String apellido1, String apellido2, String clave, int nacimiento, int afiliacion) {
        super(id, nombre1, nombre2, apellido1, apellido2, clave, nacimiento, afiliacion);
        this.atms = atms;
    }

    public ArrayList<ATM> getAtms() {
        return atms;
    }

    public void setAtms(ArrayList<ATM> atms) {
        this.atms = atms;
    }

    @Override
    public String toString() {
        return "" + id;
    }
     
    
}
