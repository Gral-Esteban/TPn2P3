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
public class Cliente {
    
    //atributos
        private Integer id;
        private Integer numerDocumento;
        private String nombre;
        private String apellido;
        
        
        //Getter and Setter

        public Integer getNumerDocumento() {
            return numerDocumento;
        }

        public void setNumerDocumento(Integer numerDocumento) {
            this.numerDocumento = numerDocumento;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
    
      //metodos
        
        public void comprar(){
            
        }
        
        public Cliente(Integer i,Integer numD, String nom, String ap) {
        id=i;
        numerDocumento=numD;
        nombre=nom;
        apellido=ap;
    }
        
    @Override
        public String toString(){
        
       
            return "Id:"+id+"\n"+"DNI:"+numerDocumento+"\n"+"nombre:"+nombre+"\n"+"apellido:"+apellido+"\n";
        }

    
}
