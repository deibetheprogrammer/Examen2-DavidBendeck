/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import examen2.davidbendeck.Cuenta;
import examen2.davidbendeck.Transaccion;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author davidbendeck
 */
public class Cliente extends Usuario implements Serializable {
    
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Transaccion> transacciones;

    public Cliente() {
    }

    public Cliente(ArrayList<Cuenta> cuentas, ArrayList<Transaccion> transacciones, String id, String nombre1, String nombre2, String apellido1, String apellido2, String clave, int nacimiento, int afiliacion) {
        super(id, nombre1, nombre2, apellido1, apellido2, clave, nacimiento, afiliacion);
        this.cuentas = cuentas;
        this.transacciones = transacciones;
    }    
    
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "" + id;
    }
    
    
    
}
