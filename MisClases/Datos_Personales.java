
package MisClases;

import java.time.LocalDate;


public abstract class Datos_Personales extends DNI{
    
    
    String NombreCompleto;
    int edad;
    int telefono;
    String gmailPersonal;
   
    public Datos_Personales() {
    }

    public Datos_Personales(String NombreCompleto, int edad,int telefono, String gmailPersonal, int NroDNI, String Genero, int dia, int mes, int año, String Direccion, String EstadoCivil) {
        super(NroDNI, Genero, dia, mes, año, Direccion, EstadoCivil);
        this.edad=edad;
        this.NombreCompleto = NombreCompleto;
        this.telefono = telefono;
        this.gmailPersonal = gmailPersonal;
    }

    
    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getGmailPersonal() {
        return gmailPersonal;
    }

    public void setGmailPersonal(String gmailPersonal) {
        this.gmailPersonal = gmailPersonal;
    }

    @Override
    public LocalDate crearFecha(int año, int mes, int dia) {
        return super.crearFecha(año, mes, dia); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

   
    @Override
    public String toString() {
        return "Datos_Personales{" + "NombreCompleto=" + NombreCompleto + 
                ", edad=" + edad + ", telefono=" + telefono +
                ", gmailPersonal=" + gmailPersonal + ", DNI: "+super.toString();
    }

   
    
    

 

    
  
    
    
    
 
    
    
    
    
}
