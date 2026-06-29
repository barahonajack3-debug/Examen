/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alojamiento;

/**
 *
 * @author Student
 */
public class Alojamientos {
    //Atributos
    private int Codido;
    private String Nombre;
    private int CapacidadMaxima;
    private int PrecioNoche;
    private boolean Estado;
    //Metodos get
    public int getCodido() {
        return Codido;
    }
    public String getNombre() {
        return Nombre;
    }
    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }
    public int getPrecio() {
        return PrecioNoche;
    }
    public boolean isEstado() {
        return Estado;
    }
    //Metdos set 
    public void setPrecioNoche(int Precio) {
        this.PrecioNoche = Precio;
    }
    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    //Constructor
    public Alojamientos(int Codido, String Nombre, int CapacidadMaxima, int PrecioNoche, boolean Estado) {
        this.Codido = Codido;
        this.Nombre = Nombre;
        this.CapacidadMaxima = CapacidadMaxima;
        this.PrecioNoche = PrecioNoche;
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Codido:" + Codido + "\nNombre:" + Nombre + "\nCapacidadMaxima:" + CapacidadMaxima + "\nPrecioNoche:" + PrecioNoche + "\nEstado:" + Estado;
    }
    
    
}
