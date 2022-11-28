package Logica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

public class Archivos {

    private final String rutaRelativaCodornices = "src/Datos/Codornices.txt";

    public Archivos() {
    }

    //https://www.ecodeup.com/como-escribir-y-leer-archivos-de-texto-plano-en-java/
    void guardar(ArrayList codornices) {

        FileWriter f = null;

        BufferedWriter bfwriter;
        try {
            f = new FileWriter(rutaRelativaCodornices);
            bfwriter = new BufferedWriter(f);

            codornices.forEach((Object codor) -> {
                try {
                    bfwriter.write(codor.toString());
                } catch (IOException ex) {
                    Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
                }
            });

            
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public ArrayList<Codorniz> leerArchivos() {
        File file = new File(rutaRelativaCodornices);
        ArrayList<Codorniz> codornices = new ArrayList();
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                // el objeto scanner lee linea a linea desde el archivo
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                //se usa una expresión regular
                //que valida que antes o despues de una coma (,) exista cualquier cosa
                //parte la cadena recibida cada vez que encuentre una coma
                delimitar.useDelimiter("\\s*,\\s*");
                Codorniz codor = new Codorniz();
                codor.setId(delimitar.nextInt());
                codor.setNombre(delimitar.next());
                codor.setEdad(delimitar.nextInt());
                codor.setEspecie(delimitar.next());
                codor.setPeso(delimitar.nextDouble());
                codor.setDueño(delimitar.next());
                codor.setTiempo(new Date());
                codornices.add(codor);
            }

            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return codornices;
    }

}
