package ingesoft;

import java.util.ArrayList;
import java.util.List;

public class ProyectoSoftware {
    private String nombre;
    private ArrayList<Tarea> todasLasTareas;
    private ArrayList<Tarea> tareasFinalizadas;
    public ProyectoSoftware(String nombre) {
        this.nombre = nombre;
        this.todasLasTareas = new ArrayList<>();
        this.tareasFinalizadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Tarea> getTodasLasTareas() {
        return todasLasTareas;
    }

    public ArrayList<Tarea> getTareasFinalizadas() {
        return tareasFinalizadas;
    }

    @Override
    public String toString() {
        return "ProyectoSoftware{" +
                "nombre='" + nombre + '\'' +
                ", todasLasTareas=" + todasLasTareas +
                ", tareasFinalizadas=" + tareasFinalizadas +
                '}';
    }

    public int getDuracion(){
        int duracion = 0;
        for (Tarea tarea:todasLasTareas) {
            duracion+=tarea.getDuracion();
        }
        return duracion;
    }

    public ArrayList<Tarea> tareasDeFase(Fase fase){
        ArrayList<Tarea> tareasfase = new ArrayList<>();
        for (Tarea tarea:todasLasTareas) {
            if(tarea.getFase().equals(fase)){
                tareasfase.add(tarea);
            }
        }
        return tareasfase;
    }

    public Tarea insertarTarea(String descripcion, int duracion,Fase fase){
        Tarea tarea = new Tarea(descripcion,duracion,fase);
        this.todasLasTareas.add(tarea);
        return tarea;
    }

    public boolean borrarTarea(Tarea tareaEliminar){
        for (Tarea tarea:todasLasTareas) {
            if(tarea.equals(tareaEliminar)){
                todasLasTareas.remove(tarea);
                return true;
            }
        }
        return false;
    }

    public boolean tareaEnLista(ArrayList<Tarea> tareas, Tarea tareaVerificar){
        for (Tarea tarea:tareas) {
            if(tarea.equals(tareaVerificar)){
                return true;
            }
        }
        return false;
    }

    public boolean finalizarTarea(Tarea tarea){
        if(tareaEnLista(todasLasTareas,tarea)){
           if(!tareaEnLista(tareasFinalizadas,tarea)){
               tareasFinalizadas.add(tarea);
               return true;
           }
        }
        return false;
    }

}
