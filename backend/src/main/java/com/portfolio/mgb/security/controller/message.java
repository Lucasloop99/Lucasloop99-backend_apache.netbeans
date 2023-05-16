package com.portfolio.mgb.Security.Controller;


public class message {
    private String mensaje;
    
    //Constructor
    public message(){
    }
    
    public message(String mensaje){
        this.mensaje = mensaje;
    }
    //Getter & Setter

    public String getMessage() {
        return mensaje;
    }

    public void setMessage(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
