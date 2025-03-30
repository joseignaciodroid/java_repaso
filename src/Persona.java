public class Persona {


    // Atributos
    private String dni;
    private String nombre;
    private int edad;
    private String telefono;



    // Constructor
    public Persona(String dni,String nombre, int edad, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    } // constructor




    @Override
    public java.lang.String toString() {
        return "Persona{ " +
                " dni = " + dni +
                " nombre = " + nombre +
                " edad = " + Integer.toString(edad) +
                " telefono = " + telefono +
                " }";
    }

    // Geters y Seters
    public String getDni() { return dni; }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDni(String dni) { this.dni = dni; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
} // class
