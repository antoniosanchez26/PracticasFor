package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un número: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero ; i += 2) {
            System.out.println(i);
        }
    }
}