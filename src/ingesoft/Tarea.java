package ingesoft;

public class Tarea {
    private final String descripcion;
    private final int duracion;
    private final Fase fase;

    public String getDescripcion() {
        return descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public Fase getFase() {
        return fase;
    }

    public Tarea(String descripcion, int duracion, Fase fase) {
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.fase = fase;
    }

    public Tarea(String descripcion, Fase fase){
        this(descripcion,10,fase);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", duracion=" + duracion +
                ", fase=" + fase +
                '}';
    }
}
