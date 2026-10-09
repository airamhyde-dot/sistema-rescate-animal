package observers;

public class VeterinarioObserver implements ObservadorNotificacion {
    private String nombre;
    private String especialidad;

    public VeterinarioObserver(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("  📩 [ALERTA VETERINARIA - " + especialidad.toUpperCase() + "] " + nombre + " recibió: " + mensaje);
    }
}