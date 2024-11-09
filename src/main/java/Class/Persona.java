/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author aldoi
 */
public abstract class Persona {
    private String nombreCompleto;
    private String cedula;

    // Constructor
    public Persona(String nombreCompleto, String cedula) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
    }

    // Métodos getter y setter
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // Método abstracto para obtener detalles
    public abstract String getDetalles();
}    

