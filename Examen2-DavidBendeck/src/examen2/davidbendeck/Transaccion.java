/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.davidbendeck;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author davidbendeck
 */
public class Transaccion implements Serializable {
    
    private int numCuenta;
    private String descripcion;
    private LocalDateTime fechaHora;
    private int txnId;

    public Transaccion() {
    }

    public Transaccion(int numCuenta, String descripcion, LocalDateTime fechaHora, int txnId) {
        this.numCuenta = numCuenta;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
        this.txnId = txnId;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getTxnId() {
        return txnId;
    }

    public void setTxnId(int txnId) {
        this.txnId = txnId;
    }

    @Override
    public String toString() {
        return "" + txnId;
    }
    
    
    
}
