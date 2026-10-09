package models;

public class ExpedientePerro extends ExpedienteAnimal {
    public ExpedientePerro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String obtenerProtocoloMedico() {
        return "Perro [" + nombre + ", " + edadAproximada + " años]: Desparasitación, vacunación quíntuple y valoración ortopédica.";
    }
}