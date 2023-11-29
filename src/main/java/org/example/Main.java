package org.example;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;
import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import Option_21091719_VarasVargas.Option_21091719_VarasVargas;
import System_21091719_VarasVargas.System_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        /*
        System_21091719_VarasVargas system = new System_21091719_VarasVargas("Prueba chatbot", 1);

        User_21091719_VarasVargas TDA_usuarios = system.getTDA_Usuario();
        TDA_usuarios.AddUser("user 1", "comun");
        TDA_usuarios.AddUser("user 1", "comun");
        TDA_usuarios.AddUser("user 2", "comun");
        TDA_usuarios.AddUser("user 3", "administrador");
        TDA_usuarios.Login("user 3");
        TDA_usuarios.Login("user 1");
        TDA_usuarios.Logout();

        ChatBot_21091719_VarasVargas ChatBot_1 = new ChatBot_21091719_VarasVargas(1,"Chatbot 1","Bienvenido",1);
        ChatBot_21091719_VarasVargas ChatBot_2 = new ChatBot_21091719_VarasVargas(2,"Chatbot 2","Chao",1);

        system.AddChatBot(ChatBot_1);
        system.AddChatBot(ChatBot_1);
        system.AddChatBot(ChatBot_2);

        ChatBot_21091719_VarasVargas chatbot_Actual = system.getChatBot_ID(1);

        Flow_21091719_VarasVargas flow_1 = new Flow_21091719_VarasVargas(1, "Flujo 1");
        Flow_21091719_VarasVargas flow_2 = new Flow_21091719_VarasVargas(2, "Flujo 2");

        chatbot_Actual.AddFlow(flow_1);
        chatbot_Actual.AddFlow(flow_1);
        chatbot_Actual.AddFlow(flow_2);

        Flow_21091719_VarasVargas flow_actual = chatbot_Actual.getFlow_ID(1);

        Option_21091719_VarasVargas option_1 = new Option_21091719_VarasVargas(1, "Option 1", 1,1);
        Option_21091719_VarasVargas option_2 = new Option_21091719_VarasVargas(2, "Option 2", 1,3);

        option_1.setPalabras_claves("palabra1, palabra2, palabra3");
        System.out.println("aqui validador:  " + option_1.validador_Palabra_Clave("palabra1"));

        flow_actual.AddOption(option_1);
        flow_actual.AddOption(option_2);
        flow_actual.AddOption(option_1);


        System.out.println("Inicial");
        System.out.println("ChatBot actual: "+ system.getChatBot_actual() + "\nFlow actual: "+ system.getFlow_actual());

        system.talk("hola");
        System.out.println("\nDespues de hola");
        System.out.println("ChatBot actual: "+ system.getChatBot_actual() + "\nFlow actual: "+ system.getFlow_actual());

        system.talk("1");
        System.out.println("\nDespues de 1");
        System.out.println("ChatBot actual: "+ system.getChatBot_actual() + "\nFlow actual: "+ system.getFlow_actual());

        system.talk("2");
        System.out.println("\nDespues de 2");
        System.out.println("ChatBot actual: "+ system.getChatBot_actual() + "\nFlow actual: "+ system.getFlow_actual());

        //System.out.println(system.toString());
        */


        boolean estado_system = true;
        String  menu_seleccionado = "registro usuarios";

        Scanner scanner = new Scanner(System.in);
        int eleccion, eleccion_2;


        System_21091719_VarasVargas system = new System_21091719_VarasVargas("Prueba chatot", 1);


        while (estado_system == true){

            switch (menu_seleccionado){

                case "registro usuarios": {

                    boolean estado_registro_usuario = true;

                    do {
                        System.out.println(
                                "~~~ Sistema de chatbot - Inicio~~~\n" +
                                        "Que accion desea realizar\n" +
                                        "1. Login usuario\n" +
                                        "2. Registrar usuario\n" +
                                        "3. Salir de sistema de chatbot" +
                                        "Ingrese su eleccion: "
                        );
                        eleccion = scanner.nextInt();

                        switch (eleccion) {

                            case 1: {
                                scanner.nextLine();

                                System.out.println("Ingrese nombre de usuario: ");
                                String nombre = scanner.nextLine();

                                User_21091719_VarasVargas TDA_usuarios = system.getTDA_Usuario();
                                TDA_usuarios.Login(nombre);

                                if (TDA_usuarios.getTipo_usuario().equals("comun")) {

                                    menu_seleccionado = "menu user comun";
                                    estado_registro_usuario = false;
                                }
                                else if (TDA_usuarios.getTipo_usuario().equals("administrador")) {

                                    menu_seleccionado = "menu user administrador";
                                    estado_registro_usuario = false;

                                } else {
                                    System.out.println("Login fallido");
                                }


                                break;
                            }

                            case 2: {
                                scanner.nextLine();

                                System.out.println("Ingrese nombre de usuario: ");
                                String nombre = scanner.nextLine();

                                System.out.println("Ingrese tipo de usuario \n 1. Comun \n 2. Administrador\n Eleccion: ");
                                String tipo_usuario = scanner.nextLine();

                                if ("1".equals(tipo_usuario)) {
                                    tipo_usuario = "comun";
                                    User_21091719_VarasVargas TDA_usuarios = system.getTDA_Usuario();
                                    TDA_usuarios.AddUser(nombre, tipo_usuario);

                                } else if ("2".equals(tipo_usuario)) {
                                    tipo_usuario = "administrador";
                                    User_21091719_VarasVargas TDA_usuarios = system.getTDA_Usuario();
                                    TDA_usuarios.AddUser(nombre, tipo_usuario);

                                } else {
                                    System.out.println("Usuario no registrado, entrada tipo usuario equivocada");
                                }

                                break;

                            }

                            case 3: {
                                System.out.println("Gracias por usar el sistema de chatbots");
                                System.exit(0);
                            }

                            default: {
                                System.out.println("Opcion invalida.");
                            }

                        }

                    } while (estado_registro_usuario == true);
                }


                case "menu user administrador":{

                    boolean estado_menu_administrador = true;

                    do {
                        System.out.println("~~~ Sistema de chatbot - Menu administrador ~~~" + "\n" +
                                "Bienvenido usuario: " + system.getTDA_Usuario().getUsuario_logeado() + "usted es administrador \n" +
                                "1. Crear chatbot" + "\n" +
                                "2. Modificador chatbot" + "\n" +
                                "3. Interactuar con sistema de chatbot" + "\n" +
                                "4. Visualizar chatbot del sistema" + "\n" +
                                "5. Visualizar todos los chatbots con sus flujos y opciones creadas" + "\n" +
                                "6. Ejecutar simulacion de sistema de chatbot" + "\n" +
                                "7. Salir"
                        );

                        eleccion_2 = scanner.nextInt();


                        switch (eleccion_2) {

                            case 1: {
                                System.out.println("Funcion no implementada");
                            }
                            case 2: {
                                System.out.println("Funcion no implementada");
                            }
                            case 3: {
                                System.out.println("Funcion no implementada");
                            }
                            case 4: {
                                System.out.println("Funcion no implementada");
                            }
                            case 5: {
                                System.out.println("Funcion no implementada");
                            }
                            case 6: {
                                System.out.println("Funcion no implementada");
                            }
                            case 7: {
                                System.out.println("Gracias por usar el sistema de chatbots");
                                System.exit(0);
                            }

                        }

                    }while (estado_menu_administrador == true) ;

                }

                case "menu user comun": {

                    //menu de user comun
                    System.out.println("menu user comun");
                }



            }



        }

        scanner.close();

    }
}


