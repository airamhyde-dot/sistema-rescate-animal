package models;

public class ExpedienteGato extends ExpedienteAnimal {
    public ExpedienteGato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String obtenerProtocoloMedico() {
        return "Gato [" + nombre + ", " + edadAproximada + " años]: Test de inmunodeficiencia/leucemia felina y protocolo de adaptación.";
    }
}