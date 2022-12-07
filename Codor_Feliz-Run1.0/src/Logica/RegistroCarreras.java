package Logica;

import java.util.ArrayList;

public class RegistroCarreras {

    private ArrayList<Carrera> carreras;
    private static RegistroCarreras registro;
    private final ArchivosCarrera archivos;

    private RegistroCarreras() {
        carreras = new ArrayList();
        archivos = new ArchivosCarrera();

    }

    public static RegistroCarreras obtenerInstancia() {
        return registro == null ? registro = new RegistroCarreras() : registro;
    }

    public void agregar(Carrera carrera) {

        if (!carreras.contains(carrera)) {
            Carrera ptr = new Carrera(carrera.id, carrera.fecha);
            ptr.setCodornices(carrera.codornices);
            carreras.add(ptr);
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
        archivos.guardar(carreras);
    }

    public void cargar() {
        carreras = archivos.leerArchivos();
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        for (Carrera carrera : carreras) {
            s.append(String.format("%s%n", carrera.toString()));
        }

        return s.toString();
    }

    public boolean existe(int id) {
        boolean resultado = false;

        ArrayList<Carrera> carreraptr = carreras;
        for (Carrera carrera : carreraptr) {
            if (carrera.getId() == id) {
                resultado = true;
            }
        }

        return resultado;
    }
}
