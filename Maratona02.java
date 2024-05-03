/**
 * Exercício da Maratona de Programação EDAA 2024
 * Problema 1211 - Lista Telefônica Econômica
 * Bruno Venâncio de Souza e Silva - RA: 821135934
 ** 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Maratona02 {
    public static void main(String[] args) {
        ArrayList<String[]> telefones = new ArrayList<String[]>();
        Scanner entrada = new Scanner(System.in);
        Integer qtdTel; 
        Integer prefixo = 0;
        Integer economia = 0;
        Integer index = 0;

        while (entrada.hasNext()) {
            qtdTel = entrada.nextInt();
            entrada.nextLine();
            String[] temp = new String[qtdTel];

            for(int tel = 0; tel < qtdTel; tel++) {
                temp[tel] = entrada.nextLine();
            }
            telefones.add(temp);
        }
 
        entrada.close();

        for(String[] s : telefones) {
            Arrays.sort(s);
        }

        for(String[] lista : telefones) {

            for(int pos = 0; pos < lista.length - 1; pos++) {

                for(int c = 0; c < lista[pos].length(); c++) {

                    if (lista[pos + 1].charAt(c) == lista[pos].charAt(c)) {
                        prefixo++;
                    } else {
                        economia = economia + prefixo;
                        prefixo = 0;
                        break;
                    }
                }
            }
            System.out.println(economia);
            economia = 0;
            index++;
        }
    }
}