package core;

import config.ConexionBD;
import models.ExpedienteAnimal;
import observers.ObservadorNotificacion;
import java.util.ArrayList;
import java.util.List;

public class GestorCasosCentral {
    private static GestorCasosCentral instancia;
    private List<ObservadorNotificacion> observadores = new ArrayList<>();

    private GestorCasosCentral() {}

    public static synchronized GestorCasosCentral getInstancia() {
        if (instancia == null) {
            instancia = new GestorCasosCentral();
        }
        return instancia;
    }

    public void suscribir(ObservadorNotificacion obs) {
        observadores.add(obs);
    }

    public void desuscribir(ObservadorNotificacion obs) {
        observadores.remove(obs);
    }

    public void notificar(String mensaje) {
        for (ObservadorNotificacion obs : observadores) {
            obs.actualizar(mensaje);
        }
    }

    public void registrarNuevoRescate(ExpedienteAnimal expediente) {
        ConexionBD.getInstancia().ejecutarConsulta("INSERT INTO casos (nombre, protocolo) VALUES ('" 
                + expediente.getNombre() + "', '" + expediente.obtenerProtocoloMedico() + "');");
        
        String mensaje = "NUEVO RESCATE REGISTRADO: " + expediente.obtenerProtocoloMedico();
        notificar(mensaje);
    }
}