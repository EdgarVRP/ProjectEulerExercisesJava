/**
 * Ejercicio1
 * Instrucciones:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the
 * multiples of 3 or 5 below 1000.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println(mutiplos5y3(1000));
    }

    public static int mutiplos5y3(int numeroMayor) {
        int suma = 0;
        for (int i = 0; i < numeroMayor; i++) {
            if (i % 15 == 0) {
                suma += i;
            } else if (i % 3 == 0) {
                suma += i;
            } else if (i % 5 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}