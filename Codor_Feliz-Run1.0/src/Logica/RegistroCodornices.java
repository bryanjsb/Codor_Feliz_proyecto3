package Logica;

import java.util.ArrayList;

public class RegistroCodornices {

    private final ArrayList<Codorniz> codornices;
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

}
