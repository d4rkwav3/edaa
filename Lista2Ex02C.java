/*
 * Lista de Exercícios 2 - Exercício 1
 * Bruno Venâncio de Souza e Silva - RA: 821135934
 * Henrick Melo Vital - RA: 821224905
 * 
 * 
 * Resolva a seguinte equação de recorrência por indução:
 * 
 * T(1) = 1
 * T(n) = n + T(n / 3), n > 1
 * 
 */

public class Lista2Ex02C {
    
    public static double t(int n) {
        if (n == 1) return 2;
        else return n + n / 3.0;
    }

    public static void main(String[] args) {
        int n = 1;

        while (n <= 10) {
            System.out.printf("%d -> %.2f\n", n, t(n++));
        }
    }
}
