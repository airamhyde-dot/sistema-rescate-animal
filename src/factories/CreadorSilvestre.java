package factories;

import models.ExpedienteAnimal;
import models.ExpedienteSilvestre;

public class CreadorSilvestre extends CreadorExpediente {
    @Override
    public ExpedienteAnimal crearExpediente(String nombre, int edad) {
        return new ExpedienteSilvestre(nombre, edad, "MAE-2026-AUT-091");
    }
}