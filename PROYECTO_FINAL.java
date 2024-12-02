package proyecto_final;

import MisClases.Alumno;
import java.util.*;

/** El proyecto trata sobre la gestion de los alumnos y sus notas. 
 * Esta clase crea alumnos, les agrega notas, y calcula los promedios y estados de cada curso. 
 * @author barrios fabrizio
 * @author rivera luis
 */
public class PROYECTO_FINAL {

    private static Set<Integer> idsUnicos = new HashSet<>();

    public static void main(String[] args) {
        List<Alumno> Informe = new ArrayList<>();

        try {

            Alumno A1 = crearAlumno("user", 1, "Lus", "Rivera", 12, "995392741", "TTTron89@gmail.com", "74348581", "F", 11, 9, 2010, "Av Canada 104", "soltero");
            Alumno A2 = crearAlumno("user", 2, "Miguel", "Mesa", 14, "985621923", "Vegete9@gmail.com", "74612063", "M", 1, 8, 2003, "Av Aviacion", "Soltero");
            Alumno A3 = crearAlumno("user", 3, "Angel", "Chocca", 14, "945020912", "Vegete9@gmail.com", "74612063", "M", 1, 8, 2003, "Av Aviacion", "Soltero");
            Informe.add(A1);
//          
            A1.getNroDNI();
            agregarNotas(A1, "Matemáticas", new double[]{12, 10, 11, 14, 16});
            agregarNotas(A1, "Lenguaje", new double[]{12, 20, 11, 19, 16});
            agregarNotas(A1, "Quimica", new double[]{12, 13, 11.0, 15.0, 20.0});
            agregarNotas(A1, "Historia", new double[]{11, 9, 5, 14, 11.0});
            agregarNotas(A1, "Civica", new double[]{12, 14, 11.0, 14.0, 16.0});
            agregarNotas(A1, "Educacion fisica", new double[]{12, 9, 11.0, 14.0, 16.0});
            Informe.add(A2);
            agregarNotas(A2, "Matemáticas", new double[]{12, 20, 20.0, 9.0, 16.0});
            agregarNotas(A2, "Quimica", new double[]{12, 15, 11.0, 15.0, 20.0});
            agregarNotas(A2, "Historia", new double[]{11, 2, 16, 14, 11.0});
            agregarNotas(A2, "lenguaje", new double[]{14, 9, 5, 14, 11.0});
            agregarNotas(A2, "Civica", new double[]{7, 8, 14, 14, 16});
            agregarNotas(A2, "Educacion fisica", new double[]{12, 9, 9, 14, 16});
            Informe.add(A3);
            agregarNotas(A3, "Matemáticas", new double[]{10, 10, 11.0, 14.0, 16.0});
            agregarNotas(A3, "Quimica", new double[]{12, 13, 11.0, 20.0, 20.0});
            agregarNotas(A3, "Historia", new double[]{9, 20, 10, 14, 11.0});
            agregarNotas(A3, "Lenguaje", new double[]{11, 18, 20, 14, 11.0});
            agregarNotas(A3, "Civica", new double[]{12, 11, 11.0, 12, 13});
            agregarNotas(A3, "Educacion fisica", new double[]{12, 19, 1, 14.0, 11});

            // Obtener y mostrar promedios por curso para cada alumno 
            for (Alumno alumno : Informe) {
                System.out.println("" + alumno.toString());
                System.out.println("Promedios de " + alumno.getNombreCompleto());
                Map<String, Double> promediosPorCurso = alumno.obtenerPromediosPorCurso();
                Map<String, String> estadosPorCurso = alumno.obtenerestadosporcurso();
                for (String curso : promediosPorCurso.keySet()) {
                    System.out.println("Curso: " + curso);
                    System.out.println("Promedio: " + promediosPorCurso.get(curso));
                    System.out.println("Estado: " + estadosPorCurso.get(curso));
                }
                System.out.println("---------------------------------------");
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println();

    }
 /*
    Agregar un arreglo de notas a un curso especifico para un alumno
    */
public static void agregarNotas(Alumno alumno, String curso, double[] notas) {
        for (double nota : notas) {
            alumno.agregarNota(curso, nota);
        }
    }
   /*
    Crea un objeto Alumno,asegurando que el ID de nivel de acceso no tenga duplicados
    */
    public static Alumno crearAlumno(String NombredeAcceso, int IdniveldeAcceso, String NombreCompleto, String Apellido,
            int edad, String telefono, String gmailPersonal, String NroDNI, String Genero, int dia, int mes,
            int año, String Direccion, String EstadoCivil) {
        if (!idsUnicos.add(IdniveldeAcceso)) {
            throw new IllegalArgumentException("Error: IdniveldeAcceso duplicado");
        }
        return new Alumno(NombredeAcceso, IdniveldeAcceso, NombreCompleto,
                Apellido, edad, telefono, gmailPersonal, NroDNI, Genero, dia, mes, año, Direccion, EstadoCivil);
    }
}
