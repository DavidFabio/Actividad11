package dominio;

import java.util.ArrayList;

public class Libreta {
    private ArrayList<Contacto> contactos;

    // Constructor
    public Libreta() {
        this.contactos = new ArrayList<>();
    }

    // Método para añadir un contacto
    public void añadirContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    // Método para mostrar todos los contactos
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Contacto contacto : contactos) {
            sb.append(contacto).append("\n");
        }
        return sb.toString();
    }

    // Métodos para borrar y modificar contactos (Ejercicio 34)
    public boolean borrarContacto(String nombre) {
        return contactos.removeIf(c -> c.getNombre().equalsIgnoreCase(nombre));
    }

    public boolean modificarContacto(String nombre, String nuevoTelefono) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                contacto.setNumeroDeTelefono(nuevoTelefono);
                return true;
            }
        }
        return false;
    }
}
