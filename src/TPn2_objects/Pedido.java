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
public class Pedido {
    
     //atributos
    private Integer idPelicula;
    private boolean tipo;
    
    
    //metodos
    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    
    public void confirmar_pedido(){
        
    }
    
    public void cancelar_pedido(){
        
    }
}
