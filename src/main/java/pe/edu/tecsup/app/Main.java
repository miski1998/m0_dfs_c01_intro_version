package pe.edu.tecsup.app;


public class Main {
    /*
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        int suma = obtenerSuma(5);

        System.out.println(suma);

    }
    */
    public static int obtenerSuma(int n) {
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