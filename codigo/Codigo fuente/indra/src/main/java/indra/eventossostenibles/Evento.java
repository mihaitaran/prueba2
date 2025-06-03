package indra.eventossostenibles;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Evento {

    protected String idEvento;
    protected String nombre;
    protected int duracion;
    protected LocalDateTime fecha;
    protected String tipo;
    protected ArrayList<Usuario> usuarios = new ArrayList<>();

    public Evento(String idEvento, String nombre, int duracion, LocalDateTime fecha, String tipo) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.duracion = duracion;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public String getId() {
        return idEvento;
    }

    public void setId(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
