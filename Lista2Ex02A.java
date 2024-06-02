/*
 * Lista de Exercícios 2 - Exercício 1
 * Bruno Venâncio de Souza e Silva - RA: 821135934
 * Henrick Melo Vital - RA: 821224905
 * 
 * 
 * Resolva a seguinte equação de recorrência por indução:
 * 
 * T(0) = 1
 * T(n) = T(n - 1) + 2^n, n > 0
 * 
 */

public class Lista2Ex02A {
    
    public static double t(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n - 1 + Math.pow(2, n);
        }
    }

    public static void main(String[] args) {
        int n = 0;

        while (n <= 10) {
            System.out.printf("%d -> %.0f\n", n, t(n++));
        }
    }
}
