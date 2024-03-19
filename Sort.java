import java.util.Arrays;

public class Sort {
    // Exercício 001 usar o array abaixo para fazer os algoritmos de ordenação Select, insert, bubble, quick
    public static int teste[] = {10, 30, -26, 7, -5, 12, 8, 9, 0, 11, -2, -21, 15, 13, 14, 5, 6, -4, -17, 20};
    
    // Ordenação do tipo BubbleSort
    public static int[] bubbleSort(int arr[]) {
        int troca;
        int iteracoes = 0;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;

        System.out.println("\nArray desordenando: " + Arrays.toString(arr));

        for (int rodada = 0; rodada < arr.length - 1; rodada++) {
            for (int indice = 0; indice < arr.length - 1; indice++) {
                if (arr[indice] > arr[indice + 1]) {
                    troca = arr[indice];
                    arr[indice] = arr[indice + 1];
                    arr[indice + 1] = troca;
                }
            }
            iteracoes++;
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Array reordenando:  " + Arrays.toString(arr));
        String msg = "Total de iterações no array: " + Integer.toString(iteracoes) + " vezes. ";
        String tempo = "Tempo de execução " + (tempoFinal - tempoInicial) + " ms";
        System.out.println(msg + tempo + "\n");

        return arr;
    }

    public static void main(String[] args) {
        bubbleSort(teste);
    }
}