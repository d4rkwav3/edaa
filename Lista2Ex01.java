/*
 * Lista de Exercícios 2 - Exercício 1
 * Bruno Venâncio de Souza e Silva - RA: 821135934
 * Henrick Melo Vital - RA: 821224905
 * 
 * 
 * Mostre, por indução, a validade da seguinte fórmula:
 * P(n) = 1² + 2² + ... + n² = n(n + 1)(2*n + 1)
 *                            ------------------ 
 *                                    6 
 */

public class Lista2Ex01 {

    // Função recursiva que faz a soma de n elementos elevados a potência de 2
    public static double p(int n) { 
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return p(n - 1) + Math.pow(n, 2);
        }
    }

    // Função da fórmula
    public static double k(int n) {
        return (n * (n + 1) * ((2 * n) + 1)) / 6;
    }

    public static void main(String[] args) {
        int n = 1;

        // Testa com o n igual a 10, o primeiro printf usa a função recursiva, o segundo usa a fórmula
        while (n <= 10) {
            System.out.printf("\nPara P(%d) = ", n);
            for (int i = 1; i <= n; i++) {
                if (i == n) System.out.printf("%d²", i);
                else System.out.printf("%d² + ", i);
            }
            System.out.printf(" = %.0f\n", p(n));
            System.out.printf("Resultado da fórmula --> %.0f\n", k(n++));
        }
    }
}