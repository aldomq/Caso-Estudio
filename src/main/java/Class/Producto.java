/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author aldoi
 */
public class Producto 
    { 
        private String producto;
        private String precio;
       
        public Producto() {} // constructor
                
        public Producto(String producto, String precio){
            this.producto = producto;
            this.precio = precio;   
         }
    
        
        
 
   public String getNombre() {
        return producto;
    }

    public void setNombre(String producto) {
        this.producto = producto;
        
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }   
        
        
        
}
