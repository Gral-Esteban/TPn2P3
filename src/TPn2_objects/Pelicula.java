/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPn2_objects;

/**
 *
 * @author Esteban DAlbano
 */
public class Pelicula {
    
    //atributos
    private Integer id;
    private String nombre;
    private String genero;
    private Integer duracion;
    private boolean estado;
    
    //Getter and Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public Pelicula(Integer i,String Nom,String Gen, Integer Dur,boolean est) {
        id=i;
        nombre=Nom;
        genero=Gen;
        duracion=Dur;
        estado=est;
    }
    
    
}
