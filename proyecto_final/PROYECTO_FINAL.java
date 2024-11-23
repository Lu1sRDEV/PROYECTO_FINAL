/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_final;

import MisClases.Alumno;
import MisClases.Datos_Personales;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author river
 */
public class PROYECTO_FINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Datos_Personales Alumno = new  Alumno("User",1,"Luis",12, 999992, "Arron89@gmail.com", 74643563,
//                "M", 1, 10, 2003, "Av Proceres", "Soltero");
//        
//         Datos_Personales Alumno2 = new  Alumno("User",3,"Lus",14, 999992, "TTTron89@gmail.com", 74348563,
//                "M", 20, 10, 2010, "Av Canada 104", "Casado");
//        
//        System.out.println("Informe: "+Alumno.toString());
//        System.out.println("Informe: "+Alumno2.toString());
//        
        
        List<Alumno>Informe = new ArrayList<>();
    
        
        try{
          Informe.add(new Alumno("user",1,"Lus",12, 999992, "TTTron89@gmail.com", 74348563,
                "F",11,9,2010, "Av Canada 104", "soltero"));
        Informe.add(new Alumno("user",2,"Luis",13, 999992, "Arron89@gmail.com", 74643563,
                "M", 1, 7, 2003, "Av Proceres", "Soltero"));
         Informe.add(new Alumno("user",3,"Miguel",14, 98562192, "Vegete9@gmail.com", 74612063,
                "M", 1, 8, 2003, "Av Aviacion", "Soltero"));
          
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
          for (Alumno alumno : Informe) {
             System.out.println("Informe "+alumno.toString());
    }
    
    
}}
