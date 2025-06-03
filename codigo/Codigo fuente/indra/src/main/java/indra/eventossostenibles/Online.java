package indra.eventossostenibles;

import java.time.LocalDateTime;

public class Online extends Evento {

    private String sitioWeb;

    public Online(String idEvento, String nombre, int duracion, LocalDateTime fecha, String tipo, String sitioWeb) {
        super(idEvento, nombre, duracion, fecha, tipo);
        this.sitioWeb = sitioWeb;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
}
