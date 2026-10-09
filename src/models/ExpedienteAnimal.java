package models;

public abstract class ExpedienteAnimal {
    protected String nombre;
    protected int edadAproximada;

    public ExpedienteAnimal(String nombre, int edadAproximada) {
        this.nombre = nombre;
        this.edadAproximada = edadAproximada;
    }

    public abstract String obtenerProtocoloMedico();

    public String getNombre() {
        return nombre;
    }

    public int getEdadAproximada() {
        return edadAproximada;
    }
}