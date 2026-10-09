package factories;

import models.ExpedienteAnimal;
import models.ExpedienteGato;

public class CreadorGato extends CreadorExpediente {
    @Override
    public ExpedienteAnimal crearExpediente(String nombre, int edad) {
        return new ExpedienteGato(nombre, edad);
    }
}