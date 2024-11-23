package MisClases;



public class Alumno extends Datos_Personales implements Nivel_de_Acceso{
    
 private   String NombredeAcceso;
  private  int IdniveldeAcceso;
  
    public Alumno() {
        
    }

    public Alumno(String NombredeAcceso, int IdniveldeAcceso, 
            String NombreCompleto, int edad, int telefono,
            String gmailPersonal, int NroDNI, String Genero,
            int dia, int mes, int año, String Direccion, String EstadoCivil) 
    
    {
        super(NombreCompleto, edad, telefono, gmailPersonal,
                NroDNI, Genero, dia, mes, año, Direccion, EstadoCivil);
         
        this.setNombredeAcceso(NombredeAcceso);
        this.setIdniveldeAcceso(IdniveldeAcceso);
        
        
    }

    public Alumno(String NombredeAcceso, int IdniveldeAcceso) {
      this.NombredeAcceso=NombredeAcceso;
        this.IdniveldeAcceso=IdniveldeAcceso;
    }

    
    public String getNombredeAcceso() {
        
        return NombredeAcceso;
    }

    public int getIdniveldeAcceso() {
        return IdniveldeAcceso;
    }

    public void setNombredeAcceso(String NombredeAcceso) {
        if(NombredeAcceso.equalsIgnoreCase("User")) {
            this.NombredeAcceso=NombredeAcceso;
            
            
        } else { throw new IllegalArgumentException
        ("Error: Nombre de Acceso Incorrecto");
            
        }
        
       
    }

    public void setIdniveldeAcceso(int IdniveldeAcceso) {
        if (IdniveldeAcceso>0) {
          // Asumiendo que los niveles válidos son 
           this.IdniveldeAcceso = IdniveldeAcceso; }
      else { throw new IllegalArgumentException
        ("Error: Id nivel de acceso Incorrecto"); }
        
    }
                  
    
  @Override
    public String nivelacceso(String  NomAcceso, int nivelAcceso) {
    NomAcceso= NombredeAcceso;
    nivelAcceso= IdniveldeAcceso;
        
        return "Uuario: "+NombredeAcceso+" ,"+
                "Nivel de Acceso: "+IdniveldeAcceso;
    } 
 
 

   

    @Override
    public String toString() {
        return ""+nivelacceso(NombredeAcceso, IdniveldeAcceso)+
                " "+super.toString();   }

    

  

   
   
 
 
 

  
     
            
        
            
        
    
    
    
}

    
   
