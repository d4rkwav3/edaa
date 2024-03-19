import java.util.Arrays;

public class Sort {
    // Exercício 001 usar o array abaixo para fazer os algoritmos de ordenação Bubble, Insert, Quick e Select
    public int teste[] = {10, 30, -26, 7, -5, 12, 8, 9, 0, 11, -2, -21, 15, 13, 14, 5, 6, -4, -17, 20};
    
    // Ordenação do tipo BubbleSort
    public int[] bubbleSort(int[] arr) {
        int troca;
        int iteracoes = 0;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;

        System.out.println("BubbleSort\nArray desordenando: " + Arrays.toString(arr));

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
        // String msg = "Total de iterações no array: " + Integer.toString(iteracoes) + " vezes. ";
        String tempo = "Tempo de execução " + (tempoFinal - tempoInicial) + " ms.";
        System.out.println(tempo + "\n");

        return arr;
    }

    // Ordenação do tipo InsertionSort
    public int[] insertionSort(int[] arr) {
        int troca, volta;
        int iteracoesAEsquerda = 0;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;

        System.out.println("InsertionSort\nArray desordenando: " + Arrays.toString(arr));

        for (int indice = 1; indice < arr.length; indice++) {
            troca = arr[indice];
            volta = indice;
            for (int anterior = indice - 1; anterior >= 0; anterior--) {
                if (arr[volta] < arr[anterior]) {
                    arr[volta] = arr[anterior];
                    arr[anterior] = troca;
                    volta--; 
                 } 
            }
            iteracoesAEsquerda++;
        }
        
        tempoFinal = System.currentTimeMillis();

        System.out.println("Array reordenando:  " + Arrays.toString(arr));
        // String msg = "Total de iterações no array: " + Integer.toString(iteracoesAEsquerda) + " vezes à esquerda. ";
        String tempo = "Tempo de execução " + (tempoFinal - tempoInicial) + " ms.";
        System.out.println(tempo + "\n");

        return arr;
    }

    // Ordenação do tipo SelectionSort
    public int[] selectionSort(int[] arr) {
        int minimo, indiceDaTroca, temp;
        int iteracoes = 0;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;

        System.out.println("SelectionSort\nArray desordenando: " + Arrays.toString(arr));

        for (int indice = 0; indice < arr.length; indice++) {
            minimo = arr[indice];
            indiceDaTroca = indice;

            for (int proximo = indice + 1; proximo < arr.length; proximo++) {
                if (arr[proximo] < minimo) {
                    minimo = arr[proximo];
                    indiceDaTroca = proximo;
                }
                iteracoes++;
            }
            temp = arr[indice];
            arr[indice] = minimo;
            arr[indiceDaTroca] = temp;
            iteracoes++;
        }

        iteracoes++;
        tempoFinal = System.currentTimeMillis();

        System.out.println("Array reordenando:  " + Arrays.toString(arr));
        // String msg = "Total de iterações no array: " + Integer.toString(iteracoes) + ". ";
        String tempo = "Tempo de execução " + (tempoFinal - tempoInicial) + " ms.";
        System.out.println(tempo + "\n");

        return arr;
    }
}