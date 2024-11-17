package dominio;

public class Contacto {
    private String nombre;
    private String numeroDeTelefono;

    // Constructor sin parámetros
    public Contacto() {}

    // Constructor con parámetros
    public Contacto(String nombre, String numeroDeTelefono) {
        this.nombre = nombre;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + numeroDeTelefono;
    }
}
