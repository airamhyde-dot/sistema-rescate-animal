package config;

/**
 * Patrón Singleton: Garantiza una única conexión a la base de datos.
 */
public class ConexionBD {
    private static ConexionBD instancia;

    private ConexionBD() {
        System.out.println("[BD Singleton] Conexión única a PostgreSQL inicializada correctamente.");
    }

    public static synchronized ConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public void ejecutarConsulta(String sql) {
        System.out.println("[BD EXEC]: " + sql);
    }
}