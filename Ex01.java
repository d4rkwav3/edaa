/*
 * Lista de Exercícios 01
 * UC Estrutura de Dados e Análise de Algoritmos
 * 
 * Bruno Venâncio de Souza e Silva - RA: 821135934
 * Henrick Melo Vital - RA: 821224905
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Item[] itens = new Item[0];
        String opcoes = "\n[1] Ler arquivo\n[2] Ordenar por categoria\n[3] Ordenar por avaliação\n[4] Sair\n:";
        Integer selecao = 0;
        Scanner entrada = new Scanner(System.in);

        while (selecao != 4) {
            System.err.print(opcoes);
            selecao = entrada.nextInt();

            switch (selecao) {
                case 4:
                    System.out.println("Encerrando o programa\n");
                    break;
                
                case 3:
                    if(itens.length > 0) {
                        System.out.println("Ordenando por avaliação!\n");
                        itens = Item.ordenarPorAvaliacao(itens);

                        //for(Item i : itens) System.out.println(i.toString());
                        System.out.println("Salvando um novo arquivo ordenado");
                        Item.saveToCsv("JogosOrdenadosporAvaliacao", itens);
                    } else {
                        System.out.println("É necessário ler um arquivo CSV primeiro");
                    }
                    break;

                case 2:
                    if(itens.length > 0) {
                        System.out.println("Ordenando por categoria!\n");
                        itens = Item.ordenarPorCategoria(itens);

                        //for(Item i : itens) System.out.println(i.toString());
                        System.out.println("Salvando um novo arquivo ordenado");
                        Item.saveToCsv("JogosOrdenadosporCategoria", itens);
                    } else {
                        System.out.println("É necessário ler um arquivo CSV primeiro");
                    }
                    break;

                case 1:
                    System.out.println("\nLendo arquivo...");
                    try {
                        itens = Item.cvsToItem(new FileReader("JogosDesordenados.csv"));
                        //for(Item i : itens) System.out.printf(i.toString());
                        System.out.println("Arquivo lido com sucesso!\n");
                    } catch (FileNotFoundException f) {
                        System.out.printf("O arquivo CSV precisa estar na mesma pasta do programa!", f);
                    }
                    // System.out.println("\n" + itens[0].toString());;
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        entrada.close();
    }
}