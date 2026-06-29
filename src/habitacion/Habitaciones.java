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

    @Override
    public String toString() {
        return "NumeroPiso:" + NumeroPiso + "\nBalcon:" + Balcon;
    }
   
    //Funciones
    //Verificar si una habitacion tiene espacio disponible
    public boolean verificarEspacioHabitacion(int CapacidadMaxima, int cantidadClientesReservacion){
        if(CapacidadMaxima<cantidadClientesReservacion){//cantidadClientes seria de reservacion que aun no tengo
            return false;
        }else
            return true;
    }
    //Calcular el total a pagar según la cantidad de noches y el precio
    public double costoTotalNoche(int PrecioNoche,int NochesReservadas){//Noches reservadas tambien viene de Reservacion que aun no tengo
        double total=0;
        double IVA=0.13;
        total=PrecioNoche*NochesReservadas;
        total=total*IVA;
        return total;
    }
}