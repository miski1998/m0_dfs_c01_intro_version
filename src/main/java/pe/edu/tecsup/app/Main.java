package pe.edu.tecsup.app;


import java.util.IllegalFormatWidthException;

public class Main {
    /*
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        int suma = obtenerSuma(5);

        System.out.println(suma);

    }
    */
    public static int obtenerSuma(int n) {
        if (n < 0){
            throw new IllegalArgumentException("El numero debe ser no negativo");
        }
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
    public static int obtenerFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}