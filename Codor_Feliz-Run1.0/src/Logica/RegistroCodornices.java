package Logica;

import java.util.ArrayList;

public class RegistroCodornices {

    private ArrayList<Codorniz> codornices;
    private static RegistroCodornices registro;
    private final ArchivosCodorniz archivos;

    private RegistroCodornices() {
        codornices = new ArrayList();
        archivos = new ArchivosCodorniz();

    }

    public static RegistroCodornices obtenerInstancia() {
        return registro == null ? registro = new RegistroCodornices() : registro;
    }

    public void agregar(Codorniz codor) {

        if (!codornices.contains(codor)) {
            codornices.add(codor);
        }

    }

    public void eliminar(int id) {
        Codorniz codor = this.obtener(id);
        codornices.remove(codor);

     
    }

    public Codorniz obtener(int id) {
        Codorniz ptr = null;

        ArrayList<Codorniz> codors = codornices;
        for (Codorniz codor : codors) {
            if (codor.getId() == id) {
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

    public void actualizar(Codorniz codorPtr) {

        for (Codorniz codor : codornices) {
            if (codor.getId() == codorPtr.getId()) {
                codor.setDueño(codorPtr.getDueño());
                codor.setNombre(codorPtr.getNombre());
                codor.setEdad(codorPtr.getEdad());
                codor.setEspecie(codorPtr.getEspecie());
                codor.setPeso(codorPtr.getPeso());
            }
        }

    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append(String.format("%s", codornices));

        s.append(String.format("%n"));

        return s.toString();
    }

}
