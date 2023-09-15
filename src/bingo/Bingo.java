package bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class Bingo {
    private ArrayList<Integer> bombo;
    private ArrayList<Integer> bolasExtraidas;
    private ArrayList<Carton> cartones;
    private ArrayList<Carton> cartonesGanadores;
    private static final int bolaMayor = 30;
    private static final int tamañoDelCarton = 9;

    public ArrayList<Integer> getBombo() {
        return bombo;
    }

    public ArrayList<Integer> getBolasExtraidas() {
        return bolasExtraidas;
    }

    public ArrayList<Carton> getCartones() {
        return cartones;
    }

    public ArrayList<Carton> getCartonesGanadores() {
        return cartonesGanadores;
    }

    public boolean finalizado(){
        if (bombo.isEmpty() || !cartonesGanadores.isEmpty()){
            return true;
        }
        return false;
    }

    public Bingo() {
        this.bombo = new ArrayList<>();
        this.bolasExtraidas = new ArrayList<>();
        this.cartones = new ArrayList<>();
        this.cartonesGanadores = new ArrayList<>();
        for (int i = 0; i < bolaMayor; i++) {
            this.bombo.add(i+1);
        }
    }

    public boolean comprobarCarton(Carton carton){
        for(int num:carton.getNumeros()){
            if(!bolasExtraidas.contains(num)){
                return false;
            }
        }
        return true;
    }

    public Carton generarCarton(){
        ArrayList<Integer> todosNumeros = new ArrayList<>();
        for (int i = 0; i < bolaMayor; i++) {
            todosNumeros.add(i+1);
        }
        Collections.shuffle(todosNumeros);
        ArrayList<Integer> numerosCarton = new ArrayList<>();
        for (int i = 0; i < tamañoDelCarton; i++) {
            numerosCarton.add(todosNumeros.get(i));
        }
        Carton carton = new Carton(numerosCarton);
        cartones.add(carton);
        return carton;
    }

    public int extraerBola(){
        if (finalizado()) return 0;
        Collections.shuffle(bombo);
        int bolaExtraida = bombo.remove(0);
        bolasExtraidas.add(bolaExtraida);
        for (Carton carton:cartones) {
            if (comprobarCarton(carton)) cartonesGanadores.add(carton);
        }
        return bolaExtraida;
    }

    @Override
    public String toString() {
        return "Bingo{" +
                "bombo=" + bombo +
                ", bolasExtraidas=" + bolasExtraidas +
                ", cartones=" + cartones +
                ", cartonesGanadores=" + cartonesGanadores +
                '}';
    }
}
