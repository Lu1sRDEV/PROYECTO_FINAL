/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;
import java.time.LocalDate;

/**
 *
 * @author river
 */
public abstract class DNI {
    
    private int NroDNI;
  private   String Genero;
    private int dia;
    private int mes;
    private int año;
    private String Direccion;
    private String EstadoCivil;

    public DNI() {
    }

    public DNI(int NroDNI, String Genero, int dia, int mes, int año, String Direccion, String EstadoCivil) {
        this.NroDNI = NroDNI;
        this.Genero = Genero;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.Direccion = Direccion;
        this.EstadoCivil = EstadoCivil;
    }

    public int getNroDNI() {
        return NroDNI;
    }

    public String getGenero() {
        return Genero;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public LocalDate crearFecha(int año, int mes, int dia)
    { if (mes < 1 || mes > 12) { 
        throw new IllegalArgumentException
        ("El mes debe estar entre 1 y 12"); } 
    return LocalDate.of(año, mes, dia); }

    @Override
    public String toString() {
        return " DNI{" + "NroDNI=" + NroDNI + ", Genero="
                + Genero + ", Fecha de Nacimiento=" +
                 crearFecha(año, mes, dia)+
                
                ", Direccion=" + Direccion + ", EstadoCivil=" + EstadoCivil + '}';
    }
   
    
   
    
    
}
