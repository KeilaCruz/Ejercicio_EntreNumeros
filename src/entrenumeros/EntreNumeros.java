package entrenumeros;

import java.util.Scanner;

public class EntreNumeros {
    /**
     * Método main toma dos numeros enteros de entrada
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numUno = input.nextInt();
        System.out.print("Ingrese otro numero mayor al numero uno: ");
        int numDos = input.nextInt();
        imprimirNumeros(numUno, numDos);
    }

    /**
     * Metodo imprime los valores entre el numero uno y el numero dos
     * excluyendolos
     * 
     * @param numUno
     * @param numDos
     */
    public static void imprimirNumeros(int numUno, int numDos) {
        if (numUno >= numDos) {
            System.out.println("El num uno no es valido");
        }
        for (int i = numUno + 1; i < numDos; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
