package Logica;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Carrera {

    int id;
    Date fecha;
    ArrayList<Codorniz> codornices;

    public Carrera(int id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
        codornices = new ArrayList<>();
    }

    public Carrera() {
        this(0, new Date());
    }

    public void agregar(Codorniz codor) {
        codornices.add(codor);
    }

    public void eliminar(int id) {
        codornices.remove(id);
    }

    public Codorniz obtener(int id) {
        return (Codorniz) codornices.get(id);
    }

    public List listarCodornices() {
        return codornices;
    }

    public void ordenar() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Codorniz> getCodornices() {
        return codornices;
    }

    public void setCodornices(ArrayList<Codorniz> codornices) {
        this.codornices = codornices;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", fecha=" + fecha + ", codornices=%n" + codornices + '}';
    }

}
