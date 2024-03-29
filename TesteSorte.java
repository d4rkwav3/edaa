public class TesteSorte {
    public static void main(String[] args) {
        // Instanciando os objetos
        Sort testeBubbleSort = new Sort();
        Sort testeInsertSort = new Sort();
        Sort testeSelectionSort = new Sort();

        // Executando os testes
        testeBubbleSort.bubbleSort(testeBubbleSort.teste);
        testeInsertSort.insertionSort(testeInsertSort.teste);
        testeSelectionSort.selectionSort(testeSelectionSort.teste);
    }
}
