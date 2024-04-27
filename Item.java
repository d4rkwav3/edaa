/*
 * Lista de Exercícios 01
 * UC Estrutura de Dados e Análise de Algoritmos
 * 
 * Bruno Venâncio de Souza e Silva - RA: 821135934
 * Henrick Melo Vital - RA: 821224905
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Item {
    private String jogo;
    private String categoria;
    private double avaliacao;

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Item(String jogo, String categoria, double avaliacao) {
        this.jogo = jogo;
        this.categoria = categoria;
        this.avaliacao = avaliacao;
    }

    public Item() {
        this("", "", 0.0);
    }

    @Override
    public String toString() {
        String doubleDot = Double.toString(this.avaliacao).replace(',', '.');
        return String.format("%s,%s,%s", this.jogo, this.categoria, doubleDot);
    }

    public static Item[] cvsToItem(FileReader cvsFile) {
        ArrayList<Item> itens = new ArrayList<Item>();
        Item[] result;
        Scanner file = new Scanner(cvsFile);

        while (file.hasNext()) {
            String[] row = file.nextLine().split(",");
            itens.add(new Item(row[0], row[1], Double.parseDouble(row[2])));
        }
        file.close();

        result = new Item[itens.size()];
        for(int i = 0; i < result.length; i++) 
            result[i] = itens.get(i);

        return result;  
    }

    public static void saveToCsv(String name, Item[] itens) {
        try {
            File novoArquivo = new File(name + ".csv");

            if(novoArquivo.createNewFile())
                System.out.println("Arquivo criado!");
            else {
                System.out.println("O arquivo já existe e será sobrescrito!");
            }

            FileWriter escrita = new FileWriter(novoArquivo);

            for(Item i : itens) {
                String linha = i.toString() + "\n";
                escrita.write(linha);
            }
            escrita.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
            ioe.printStackTrace();
        }
        System.out.println("Arquivo salvo com sucesso!");
    }

    // Ordena um vetor de Item por categoria usando o método insertion sort
    public static Item[] ordenarPorCategoria(Item[] itens) {
        Item temp = new Item();
        int i, prev;

        for(i = 1; i < itens.length; i++) {
            temp = itens[i];
            String categoria = itens[i].getCategoria();
            for(prev = i - 1; 
                i >= 0 && itens[prev].getCategoria().compareTo(categoria) > 0; prev--) {
                    itens[prev + 1] = itens[prev];
                    itens[prev] = temp;
            }
            itens[prev + 1] = temp;
        }

        return itens;
    }

    // Ordena um vetor de Item por avaliação decrescente usando o método bubble sort
    public static Item[] ordenarPorAvaliacao(Item[] itens) {
        Item temp = new Item();

        for(int index = 0; index < itens.length - 1; index++) {
            for(int next = index + 1; next < itens.length; next++) {
                if(itens[index].getAvaliacao() < itens[next].getAvaliacao()) {
                    temp = itens[index];
                    itens[index] = itens[next];
                    itens[next] = temp;
                }
            }
        }

        return itens;
    }
}