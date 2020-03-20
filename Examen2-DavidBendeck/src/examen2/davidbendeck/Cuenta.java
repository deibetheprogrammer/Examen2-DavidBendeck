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
public class Cuenta implements Serializable {
    
    private int numCuenta;
    private int saldoDisponible;
    private String id;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, int saldoDisponible, String id) {
        this.numCuenta = numCuenta;
        this.saldoDisponible = saldoDisponible;
        this.id = id;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "" + numCuenta;
    }
    
    
    
}
