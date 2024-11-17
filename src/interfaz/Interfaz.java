package interfaz;

import dominio.Contacto;
import dominio.Libreta;

public class Interfaz {
    private Libreta libreta;

    public Interfaz() {
        this.libreta = new Libreta();
    }

    public String procesarPeticion(String entrada) {
        String[] partes = entrada.split(" ", 3);

        switch (partes[0].toLowerCase()) {
            case "add":
                if (partes.length == 3) {
                    libreta.añadirContacto(new Contacto(partes[1], partes[2]));
                    return "Contacto añadido: " + partes[1];
                }
                return "Error: Formato incorrecto. Use: add <nombre> <telefono>";

            case "list":
                return libreta.toString();

            case "delete":
                if (partes.length == 2) {
                    return libreta.borrarContacto(partes[1]) ? "Contacto eliminado." : "Contacto no encontrado.";
                }
                return "Error: Formato incorrecto. Use: delete <nombre>";

            case "update":
                if (partes.length == 3) {
                    return libreta.modificarContacto(partes[1], partes[2]) ? 
                        "Contacto actualizado." : "Contacto no encontrado.";
                }
                return "Error: Formato incorrecto. Use: update <nombre> <telefono>";

            default:
                return "Comando no reconocido. Use 'help' para ver los comandos disponibles.";
        }
    }
}

