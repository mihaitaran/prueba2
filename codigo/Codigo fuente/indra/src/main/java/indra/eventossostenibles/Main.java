package indra.eventossostenibles;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // Crear organizador
        Organizador organizador = new Organizador("ORG01", "EcoOrganiza", "organizador@eco.com", "+34 612 345 678");

        // Crear eventos (uno físico y uno online)
        organizador.crearEvento(
            "EV001",
            "Conferencia sobre Energías Renovables",
            2,
            LocalDateTime.of(2025, 6, 25, 10, 0),
            "Conferencia",
            "Centro EcoMadrid",
            "Madrid",
            "Madrid"
        );

        organizador.crearEvento(
            "EV002",
            "Taller de Compostaje",
            3,
            LocalDateTime.of(2025, 6, 30, 16, 0),
            "Taller",
            "https://ecoportal.com/taller-compostaje"
        );

        // Mostrar eventos creados
        System.out.println("Eventos creados por " + organizador.getNombre() + ":");
        for (Evento e : organizador.getEventos()) {
            System.out.println("- " + e.getNombre() + " (" + e.getTipo() + ")");
        }

        // Crear usuario
        Usuario usuario = new Usuario("USR01", "Ana Gómez", "ana@correo.com", "contraseña123");

        // Inscribir al usuario en un evento
        Evento evento1 = organizador.getEventos().get(0);
        usuario.inscribirEvento(evento1);

        // Intentar inscribirse nuevamente en el mismo evento
        usuario.inscribirEvento(evento1); // debería mostrar mensaje

        // Inscribirse en otro evento
        Evento evento2 = organizador.getEventos().get(1);
        usuario.inscribirEvento(evento2);

        // Mostrar eventos del usuario
        System.out.println("\nEventos en los que está inscrita " + usuario.getNombre() + ":");
        for (Evento e : usuario.getEventos()) {
            System.out.println("- " + e.getNombre());
        }

        // Filtrar por tipo
        usuario.filtrarEventos(organizador.getEventos(), "taller");
        System.out.println("\nEventos filtrados por tipo 'taller':");
        for (Evento e : usuario.getEventos()) {
            System.out.println("- " + e.getNombre());
        }

        // Cancelar inscripción
        usuario.cancelarInscripcion(evento2);
        System.out.println("\nDespués de cancelar inscripción:");
        for (Evento e : usuario.getEventos()) {
            System.out.println("- " + e.getNombre());
        }
    }
}