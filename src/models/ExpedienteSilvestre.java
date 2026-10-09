package models;

public class ExpedienteSilvestre extends ExpedienteAnimal {
    private String permisoMAE;

    public ExpedienteSilvestre(String nombre, int edad, String permisoMAE) {
        super(nombre, edad);
        this.permisoMAE = permisoMAE;
    }

    @Override
    public String obtenerProtocoloMedico() {
        return "Fauna Silvestre [" + nombre + "]: Cuarentena de bioseguridad y reporte a Ministerio del Ambiente (Permiso: " + permisoMAE + ").";
    }
}