package org.example;

import System_21091719_VarasVargas.System_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        System_21091719_VarasVargas system = new System_21091719_VarasVargas("Prueba chatbot", 0);

        User_21091719_VarasVargas TDA_usuarios = system.getTDA_Usuario();
        TDA_usuarios.AddUser("user 1", "comun");
        TDA_usuarios.AddUser("user 1", "comun");
        TDA_usuarios.AddUser("user 2", "comun");
        TDA_usuarios.AddUser("user 3", "administrador");
        TDA_usuarios.Login("user 3");
        TDA_usuarios.Login("user 1");
        TDA_usuarios.Logout();





        String salida = system.toString();
        System.out.println(salida);

    }
}

/*
while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione una opción:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la Opción 1");
                    // Lógica de la Opción 1
                    break;
                case 2:
                    System.out.println("Has seleccionado la Opción 2");
                    // Lógica de la Opción 2
                    break;
                case 3:
                    System.out.println("Has seleccionado la Opción 3");
                    // Lógica de la Opción 3
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
 */
