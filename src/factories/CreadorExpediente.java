package factories;

import models.ExpedienteAnimal;

public abstract class CreadorExpediente {
    public abstract ExpedienteAnimal crearExpediente(String nombre, int edad);
}