package Logica;

import java.util.ArrayList;

public class RegistroCodornices {

    private ArrayList<Codorniz> codornices;
    private static RegistroCodornices registro;
    private final Archivos archivos;

    private RegistroCodornices() {
        codornices = new ArrayList();
        archivos = new Archivos();

    }

    public static RegistroCodornices obtenerInstancia() {
        return registro == null ? registro = new RegistroCodornices() : registro;
    }

    public void agregar(Codorniz codor) {

        if (!codornices.contains(codor)) {
            codornices.add(codor);
        }

    }

    public void eliminar(Codorniz codor) {
        codornices.remove(codor);
    }

    public Codorniz obtener(int id) {
        Codorniz ptr = null;

        for (Codorniz codor : codornices) {
            if (codor.getEdad() == id) {
                ptr = codor;
            }
        }

        return ptr;
    }

    public ArrayList<Codorniz> listar() {
        return codornices;
    }

    public void guardar() {
        archivos.guardar(codornices);
    }

    public void cargar() {
        codornices = archivos.leerArchivos();
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append(String.format("%s", codornices));

        s.append(String.format("%n"));

        return s.toString();
    }

}
