/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea;

import java.io.Serializable;

/**
 *
 * @author grupo 4 henry,fernanda,felipe
 */
public class Cliente implements Serializable{
    
    private String nombrePasajero, rutPasajero, telefonoPasajero,asiento,vip;

    public Cliente() {
    }

    public Cliente(String nombrePasajero, String rutPasajero, String telefonoPasajero, String asiento, String vip) {
        this.nombrePasajero = nombrePasajero;
        this.rutPasajero = rutPasajero;
        this.telefonoPasajero = telefonoPasajero;
        this.asiento = asiento;
        this.vip = vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getVip() {
        return vip;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public void setRutPasajero(String rutPasajero) {
        this.rutPasajero = rutPasajero;
    }

    public void setTelefonoPasajero(String telefonoPasajero) {
        this.telefonoPasajero = telefonoPasajero;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public String getRutPasajero() {
        return rutPasajero;
    }

    public String getTelefonoPasajero() {
        return telefonoPasajero;
    }
    
}
