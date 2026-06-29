/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

/**
 *
 * @author Student
 */
public class Cliente {
      private String  Identificacion;
    private String Nombre;
    private String Apellido;
    private int FehaNacimiento; 
    private String Numero;
    private String CorreoElectronico;
    private String Pais;
    private int FechaActual;

    public String getIdentificacion() {
        return Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellido;
    }

    public int getFehaNacimiento() {
        return FehaNacimiento;
    }

    public String getCorreoElectronic() {
        return CorreoElectronico;
    }

    public String getPais() {
        return Pais;
    }

    public String getNumero() {
        return Numero;
    }

    public int getFechaActual() {
        return FechaActual;
    }

    public Cliente(String Identificacion, String Nombre, String Apellidos, int FehaNacimiento, String Numero, String CorreoElectronic, String Pais,int FechaActual) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.Apellido = Apellidos;
        this.FehaNacimiento = FehaNacimiento;
        this.Numero = Numero;
        this.CorreoElectronico = CorreoElectronic;
        this.Pais = Pais;
        this.FechaActual = FechaActual;
    }
    
    public void calcularedad(int edad,int FechaActual, int FehaNacimiento){
             if ( FechaActual >= FehaNacimiento ){
                 edad = FechaActual - FehaNacimiento;
                 System.out.println("Tu edad actual es de: "+edad);
             }
    }
    
    @Override
    public String toString(){
        System.out.println("Identifacion: "+ this.Identificacion +"\nNombre: " +this.Nombre + "\nApellidos: " + this.Apellido+ "\FehaNacimiento: " +this.FehaNacimiento
                + "\nNumero: " + this.Numero + "\ncorreo electronico" + this.CorreoElectronico + "\npais: " +this.Pais+ "\nFechaActual: " + this.FechaActual);
    }
    
}
