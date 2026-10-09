package observers;

public class VoluntarioObserver implements ObservadorNotificacion {
    private String nombre;
    private String area;

    public VoluntarioObserver(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("  📩 [NOTIFICACIÓN VOLUNTARIO - " + area.toUpperCase() + "] " + nombre + " recibió: " + mensaje);
    }
}