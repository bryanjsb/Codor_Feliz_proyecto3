package Logica;

import java.util.Date;

public class Codorniz {

    String nombre;
    int edad;
    String especie;
    double peso;
    int id;
    String dueño;
    Date tiempo;
    private RegistroCodornices registro;

    public Codorniz(int id, String nombre, int edad, String especie, double peso, String dueño) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
        this.id = id;
        this.dueño = dueño;
        registro = RegistroCodornices.obtenerInstancia();
    }

    public Codorniz() {
        this(0, "", 0, "", 0.0, "");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {

        return formatoArchivo();

    }

    public String InfoCodorniz() {

        StringBuilder s = new StringBuilder();
        s.append(String.format("Nombre del codorniz: %s%n", nombre));
        s.append(String.format("Identificación: %s%n", id));
        s.append(String.format("Dueño: %s%n", dueño));
        s.append(String.format("Especie: %s%n", especie));
        s.append(String.format("peso: %s%n", peso));
        s.append(String.format("Edad: %s%n", edad));
        s.append(String.format("Tiempo: %s%n", tiempo));
        return s.toString();

    }

    public String formatoArchivo() {
        StringBuilder s = new StringBuilder();

        s.append(String.format("%d,", id));
        s.append(String.format("%s,", nombre));
        s.append(String.format("%d,", edad));
        s.append(String.format("%s,", especie));
        s.append(String.format("%f,", peso));
        s.append(String.format("%s%n", dueño));
        //s.append(String.format("%s%n", tiempo));

        return s.toString();
    }

    public void guardar() {
        registro.agregar(this);
    }

    public boolean existe(int id) {
        return registro.existe(id);
    }

    public void actualizar() {
        registro.actualizar(this);
    }
}
