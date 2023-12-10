package Menu_21091719_VarasVargas;

import ChatBot_21091719_VarasVargas.ChatBot_21091719_VarasVargas;
import Flow_21091719_VarasVargas.Flow_21091719_VarasVargas;
import Option_21091719_VarasVargas.Option_21091719_VarasVargas;
import System_21091719_VarasVargas.System_21091719_VarasVargas;

import java.util.Scanner;

public class Menu_21091719_VarasVargas {



    public void Menu(System_21091719_VarasVargas system){
        boolean estado_system = true;
        String  menu_seleccionado = "registro usuarios";

        AccionesMenu_21091719_VarasVargas Acciones_menu = new AccionesMenu_21091719_VarasVargas();




        Scanner scanner = new Scanner(System.in);
        String eleccion;

        //menu_seleccionado =  "menu user administrador";

        while (estado_system == true){

            switch (menu_seleccionado){

                case "registro usuarios": {

                    menu_seleccionado = Acciones_menu.Registro_usuarios(system);
                    break;
                }


                case "menu user administrador":{

                    boolean estado_menu_administrador = true;

                    do {
                        System.out.println("\n\n~~~ Sistema de chatbot - Menu administrador ~~~" + "\n" +
                                "Bienvenido usuario: " + system.getTDA_Usuario().getUsuario_logeado() + " es administrador \n" +
                                "Que accion desea realizar" + "\n" +
                                " 1. Crear chatbot" + "\n" +
                                " 2. Modificador chatbot" + "\n" +
                                " 3. Interactuar con sistema de chatbot" + "\n" +
                                " 4. Visualizar chatbot del sistema" + "\n" +
                                " 5. Visualizar todos los chatbots con sus flujos y opciones creadas" + "\n" +
                                " 6. Ejecutar simulacion de sistema de chatbot" + "\n" +
                                " 7. ChatHistory" + "\n" +
                                " 8. Desloguear usuario" + "\n"+
                                " 9. Salir"
                        );

                        eleccion = scanner.nextLine();

                        switch (eleccion) {

                            case "1": {

                                boolean Validacion_creacion_chatbot;
                                ChatBot_21091719_VarasVargas new_Chatbot = Acciones_menu.Menu_Crear_Chatbot();

                                Validacion_creacion_chatbot = system.AddChatBot(new_Chatbot);

                                if( Validacion_creacion_chatbot == true){

                                    boolean validador_ciclo_flujo = true;

                                    while (validador_ciclo_flujo == true){

                                        System.out.println("\n¿Desea crear un nuevo flujo para este chatbot?\n" +
                                                " 1. Si\n 2. No");

                                        int accion_flujo = scanner.nextInt();
                                        scanner.nextLine();

                                        if (accion_flujo == 1){
                                            Flow_21091719_VarasVargas new_flow = Acciones_menu.Menu_Crear_Flow();
                                            boolean Validacion_creacion_flow = new_Chatbot.AddFlow(new_flow);

                                            //Se crea flow con exito
                                            if ( Validacion_creacion_flow == true){

                                                System.out.println("\n¿Desea crear un nuevo options para este flujo?\n" +
                                                        " 1. Si \n 2. No");

                                                int accion_option = scanner.nextInt();
                                                scanner.nextLine();

                                                if (accion_option == 1){

                                                    while (accion_option == 1){

                                                        Option_21091719_VarasVargas new_option = Acciones_menu.Menu_Crear_Option();

                                                        new_flow.AddOption(new_option);


                                                        System.out.println("Desea agregar un nuevo option a flow actual\n 1. Si \n2.No");
                                                        accion_option = scanner.nextInt();
                                                        scanner.nextLine();
                                                    }

                                                }

                                            }

                                        }
                                        //No se agrega nuevo flujo
                                        else {
                                            validador_ciclo_flujo = false;
                                        }
                                    }

                                }

                                break;
                            }

                            case "2": {
                                //System.out.println("");
                                System.out.println("Siguientes Chatbot disponibles para modificar: ");
                                System.out.println(system.nombre_Chatbots());
                                System.out.println("Indique ID de chatbot a modificar: ");


                                int ID_chatbot = scanner.nextInt();
                                scanner.nextLine();

                                ChatBot_21091719_VarasVargas Chatbot_modificar = system.getChatBot_ID(ID_chatbot);

                                System.out.println("Que accion quiere realizar \n1. Agregar flujo a chatbot actual \n2. Ingresar a un flujo");
                                int accion = scanner.nextInt();
                                scanner.nextLine();

                                if (accion == 1){
                                    Flow_21091719_VarasVargas new_flow = Acciones_menu.Menu_Crear_Flow();
                                    Chatbot_modificar.AddFlow(new_flow);
                                }
                                else if (accion == 2){

                                    System.out.println("Siguientes flows disponibles para modificar: ");
                                    System.out.println(Chatbot_modificar.nombre_Flows());
                                    System.out.println("Indique ID de flow a modificar: ");

                                    int ID_flow = scanner.nextInt();
                                    scanner.nextLine();

                                    Flow_21091719_VarasVargas flow_modificar = Chatbot_modificar.getFlow_ID(ID_flow);
                                    Option_21091719_VarasVargas new_option = Acciones_menu.Menu_Crear_Option();

                                    flow_modificar.AddOption(new_option);

                                }

                                break;

                            }

                            case "3": {
                                System.out.println("Interaccion entre bots.");
                                Acciones_menu.Menu_talk(system);

                                break;
                            }

                            case "4": {
                                System.out.println("Chatbot en sistema son:");
                                System.out.println(system.nombre_Chatbots());
                                break;
                            }

                            case "5": {
                                System.out.println(system.toString());
                                break;
                            }

                            case "6": {
                                System.out.println("Funcion no implementada");
                                break;
                            }

                            case "7":{
                                System.out.println("Chat history del sistema");
                                System.out.println(system.getChatHistory());
                                break;
                            }

                            case "8": {
                                system.getTDA_Usuario().Logout();
                                menu_seleccionado= "registro usuarios";
                                estado_menu_administrador= false;
                                break;
                            }

                            case "9": {
                                System.out.println("Gracias por usar el sistema de chatbots");
                                System.exit(0);
                            }

                            default: {
                                System.out.println("Opcion invalida.");
                                break;
                            }

                        }

                    }while (estado_menu_administrador == true) ;
                    break;

                }

                case "menu user comun": {

                    boolean estado_menu_comun= true;

                    do {
                        System.out.println("\n\n~~~ Sistema de chatbot - Menu usuario comun ~~~" + "\n" +
                                "Bienvenido usuario: " + system.getTDA_Usuario().getUsuario_logeado() + " es usuario comun \n" +
                                "Que accion desea realizar" + "\n" +
                                " 1. Interactuar con sistema de chatbot" + "\n" +
                                " 2. Visualizar chatbot del sistema" + "\n" +
                                " 3. Visualizar todos los chatbots con sus flujos y opciones creadas" + "\n" +
                                " 4. Ejecutar simulacion de sistema de chatbot" + "\n" +
                                " 5. ChatHistory" + "\n" +
                                " 6. Desloguear usuario" + "\n" +
                                " 7. Salir"
                        );

                        eleccion = scanner.nextLine();

                        switch (eleccion) {

                            case "1": {
                                System.out.println("Interaccion entre bots.");
                                Acciones_menu.Menu_talk(system);

                                break;
                            }

                            case "2": {
                                System.out.println("Chatbot en sistema son:");
                                System.out.println(system.nombre_Chatbots());
                                break;
                            }

                            case "3": {
                                System.out.println(system.toString());
                                break;
                            }

                            case "4": {
                                System.out.println("Funcion no implementada");
                                break;
                            }

                            case "5":{
                                System.out.println("Chat history del sistema");
                                System.out.println(system.getChatHistory());
                                break;
                            }

                            case "6": {
                                system.getTDA_Usuario().Logout();
                                menu_seleccionado= "registro usuarios";
                                estado_menu_comun= false;
                                break;
                            }

                            case "7": {
                                System.out.println("Gracias por usar el sistema de chatbots");
                                System.exit(0);
                            }

                            default: {
                                System.out.println("Opcion invalida.");
                                break;
                            }


                        }

                    }while (estado_menu_comun==true);
                    break;
                }



            }



        }

        scanner.close();
    }




}
