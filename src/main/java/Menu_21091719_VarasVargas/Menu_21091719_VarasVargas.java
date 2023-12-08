package Menu_21091719_VarasVargas;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;
import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import Option_21091719_VarasVargas.Option_21091719_VarasVargas;
import System_21091719_VarasVargas.System_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.Scanner;

public class Menu_21091719_VarasVargas {



    public void Menu(System_21091719_VarasVargas system){
        boolean estado_system = true;
        //String  menu_seleccionado = "registro usuarios";
        StringBuilder menu_seleccionado = new StringBuilder("hola");

        Scanner scanner = new Scanner(System.in);
        int eleccion, eleccion_2;

        //menu_seleccionado =  "menu user administrador";

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
                                        "3. Salir de sistema de chatbot" + "\n"+
                                        "Ingrese su eleccion: "
                        );
                        eleccion = scanner.nextInt();
                        scanner.nextLine();

                        switch (eleccion) {

                            case 1: {


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
                                "7. Desloguear usuario" + "\n"+
                                "8. Salir"
                        );

                        eleccion_2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (eleccion_2) {

                            case 1: {
                                System.out.println("~~~ Creacion de nuevo ChatBot ~~~");

                                System.out.println("Ingrese ID chatbot");
                                int ID = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Ingrese Nombre chatbot");
                                String Nombre = scanner.nextLine();

                                System.out.println("Ingrese mensaje de chatbot");
                                String Mensaje = scanner.nextLine();

                                System.out.println("Ingrese star flow");
                                int Star_flow = scanner.nextInt();
                                scanner.nextLine();

                                ChatBot_21091719_VarasVargas new_ChatBot= new ChatBot_21091719_VarasVargas(ID,Nombre,Mensaje,Star_flow);
                                system.AddChatBot(new_ChatBot);

                                //Aqui prueba de system
                                System.out.println(system.toString());

                                System.out.println("¿Desea crear un nuevo flujo para este chatbot?\n" +
                                        "1. Si\n2. No");
                                System.out.println("Ingrese su eleccion: ");

                                int accion_flujo = scanner.nextInt();
                                scanner.nextLine();

                                while (accion_flujo == 1){

                                    System.out.println("Creacion nuevo flow para chatbot actual");

                                    System.out.println("Ingrese ID");
                                    ID = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.println("Ingrese nombre");
                                    Nombre = scanner.nextLine();

                                    Flow_21091719_VarasVargas new_flow= new Flow_21091719_VarasVargas(ID, Nombre);
                                    new_ChatBot.AddFlow(new_flow);

                                    //Aqui prueba de system
                                    System.out.println(system.toString());

                                    System.out.println("¿Desea crear un nuevo options para este flujo?\n" +
                                            "1. Si \n2. No");

                                    int accion_option = scanner.nextInt();
                                    scanner.nextLine();

                                    while (accion_option == 1){
                                        System.out.println("Creacion nuevo option para chatbot actual");

                                        System.out.println("Ingrese ID");
                                        ID = scanner.nextInt();
                                        scanner.nextLine();

                                        System.out.println("Ingrese mensaje de option");
                                        Mensaje = scanner.nextLine();

                                        System.out.println("Ingrese inicial chatbot");
                                        int Inicial_chatbot = scanner.nextInt();
                                        scanner.nextLine();

                                        System.out.println("Ingrese inicial flujo");
                                        int Inicial_flujo = scanner.nextInt();
                                        scanner.nextLine();

                                        Option_21091719_VarasVargas new_option = new Option_21091719_VarasVargas(ID, Mensaje, Inicial_chatbot,Inicial_flujo);
                                        new_flow.AddOption(new_option);

                                        System.out.println("Desea agregar palabras claves a option\n 1. Si \n2.No");
                                        int eleccion_palabras_claves = scanner.nextInt();
                                        scanner.nextLine();

                                        if (eleccion_palabras_claves == 1){
                                            System.out.println("Ingrese las palabras claves separadas por comas (,), tantas como desee");

                                            String palabras_claves = scanner.nextLine();
                                            new_option.setPalabras_claves(palabras_claves);
                                        }

                                        //Aqui prueba de system
                                        System.out.println(system.toString());

                                        System.out.println("Desea agregar un nuevo option a flow actual\n 1. Si \n2.No");
                                        accion_option = scanner.nextInt();
                                        scanner.nextLine();
                                    }

                                    System.out.println("Desea agregar un nuevo flow a chatbot actual\n 1. Si \n2.No");
                                    accion_flujo = scanner.nextInt();
                                    scanner.nextLine();
                                }

                                break;

                            }

                            case 2: {
                                //System.out.println("");
                                System.out.println("Indique ID de chatbot a modificar: ");
                                int ID_chatbot = scanner.nextInt();
                                scanner.nextLine();
                                ChatBot_21091719_VarasVargas Chatbot_modificar = system.getChatBot_ID(ID_chatbot);

                                System.out.println("Que accion quiere realizar \n1. Agregar flujo a chatbot actual \n2. Ingresar a un flujo");
                                int accion = scanner.nextInt();
                                scanner.nextLine();

                                if (accion == 1){

                                }

                                break;

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
                                system.getTDA_Usuario().Logout();
                                menu_seleccionado= "registro usuarios";
                                estado_menu_administrador= false;
                                break;
                            }
                            case 8: {
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
