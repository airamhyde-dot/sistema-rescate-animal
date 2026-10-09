import config.ConexionBD;
import core.GestorCasosCentral;
import factories.*;
import models.ExpedienteAnimal;
import observers.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================================");
        System.out.println("   SISTEMA DE CONTROL DE RESCATE Y ADOPCIÓN ANIMAL (UTM)  ");
        System.out.println("==========================================================\n");

        System.out.println("--- 1. PATRÓN SINGLETON (Prueba de Instancia Única) ---");
        ConexionBD bd = ConexionBD.getInstancia();
        bd.ejecutarConsulta("SELECT status FROM refugio_system;");

        GestorCasosCentral gestor = GestorCasosCentral.getInstancia();

        System.out.println("\n--- 2. PATRÓN OBSERVER (Registro de Notificaciones) ---");
        ObservadorNotificacion vetFauna = new VeterinarioObserver("Dr. Mendoza", "Fauna Silvestre");
        ObservadorNotificacion vetClinico = new VeterinarioObserver("Dra. García", "Clínica Felina/Canina");
        ObservadorNotificacion volRescate = new VoluntarioObserver("Carlos Pérez", "Equipo de Rescate");

        gestor.suscribir(vetFauna);
        gestor.suscribir(vetClinico);
        gestor.suscribir(volRescate);

        System.out.println("\n--- 3. PATRÓN FACTORY METHOD (Generación de Expedientes) ---");
        CreadorExpediente fabricaSilvestre = new CreadorSilvestre();
        ExpedienteAnimal tucan = fabricaSilvestre.crearExpediente("Tucán Toco", 2);

        CreadorExpediente fabricaPerro = new CreadorPerro();
        ExpedienteAnimal perro = fabricaPerro.crearExpediente("Max", 3);

        CreadorExpediente fabricaGato = new CreadorGato();
        ExpedienteAnimal gato = fabricaGato.crearExpediente("Michi", 1);

        System.out.println("\n--- 🟢 REGISTRO CASO #1: FAUNA SILVESTRE ---");
        gestor.registrarNuevoRescate(tucan);

        System.out.println("\n--- 🟢 REGISTRO CASO #2: CANINO ---");
        gestor.registrarNuevoRescate(perro);

        System.out.println("\n--- 🟢 REGISTRO CASO #3: FELINO ---");
        gestor.registrarNuevoRescate(gato);

        System.out.println("\n==========================================================");
        System.out.println("   PRUEBA FINALIZADA CON ÉXITO");
        System.out.println("==========================================================");
    }
}