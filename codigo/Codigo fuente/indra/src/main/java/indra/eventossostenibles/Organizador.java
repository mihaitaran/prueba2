package indra.eventossostenibles;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Organizador {

    private String idOrganizador;
    private String nombre;
    private String correo;
    private String telefono;
    private ArrayList<Evento> eventos = new ArrayList<>();

    public Organizador(String idOrganizador, String nombre, String correo, String telefono) {
        this.idOrganizador = idOrganizador;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getId() {
        return idOrganizador;
    }

    public void setId(String idOrganizador) {
        this.idOrganizador = idOrganizador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return correo;
    }

    public void setEmail(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public void crearEvento(String idEvento, String nombre, int duracion, LocalDateTime fecha, String tipo, String lugar, String ciudad, String provincia){

        Evento evento = new Fisico(idEvento, nombre, duracion, fecha, tipo, lugar, ciudad, provincia);
        
        eventos.add(evento);
    }

    public void crearEvento(String idEvento, String nombre, int duracion, LocalDateTime fecha, String tipo, String sitioWeb){

        Evento evento = new Online(idEvento, nombre, duracion, fecha, tipo, sitioWeb);
        
        eventos.add(evento);
    }

    public void eliminarEvento(String idEvento) {
        eventos.removeIf(evento -> evento.getId().equals(idEvento));
    }
}
