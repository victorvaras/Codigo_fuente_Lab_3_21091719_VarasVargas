package org.example;

import Menu_21091719_VarasVargas.AccionesMenu_21091719_VarasVargas;
import Menu_21091719_VarasVargas.Menu_21091719_VarasVargas;
import System_21091719_VarasVargas.System_21091719_VarasVargas;

import java.util.Random;


/**
 * Main principal, donde se realiza los llamados escenciales para el funcionamiento del programa
 */
public class Main {

    /**
     * <p>main que crea un system, al cual se le carga una serie de chatbots con flujos y options</p>
     * @param args
     */
    public static void main(String[] args) {

        //Se crea nuevo system
        System_21091719_VarasVargas system = new System_21091719_VarasVargas("Chatbots Paradigmas venta de automovil", 1);

        //Objeto con el cual se realizan las accioens del menu
        AccionesMenu_21091719_VarasVargas acciones = new AccionesMenu_21091719_VarasVargas();

        //Se cargan elementos a system
        acciones.Cargar_system(system);

        //Se ejecuta el menu
        Menu_21091719_VarasVargas ejecutar_Menu = new Menu_21091719_VarasVargas();
        ejecutar_Menu.Menu(system);




    }

}





