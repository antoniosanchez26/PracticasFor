package es.asdj;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero, contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe un número para comprobar si es primo: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            // Comprobar si la i es divisor del numero.
            // Cuando sea divisor del numero sumo uno a contador.
            // numero % i == 0
            if (numero % i == 0) {
                contador++;
            }

        }
        if  (contador <= 2){
            System.out.print("El número  es primo");
        } else {
            System.out.print("el número no es primo");
        }
    }
}

