/**
 * Exercício da Maratona de Programação EDAA 2024
 * Problema 1244 - Ordenação por Tamanho
 * Bruno Venâncio de Souza e Silva - RA: 821135934
 ** 
 */

import java.util.Scanner;

public class Maratona01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtdCasos = entrada.nextInt();
        String[] casos = new String[qtdCasos];
        entrada.nextLine();
 
        for(int rodada = 0; rodada < qtdCasos; rodada++) {
            String linha = entrada.nextLine();
            casos[rodada] = linha;
        }

        for(int posicao = 0; posicao < casos.length; posicao++) {
            String[] split = casos[posicao].split(" ");            
            String temp;
            int indice, anterior;

            for(indice = 1; indice < split.length; indice++) {
                temp = split[indice];
                String comparacao = split[indice];
                for(anterior = indice - 1; 
                    anterior >= 0 && split[anterior].length() < comparacao.length(); anterior--) {
                        split[anterior + 1] = split[anterior];
                        split[anterior] = temp;
                }
                split[anterior + 1] = temp;
            }
        
            casos[posicao] = String.join(" ", split);
        }

        for(String linha : casos) {
            System.out.println(linha);
        }

        entrada.close();
    }
}