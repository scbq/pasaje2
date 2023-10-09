/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolinea;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author grupo 4 henry,fernanda,felipe
 */
public class Proceso implements Serializable{
    
    private ArrayList<Object> a = new ArrayList<Object>();
    
    public Proceso(){}
    
    public Proceso(ArrayList<Object> a){
        this.a = a;
    }
    
    public void agregarRegistro(Cliente p){
        this.a.add(p);
    }

    public void modificarRegistro(int i, Cliente p){
        this.a.set(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.a.remove(i);
    }
    
    public Cliente obtenerRegistro(int i){
        return (Cliente)a.get(i);
    }
    
    public int cantidadRegistro(){
        return this.a.size();
    }
    /*
    public int buscaRut(int rut){
        for(int i = 0; i < cantidadRegistro(); i++){
            if(rut == obtenerRegistro(i).getRut())return i;
        }
        return -1;
    }
        
    public int buscaNombreApellido(String nombre, String apellidoP, String apellidoM){
        for(int i = 0; i < cantidadRegistro(); i++){
            if(nombre.equals(obtenerRegistro(i).getNombre()) && apellidoP.equals(obtenerRegistro(i).getApellidoP()) && apellidoM.equals(obtenerRegistro(i).getApellidoM()))return i;
        }
        return -1;
    }
    */
}
