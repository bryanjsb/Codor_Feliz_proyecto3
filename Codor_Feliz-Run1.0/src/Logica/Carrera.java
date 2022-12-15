package Logica;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

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

        if (codornices.size() <= 5) {
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
        return formatoArchivo();
      

    }

    public boolean existe(int id) {
        boolean resultado = false;

        ArrayList<Codorniz> codors = codornices;
        for (Codorniz codor : codors) {
            if (codor.getId() == id) {
                resultado = true;
            }
        }

        return resultado;
    }

    public boolean jugadoresCompletos() {
        return codornices.size() == 5;
    }

    //https://masqueprogramar.wordpress.com/2019/02/05/desordenar-elementos-array/
    public void desordenar() {
        Collections.shuffle(codornices);
    }
    
    public String formatoArchivo(){
        StringBuilder s = new StringBuilder();
        s.append(String.format("%d,",id));
      
        int contador = 1;
       for(Codorniz codor : this.codornices){
        
         if(contador == 5){
              s.append(String.format("%d",codor.getId()));
         }else{
              s.append(String.format("%d,",codor.getId()));
         }
         contador++;
         
       }   
       s.append(String.format("%n"));    
           
        return s.toString();
        
    }
    public String mostrarInfo(){
          StringBuilder s = new StringBuilder();
        s.append(String.format("Id Carrera: %s%n", id));
        s.append(String.format("Fecha: %s%n", fecha));
        for (Codorniz codor : codornices) {
            s.append(String.format("%s", codor.toString()));
        }
        s.append(String.format("%n"));
        return s.toString();
    }
}


