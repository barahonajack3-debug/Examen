/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Actividad {
    public class Actividades {
    private String Nombre;
    private LocalDate Fecha;
    private LocalTime Hora;
    private int CupoMaximo;
    private String ClientesInscritos;
    private TipoActividad TipoActividad;
    private ArrayList<String> Clientes;
    
    public String getNombre(){
        return Nombre;
    }
    public LocalDate getFecha(){
        return Fecha;
    }
    public LocalTime getHora(){
        return Hora;
    }
    public int getCupoMaximo(){
        return CupoMaximo;
    }
    public String getClientesInscritos(){
        return ClientesInscritos;
    }
    public TipoActividad getTipoActividad(){
        return TipoActividad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public void setHora(LocalTime Hora) {
        this.Hora = Hora;
    }

    public Actividades(String Nombre, LocalDate Fecha, LocalTime Hora, int CupoMaximo, String ClientesInscritos, TipoActividad TipoActividad) {
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.CupoMaximo = CupoMaximo;
        this.ClientesInscritos = ClientesInscritos;
        this.TipoActividad = TipoActividad;
        this.Clientes=new ArrayList<>();
    }
    
    public String ToString(){
        return "Nombre"+ Nombre + "\nFecha"+Fecha+"\nHora"+Hora+"\nCupo Maximo"+CupoMaximo+
                "\nClientes Inscritos"+ClientesInscritos+"Tipo Actividad"+TipoActividad;
    }
    
    
    
    public boolean hayCupoDisponible(){
        return Clientes.size() < CupoMaximo;
    }
    
   
   public boolean inscribirClientes(String nombre_cliente){
       if (hayCupoDisponible()){
           Clientes.add(nombre_cliente);
           return true;
       }
        return false;
   }
   
   public int cuposDisponibles(){
       return CupoMaximo - Clientes.size();
   }
   
}
}
