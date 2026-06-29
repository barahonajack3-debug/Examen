/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package habitacion;

import alojamiento.Alojamientos;

/**
 *
 * @author Student
 */
public class Habitaciones extends Alojamientos{
    //Atributos
    private int NumeroPiso;
    private boolean Balcon;
    
    //Metodos get
    public int getNumeroHabitacion() {
        return NumeroPiso;
    }
    public boolean isBalcon() {
        return Balcon;
    }
    
    //Metodos set
    public void setNumeroHabitacion(int NumeroPiso) {
        this.NumeroPiso = NumeroPiso;
    }
    public void setBalcon(boolean Balcon) {
        this.Balcon = Balcon;
    }
    
    //Constructor
    public Habitaciones(int NumeroPiso, boolean Balcon, int Codido, String Nombre, int CapacidadMaxima, int PrecioNoche, boolean Estado) {
        super(Codido, Nombre, CapacidadMaxima, PrecioNoche, Estado);
        this.NumeroPiso = NumeroPiso;
        this.Balcon = Balcon;
    }
   
    
}
