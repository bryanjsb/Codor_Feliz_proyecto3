package Logica;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Carrera {
    int id;
    Date fecha;
    ArrayList<Codorniz> codornices;
    
    Carrera(int id, Date fecha){
        this.id = id;
        this.fecha = fecha;
        codornices = new ArrayList<>();
    }
    
    public void agregar(Codorniz codor){
        codornices.add(codor);
    }
    
    public void eliminar(int id){
        codornices.remove(id);
    }
    
    public Codorniz obtener(int id){
        return (Codorniz)codornices.get(id);
    }
    
    public List listarCodornices(){
        return codornices;
    }
    
    public void ordenar(){
        
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", fecha=" + fecha + ", codornices=%n" + codornices + '}';
    }
    
    
}
