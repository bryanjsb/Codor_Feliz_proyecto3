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

public class ArchivosCarrera {

    private final String rutaRelativaCarreras = "src/Datos/carreras.txt";

    public ArchivosCarrera() {
    }

    //https://www.ecodeup.com/como-escribir-y-leer-archivos-de-texto-plano-en-java/
    void guardar(ArrayList<Carrera> carreras) {

        FileWriter f = null;

        BufferedWriter bfwriter;
        try {
            f = new FileWriter(rutaRelativaCarreras);
            bfwriter = new BufferedWriter(f);

            carreras.forEach((Object carrrera) -> {
                try {
                    bfwriter.write(carrrera.toString());
                } catch (IOException ex) {
                    Logger.getLogger(ArchivosCarrera.class.getName()).log(Level.SEVERE, null, ex);
                }
            });

            bfwriter.close();

        } catch (IOException ex) {
            Logger.getLogger(ArchivosCarrera.class.getName()).log(Level.SEVERE, null, ex);
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

    public ArrayList<Carrera> leerArchivos() {
        File file = new File(rutaRelativaCarreras);
        ArrayList<Carrera> carreras = new ArrayList();
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                // el objeto scanner lee linea a linea desde el archivo
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                //se usa una expresión regular
                //que valida que antes o despues de una coma (,) exista cualquier cosa
                //parte la cadena recibida cada vez que encuentre una coma
                delimitar.useDelimiter("\\s*,\\s*");
                Carrera carrera = new Carrera();
                carrera.setId(delimitar.nextInt());
                carrera.setFecha(new Date());
                carrera.agregar(RegistroCodornices.obtenerInstancia().obtener(delimitar.nextInt()));
                carrera.agregar(RegistroCodornices.obtenerInstancia().obtener(delimitar.nextInt()));
                carrera.agregar(RegistroCodornices.obtenerInstancia().obtener(delimitar.nextInt()));
                carrera.agregar(RegistroCodornices.obtenerInstancia().obtener(delimitar.nextInt()));
                carrera.agregar(RegistroCodornices.obtenerInstancia().obtener(delimitar.nextInt()));

                carreras.add(carrera);
            }

            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosCarrera.class.getName()).log(Level.SEVERE, null, ex);
        }

        return carreras;
    }

}
