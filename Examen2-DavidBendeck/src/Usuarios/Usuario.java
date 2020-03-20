/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.io.Serializable;

/**
 *
 * @author davidbendeck
 */
public class Usuario implements Serializable {
    
    protected String id;
    protected String nombre1;
    protected String nombre2;
    protected String apellido1;
    protected String apellido2;
    protected String clave;
    protected int nacimiento;
    protected int afiliacion;

    public Usuario() {
    }

    public Usuario(String id, String nombre1, String nombre2, String apellido1, String apellido2, String clave, int nacimiento, int afiliacion) {
        this.id = id;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.clave = clave;
        this.nacimiento = nacimiento;
        this.afiliacion = afiliacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(int afiliacion) {
        this.afiliacion = afiliacion;
    }

    @Override
    public String toString() {
        return  id ;
    }
    
    
    
}
