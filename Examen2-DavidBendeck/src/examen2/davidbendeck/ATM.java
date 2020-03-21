/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.davidbendeck;

import java.io.Serializable;

/**
 *
 * @author davidbendeck
 */
public class ATM implements Serializable {
    
    private String atmId;
    private String ubicacion;
    private int year;
    private int mantenimiento;
    private int billetes100;
    private int billetes500;

    public ATM() {
    }

    public ATM(String atmId, String ubicacion, int year, int mantenimiento, int billetes100, int billetes500) {
        this.atmId = atmId;
        this.ubicacion = ubicacion;
        this.year = year;
        this.mantenimiento = mantenimiento;
        this.billetes100 = billetes100;
        this.billetes500 = billetes500;
    }

    

    public String getAtmId() {
        return atmId;
    }

    public void setAtmId(String atmId) {
        this.atmId = atmId;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(int mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public int getBilletes100() {
        return billetes100;
    }

    public void setBilletes100(int billetes100) {
        this.billetes100 = billetes100;
    }

    public int getBilletes500() {
        return billetes500;
    }

    public void setBilletes500(int billetes500) {
        this.billetes500 = billetes500;
    }

    @Override
    public String toString() {
        return ubicacion;
    }
    
}
