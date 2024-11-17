package aplicacion;

import interfaz.Interfaz;

public class Principal {
    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();

        if (args.length == 0) {
            System.out.println("Use 'help' para ver los comandos disponibles.");
            return;
        }

        String comando = String.join(" ", args);
        String resultado = interfaz.procesarPeticion(comando);
        System.out.println(resultado);
    }
}
