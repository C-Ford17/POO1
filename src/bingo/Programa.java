package bingo;

public class Programa {
    public static void main(String[] args) {
        Bingo bingo = new Bingo();
        System.out.println(bingo.generarCarton().toString());
        System.out.println(bingo.generarCarton().toString());
        System.out.println(bingo.generarCarton().toString());
        while(!bingo.finalizado()){
            System.out.println(bingo.extraerBola());
        }
        if (!bingo.getCartonesGanadores().isEmpty()){
            System.out.println(bingo.getCartonesGanadores().toString());
        }
    }
}
