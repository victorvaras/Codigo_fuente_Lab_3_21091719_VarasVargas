package Menu_21091719_VarasVargas;

import System_21091719_VarasVargas.System_21091719_VarasVargas;
import User_21091719_VarasVargas.User_21091719_VarasVargas;

import java.util.Scanner;

public class AccionesMenu_21091719_VarasVargas {
    //public System_21091719_VarasVargas menu_system;


    public void  Cargar_system(System_21091719_VarasVargas sym){

        User_21091719_VarasVargas TDA_usuarioss = sym.getTDA_Usuario();
        TDA_usuarioss.AddUser("user 1", "administrador");
        TDA_usuarioss.Login("user 1");


    }


    public void Registro_usuarios(System_21091719_VarasVargas system){
        boolean estado_registro_usuario = true;
        Scanner scanner = new Scanner(System.in);
        int eleccion;

        do{
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



}
