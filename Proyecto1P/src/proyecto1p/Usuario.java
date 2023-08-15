package proyecto1p;


public class Usuario {
    //atributos
    private String username;
    private String password;
    int puntos=0,partidajugador1=0,partidajugador2=0; 
    //partidaVillanos = partidajugador1
    //partidaheroes = partidajugador2
    
    //constructor
    public Usuario(String username,String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //   

    public void setpuntos(int puntos){
    
        this.puntos=puntos;
    } 
    
    public int getpuntos(){
    
        return this.puntos;  
    
    }
    public void setpartidajugador1(int partidajugador1){
    
        this.partidajugador1=partidajugador1;   
    
    } 
    public int getpartidajugador1(){
    
        return this.partidajugador1;  
    
    }
    public void setpartidajugador2(int partidajugador2){
    
        this.partidajugador2=partidajugador2;   
    
    } 
    public int getpartidajugador2(){
    
        return this.partidajugador2;  
    
    }
    
}
