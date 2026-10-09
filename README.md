# Sistema de Control de Rescate y Adopción Animal

## 📌 Descripción del Proyecto
Este sistema gestiona el flujo de recepción, tratamiento médico y adopción de especímenes en un refugio animal (Perros, Gatos, Fauna Silvestre). Está diseñado aplicando arquitectura limpia, principios SOLID y patrones de diseño creacionales, estructurales y de comportamiento.

## 🛠️ Patrones de Diseño Implementados
1. **Factory Method (Creacional):** Creación desacoplada de expedientes médicos según la especie animal.
2. **Observer (Comportamiento):** Notificaciones automáticas a voluntarios y veterinarios ante nuevos rescates o cambios de estado.
3. **Singleton (Creacional):** Garantía de instancia única para la gestión centralizada de casos y conexión a la base de datos.
4. **MVC (Arquitectónico):** Separación de vistas, lógica de negocio y persistencia de datos.

## 🔀 Flujo de Ramificación (Gitflow)
- `master` / `main`: Código estable en producción (Tag `v1.0`).
- `develop`: Rama principal de integración.
- `feature/*`: Desarrollo modular de requerimientos específicos.
- `release/v1.0`: Ajustes finales previos a producción.

## 🚀 Ejecución
Abre el archivo `src/Main.java` en VS Code y presiona `F5` o haz clic en el botón de reproducción (▶️) para iniciar la simulación.
