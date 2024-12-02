package MisClases;

import java.time.LocalDate;

/**
 * @Esta clase representa un modelo base para un DNI con atributos y métodos
 * básicos.
 * @author barrios fabrizio
 * @author rivera luis
 */
public abstract class DNI {

    private String NroDNI;
    private String Genero;
    private int dia;
    private int mes;
    private int año;
    private String Direccion;
    private String EstadoCivil;

    public DNI() {
    }

    /**
     * Constructor parametrizado para inicializar un DNI con valores
     * específicos.
     *
     * @param NroDNI Número del DNI (debe tener 8 caracteres).
     * @param Genero Género del titular.
     * @param dia Día de nacimiento.
     * @param mes Mes de nacimiento.
     * @param año Año de nacimiento.
     * @param Direccion Dirección del titular.
     * @param EstadoCivil Estado civil del titular.
     */
    public DNI(String NroDNI, String Genero, int dia, int mes, int año, String Direccion, String EstadoCivil) {
        this.setNroDNI(NroDNI);
        this.setGenero(Genero);
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.Direccion = Direccion;
        this.EstadoCivil = EstadoCivil;

    }

    /**
     * Establece el número de DNI.
     *
     * @param NroDNI Número del DNI (debe tener 8 caracteres).
     * @throws IllegalArgumentException Si el número de DNI no tiene 8
     * caracteres.
     */
    public void setNroDNI(String NroDNI) {

        if (NroDNI.length() == 8) {
            this.NroDNI = NroDNI;

        } else {
            throw new IllegalArgumentException("Error en Nro de DNI");
        }
        this.NroDNI = NroDNI;
    }

    public String getNroDNI() {

        return NroDNI;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        if (Genero.contains("M") || Genero.contains("F")) {
            this.Genero = Genero;
        } else {
            throw new IllegalArgumentException("Error: Verificar genero");
        }
        this.Genero = Genero;
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

    /**
     * * Crea una fecha a partir de los valores de año, mes y día
     * proporcionados.
     *
     * @param año Año de la fecha.
     * @param mes Mes de la fecha.
     * @param dia Día de la fecha.
     * @return Un objeto LocalDate representando la fecha./
     */

    public LocalDate crearFecha(int año, int mes, int dia) {
        return LocalDate.of(año, mes, dia);
    }

//  * * Proporciona una representación en cadena del objeto DNI, incluyendo 
    // * número de DNI, género, fecha de nacimiento, dirección y estado civil.
    // * @return Una cadena con la información del DNI.
    //  */
    @Override
    public String toString() {
        return "NroDNI=" + NroDNI + ", Genero="
                + Genero + ", Fecha de Nacimiento="
                + crearFecha(año, mes, dia)
                + ", Direccion=" + Direccion + ", EstadoCivil=" + EstadoCivil + '}';
    }

}
