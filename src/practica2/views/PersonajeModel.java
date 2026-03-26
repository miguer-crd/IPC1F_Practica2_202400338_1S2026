/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.views;

/**
 *
 * @author Miguer Corado
 */
public class PersonajeModel {
    int idPersonaje;
    String nombre;
    Casas casa;
    EscobaModel escoba;

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casas getCasa() {
        return casa;
    }

    public void setCasa(Casas casa) {
        this.casa = casa;
    }

    public EscobaModel getEscoba() {
        return escoba;
    }

    public void setEscoba(EscobaModel escoba) {
        this.escoba = escoba;
    }
    
}
