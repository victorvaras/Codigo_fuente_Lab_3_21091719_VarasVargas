package Identificadores_21091719_VarasVargas;

import java.util.Date;

public class Identificadores_21091719_VarasVargas {

    int ID;
    String nombre;

    Date fechaHoraActual = new Date();

    public Identificadores_21091719_VarasVargas(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaHoraActual() {
        return fechaHoraActual;
    }

    @Override
    public String toString() {
        return "Identificadores_21091719_VarasVargas{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
