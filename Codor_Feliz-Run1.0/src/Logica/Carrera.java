package Logica;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Carrera {

    int id;
    Date fecha;
    ArrayList<Codorniz> codornices;
    int cantidad =0;
    public Carrera(int id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
        codornices = new ArrayList<>();
    }

    public Carrera() {
        this(0, new Date());
    }

    public void agregar(Codorniz codor) {
        ++cantidad;
        
        if(cantidad<=5){
        codornices.add(codor);
        }
        
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    

    public ArrayList<Codorniz> getCodornices() {
        return codornices;
    }

    public void setCodornices(ArrayList<Codorniz> codornices) {
        this.codornices = codornices;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", fecha=" + fecha + "%n codornices=%n" + codornices + '}';
    }

    
    public boolean existe(int id){
        boolean resultado = false;

        ArrayList<Codorniz> codors = codornices;
        for (Codorniz codor : codors) {
            if (codor.getId() == id) {
                resultado = true;
            }
        }

        return resultado;
    }
    
    public boolean jugadoresCompletos(){
        return cantidad > 5;
    }
}
