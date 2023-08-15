package proyecto1p;

public class Loggs {
 //atributo
 String Gb_Registro,Gb_Ganador;
 
//constructor    
public Loggs(String Registro,String ganador){
    Gb_Registro=Registro;
    
    Gb_Ganador=ganador;
    
}
    public String getGb_Ganador() {
        return Gb_Ganador;
    }


    public String getGb_Registro() {
        return Gb_Registro;
    }


    public void setGb_Registro(String Gb_Registro) {
        this.Gb_Registro = Gb_Registro;
    }

    public void setGb_Ganador(String Gb_Ganador) {
        this.Gb_Ganador = Gb_Ganador;
    }
  
}
