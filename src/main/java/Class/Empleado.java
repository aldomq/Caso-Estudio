/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author aldoi
 */
public class Empleado extends Persona {
    private String puesto = "Trabajador";

    // Constructor
    public Empleado(String nombreCompleto, String cedula) {
        super(nombreCompleto, cedula);
    }

    // Implementación del método abstracto
    @Override
    public String getDetalles() {
        return "Trabajador: " + getNombreCompleto() + ", Cédula: " + getCedula() + ", Puesto: " + puesto;
    }
}
