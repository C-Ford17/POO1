package bingo;

import java.util.ArrayList;

public class Carton {
    private ArrayList<Integer> numeros;

    public Carton(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }


    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public int tamaño(){
        return numeros.size();
    }

    @Override
    public String toString() {
        return "Carton{" +
                "numeros=" + numeros +
                '}';
    }
}
