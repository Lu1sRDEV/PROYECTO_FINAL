package MisClases;

import MisClases.Datos_Personales;
import MisClases.Nivel_de_Acceso;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
* @author barrios fabrizio
 * @author rivera luis
*/


public class Alumno extends Datos_Personales implements Nivel_de_Acceso {

    private String NombredeAcceso;
    private int IdniveldeAcceso;
    private String curso;
/** * Mapa que asocia el nombre de un curso con una lista de notas
 * obtenidas en ese curso. * La clave es el nombre del curso y 
 * el valor es una lista de notas. */
    private Map<String, ArrayList<Double>> notasPorCurso;
    /** * Conjunto que contiene los nombres de los cursos en 
     * los que el alumno está inscrito. * Este conjunto garantiza 
     * que no haya cursos duplicados. */
    private Set<String> nombresDeCursos;
    
    
    public Alumno() {
        notasPorCurso = new HashMap<>();
        nombresDeCursos= new HashSet<>();
    }

  
    public Alumno(String NombredeAcceso, int IdniveldeAcceso,String NombreCompleto, String Apellido, int edad, String telefono, String gmailPersonal, String NroDNI, String Genero, int dia, int mes, int año, String Direccion, String EstadoCivil) {
        super(NombreCompleto, Apellido, edad, telefono, gmailPersonal, NroDNI, Genero, dia, mes, año, Direccion, EstadoCivil);
         this.setNombredeAcceso(NombredeAcceso);
        this.setIdniveldeAcceso(IdniveldeAcceso);
        
        this.notasPorCurso = new HashMap<>();
        this.nombresDeCursos =  new HashSet<>();
    }

   
/** * Agrega una nota para un curso específico. *
 * Si el curso no existe en el mapa, se crea una 
 * nueva entrada. * * 
 * @param curso El nombre del curso. * 
 * @param nota La nota a agregar. Debe ser mayor o igual a 0. * 
 * @throws IllegalArgumentException si la nota es inválida 
 * (menor que 0). */
public void agregarNota(String curso, double nota) {
    
    if (nota >= 0) {
        if (!notasPorCurso.containsKey(curso)) {
            /*Agrega una nueva entrada con el curso como clave 
            y una nueva lista vacía (ArrayList<Double>) como valor.
            Esta lista se utilizará para almacenar las notas del 
            curso.*/
            notasPorCurso.put(curso, new ArrayList<>());
        }
        /*Esta línea obtiene la lista de notas asociada con el 
          curso especificado y agrega la nueva nota a esa lista.*/
        notasPorCurso.get(curso).add(nota);
    } else {
        throw new IllegalArgumentException("Error :nota invalidada");
    }
}
      /** * Calcula el promedio de las notas para un curso específico. * 
       * Si no hay notas registradas para el curso, devuelve 0. * *
       * @param curso El nombre del curso. *
       * @return El promedio de las notas del curso o 0 si no hay notas. */
    public double calcularPromedio(String curso) {

        ArrayList<Double> notas = notasPorCurso.get(curso);
        if (notas == null || notas.isEmpty()) {
            return 0;
        }
        double suma = 0; //Acumulador
        for (double nota : notas) {
            suma += nota;
        } 
        return suma / notas.size();
    }
       /** * Determina el estado del curso (Aprobado o Desaprobado) basado en el promedio de notas. 
        * Si el promedio es mayor o igual a 12, el estado es "Aprobado". De lo contrario, es "Desaprobado". * * 
        * @param curso El nombre del curso. * 
        * @return "Aprobado" si el promedio es mayor o igual a 12, de lo contrario "Desaprobado". */
     public String estadoCurso(String curso) { 
         //la variable promedio almacenara el promedio de las notas del curso especificado
         double promedio = calcularPromedio(curso);
         if (promedio >= 12) { 
             return "Aprobado"; 
         } else {
             return "Desaprobado";
         }
     } 
      /** * Obtiene los estados de aprobación o desaprobación para cada curso. * *
       * @return Un mapa donde las claves son los nombres de los cursos y los valores son los 
       * estados ("Aprobado" o "Desaprobado"). */
     public Map<String, String> obtenerestadosporcurso() {
        Map<String, String> estados = new HashMap<>();
        for (String curso : notasPorCurso.keySet()) {
            estados.put(curso, estadoCurso(curso));
            
        }
        return estados;

    }
    /** * Obtiene los promedios de notas para cada curso. * * @return 
     * Un mapa donde las claves son los nombres de los cursos y los valores son 
     * los promedios de notas. */
    public Map<String, Double> obtenerPromediosPorCurso() {
        Map<String, Double> promedios = new HashMap<>();
        for (String curso : notasPorCurso.keySet()) {
            promedios.put(curso, calcularPromedio(curso));
            
        }
        return promedios;

    }


    public void setNombredeAcceso(String NombredeAcceso) {
        if (NombredeAcceso.equalsIgnoreCase("User")) {
            this.NombredeAcceso = NombredeAcceso;

        } else {
            throw new IllegalArgumentException("Error: Nombre de Acceso alumno Incorrecto");

        }

    }

    public void setIdniveldeAcceso(int IdniveldeAcceso) {
        if (IdniveldeAcceso > 0) {
            //mayor a cero
            this.IdniveldeAcceso = IdniveldeAcceso;
        } else {
            throw new IllegalArgumentException("Error: Id nivel de acceso de alumno Incorrecto");
        }
    }

    @Override
    public String nivelacceso(String NomAcceso, int nivelAcceso) {
        NomAcceso = NombredeAcceso;
        nivelAcceso = IdniveldeAcceso;

        return "Uuario: " + NombredeAcceso+NombreCompleto+ " ,"
                + "Nivel de Acceso: " + IdniveldeAcceso;
    }
/** * Crea un objeto LocalDate con los parámetros proporcionados, validando el rango de los valores. * Lanza una excepción si los valores son inválidos. *
 * @param año El año de la fecha. * @param mes El mes de la fecha (1-12). *
 * @param dia El día de la fecha. * @return Un objeto LocalDate representando la fecha. * 
 * @throws IllegalArgumentException si los valores de fecha son inválidos. */
    @Override
    public LocalDate crearFecha(int año, int mes, int dia) {
          if ((mes < 1 || mes > 12) || (año<0 || dia<0)) { 
      throw new IllegalArgumentException
       ("Error en la fecha.");
        } 
        return super.crearFecha(año, mes, dia); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    /** * Devuelve una representación en cadena del objeto Alumno, * incluyendo su nivel de acceso y la representación de la clase base. * *
     * @return Una cadena que representa el objeto Alumno. */ 
    @Override
    public String toString() {
        return "" + nivelacceso(NombredeAcceso, IdniveldeAcceso)
                + "\n" + super.toString();
    }

}
