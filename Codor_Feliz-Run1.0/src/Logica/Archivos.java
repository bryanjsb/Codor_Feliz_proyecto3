package Logica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {

    private String rutaRelativa = "src/Datos/";
    private final String extension = ".txt";

    public Archivos() {
    }

    //https://www.ecodeup.com/como-escribir-y-leer-archivos-de-texto-plano-en-java/
    void guardar(String nombreArchivo, Codorniz codor) {

        rutaRelativa += nombreArchivo + extension;
        FileWriter f = null;

        BufferedWriter bfwriter;
        try {
            f = new FileWriter(rutaRelativa);
            bfwriter = new BufferedWriter(f);
            bfwriter.write(codor.toString());
            bfwriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (f != null) {
                try {//cierra el flujo principal
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
