package Identificadores_21091719_VarasVargas;

import java.util.Date;

/**
 * Clase la cual heredan las clases, System_21091719_VarasVargas, ChatBot_21091719_VarasVargas,
 * Flow_21091719_VarasVargas, Option_21091719_VarasVargas
 * @author Victor Varas
 */
public class Identificadores_21091719_VarasVargas {

    /**
     * Atributo int, que contiene el ID
     */
    int ID;

    /**
     * Atributo string, que contiene el nombre
     */
    String nombre;

    /**
     * Atributo Date, que contiene la fecha y hora actual
     */
    Date fechaHoraActual = new Date();

    /**
     * <p> Constructor de la clase</p>
     * @param ID
     * @param nombre
     * @return Identificadores_21091719_VarasVargas
     */
    public Identificadores_21091719_VarasVargas(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    /**
     * <p>Funcion getter que retorna ID</p>
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * <p>Funcion getter que retorna nombre</p>
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * <p>Funcion getter que retorna fecha</p>
     * @return fechaHoraActual
     */
    public Date getFechaHoraActual() {
        return fechaHoraActual;
    }

}
