package Logica;

import java.util.ArrayList;

public class RegistroCarreras {

    private final ArrayList<Carrera> carreras;
    private static RegistroCarreras registro;
    private final Archivos archivos;

    private RegistroCarreras() {
        carreras = new ArrayList();
        archivos = new Archivos();

    }

    public static RegistroCarreras obtenerInstancia() {
        return registro == null ? registro = new RegistroCarreras() : registro;
    }

    public void agregar(Carrera carrera) {

        if (!carreras.contains(carrera)) {
            carreras.add(carrera);
        }

    }

    public void eliminar(Carrera carrera) {
        carreras.remove(carrera);
    }

    public Carrera obtener(int id) {
        Carrera ptr = null;

        for (Carrera carrera : carreras) {
            if (carrera.getId() == id) {
                ptr = carrera;
            }
        }

        return ptr;
    }

    public ArrayList<Carrera> listar() {
        return carreras;
    }

    public void guardar() {
        //archivos.guardar(carreras);
    }

    public void cargar() {
        // carreras = archivos.leerArchivos();
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append(String.format("%s", carreras));

        s.append(String.format("%n"));

        return s.toString();
    }
}
