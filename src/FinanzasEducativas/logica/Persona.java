package FinanzasEducativas.logica;


public class Persona {
    
    private int id_persona;
    private String nombres;
    private String celpersona;
    
    public Persona(){
    }

    public Persona(int id_persona, String nombres, String celpersona) {
        this.id_persona = id_persona;
        this.nombres = nombres;
        this.celpersona = celpersona;
    }

    public int getId_persona() {
        return id_persona;
    }

    public String getNombres() {
        return nombres;
    }

    public String getCelpersona() {
        return celpersona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setCelpersona(String celpersona) {
        this.celpersona = celpersona;
    }
    
 
    
}
