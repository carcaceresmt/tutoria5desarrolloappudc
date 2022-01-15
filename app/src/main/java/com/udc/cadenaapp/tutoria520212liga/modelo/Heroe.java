package com.udc.cadenaapp.tutoria520212liga.modelo;

/**
 * clase Heroe
 */
public class Heroe {
    /**
     * Atributos Heroe
     */
    private String nombre;
    private int imagen;

    /**
     * constructor Heroe
     * @param nombre
     * @param imagen
     */

    public Heroe(String nombre,int imagen){
        this.nombre=nombre;
        this.imagen=imagen;
    }

    /**
     * metodos Setter y Getter
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
