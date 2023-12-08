package Identificadores_21091719_VarasVargas;

public class Identificadores_21091719_VarasVargas {

    int ID;
    String nombre;

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

    @Override
    public String toString() {
        return "Identificadores_21091719_VarasVargas{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
