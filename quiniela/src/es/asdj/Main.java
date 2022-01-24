package es.asdj;

public class Main {

    public static void main(String[] args) {
        String resultado;
        int num;

        for (int i = 1; i <= 15; i++) {
            num = (int) (Math.random() * 3);
            if (num == 0) {
                resultado = "1";
            } else if (num == 1) {
                resultado = "2";
            } else {
                resultado = "X";
            }

            System.out.println("Partido " + i + ": " + resultado);
        }
    }
}