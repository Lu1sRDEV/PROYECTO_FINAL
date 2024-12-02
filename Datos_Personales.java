package MisClases;

import java.time.LocalDate;

/**
 * @author Barrios Fabrizio
 * @author Rivera Luis
 */
public abstract class Datos_Personales extends DNI {

    String NombreCompleto;
    String Apellido;
    int edad;
    String telefono;
    String gmailPersonal;

    public Datos_Personales() {
    }

    /*
    Constructor parametrizado que inicializa todos los atributos
     */
    public Datos_Personales(String NombreCompleto, String Apellido, int edad, String telefono, String gmailPersonal, String NroDNI, String Genero, int dia, int mes, int año, String Direccion, String EstadoCivil) {
        super(NroDNI, Genero, dia, mes, año, Direccion, EstadoCivil);
        this.NombreCompleto = NombreCompleto;
        this.Apellido = Apellido;
        this.edad = edad;
        this.setTelefono(telefono);
        this.gmailPersonal = gmailPersonal;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    /**
     * * Establece el número de teléfono del titular.
     *
     * @param telefono Número de teléfono (debe contener 9 dígitos).
     * @throws IllegalArgumentException Si el número de teléfono no tiene 9
     * dígitos.
     */
    public void setTelefono(String telefono) {
        if (telefono.length() == 9) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("Error: Numero de digitos");
        }

    }

    public String getGmailPersonal() {
        return gmailPersonal;
    }

    public void setGmailPersonal(String gmailPersonal) {
        this.gmailPersonal = gmailPersonal;
    }

    @Override
    public LocalDate crearFecha(int año, int mes, int dia) {
        return LocalDate.of(año, mes, dia);
        //valida automaticamente la fecha
    }

    /**
     * Representa el objeto en una cadena de texto, incluyendo los datos
     * personales y los atributos heredados de {@link DNI}.
     *
     * @return Una cadena con los datos personales y el DNI.
     */
    @Override
    public String toString() {
        return "Datos_Personales{" + "Nombre=" + NombreCompleto + ", Apellido= " + Apellido
                + ", edad=" + edad + ", telefono=" + telefono
                + ", gmailPersonal=" + gmailPersonal + ", [DNI: " + super.toString();
    }
}
