/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author aldoi
 */
public class Cliente extends Persona {
    private String puesto = "Cliente";

    // Constructor
    public Cliente(String nombreCompleto, String cedula) {
        super(nombreCompleto, cedula);
    }

    // Implementación del método abstracto
    @Override
    public String getDetalles() {
        return "Cliente: " + getNombreCompleto() + ", Cédula: " + getCedula() + ", Puesto: " + puesto;
    }
}    

