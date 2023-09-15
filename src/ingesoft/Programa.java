package ingesoft;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {

        ProyectoSoftware proyecto1 = new ProyectoSoftware("ingenieria de software");
        proyecto1.insertarTarea("Extraccion de requisitos",12,Fase.ANALISIS);
        proyecto1.insertarTarea("Definicion de casos de uso",6,Fase.ANALISIS);
        proyecto1.insertarTarea("Diseño del modelo de datos",10,Fase.DISEÑO);
        proyecto1.insertarTarea("Implementación de la UI",20,Fase.IMPLEMENTACION);
        proyecto1.insertarTarea("Implementación del modelo",20,Fase.IMPLEMENTACION);
        proyecto1.insertarTarea("Implementación de las pruebas",8,Fase.IMPLEMENTACION);
        proyecto1.insertarTarea("Configuracion de la base de datos",4,Fase.DESPLIEGUE);
        proyecto1.insertarTarea("Instalacion en el servidor",6,Fase.DESPLIEGUE);
        proyecto1.insertarTarea("Programacion de nuevos requisitos",20,Fase.MANTENIMIENTO);


        ArrayList<Tarea> paraBorrar = new ArrayList<>();

        for (Tarea tarea:proyecto1.getTodasLasTareas()){
            if(tarea.getDuracion() < 7){
                paraBorrar.add(tarea);
            }
        }
        for (Tarea tarea:paraBorrar) {
            proyecto1.borrarTarea(tarea);
        }

        for (Tarea tarea:proyecto1.tareasDeFase(Fase.ANALISIS)){
            proyecto1.finalizarTarea(tarea);
        }
        System.out.println(proyecto1.toString());

    }
}
