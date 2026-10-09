package factories;

import models.ExpedienteAnimal;
import models.ExpedientePerro;

public class CreadorPerro extends CreadorExpediente {
    @Override
    public ExpedienteAnimal crearExpediente(String nombre, int edad) {
        return new ExpedientePerro(nombre, edad);
    }
}