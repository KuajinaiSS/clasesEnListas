public class Cliente {

    private String nombre;
    private String rut;
    private String direccion;
    private int pin;



    // crear constructor
    public Cliente(String nombre, String rut, String direccion, int pin) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.pin = pin;
    }


    public Cliente(String nombre, String rut, int pin) {
        this.nombre = nombre;
        this.rut = rut;
        this.pin = pin;
    }
    


    // gets y sets (autogenerado)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pinNuevo) {
        this.pin = pinNuevo;
    }



    
    

}
