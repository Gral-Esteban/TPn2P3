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
public class Tarjeta {
    
    //atributos
    private Integer id_socio;
    private Integer saldo=100;
    private boolean estado=true;
    
    //Getter and Setter
    public Integer getId_socio(){    
        return id_socio;
    }

    public void setId_socio(Integer id_socio) {
        this.id_socio = id_socio;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public boolean isEstado() {
        return estado;
    }

   
    public void setEstado(boolean estado) {    
        this.estado = estado;
    }

    //metodos
    public void añadir_saldo() {
        saldo=saldo+100;
    }
    
    public void quitar_saldo(Integer costo_alq_peli){
        saldo=saldo-costo_alq_peli;
    }
    
    public Integer mostrar_saldo(){
        
     return Tarjeta.this.saldo;
    }
    
}
