import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] original = lerArquivo("numeros.txt");

        //Clona a array para cada Algoritmo
        int[] arrQuick = original.clone();
        int[] arrInsertion = original.clone();
        int[] arrMerge = original.clone();

        //Cronometra cada Algoritmo
        long timeQuickNs = QuickSort.sort(arrQuick);
        long timeInsertionNs = InsertionSort.sort(arrInsertion);
        long timeMergeNs = MergeSort.sort(arrMerge);

        //Calculo para passar para Milisegundos
        double timeQuick = timeQuickNs / 1_000_000.0;
        double timeInsertion = timeInsertionNs / 1_000_000.0;
        double timeMerge = timeMergeNs / 1_000_000.0;

        //Printa formatado o tempo de cada algoritmo
        System.out.printf("Tempo QuickSort:     %.3f ms%n", timeQuick);
        System.out.printf("Tempo InsertionSort: %.3f ms%n", timeInsertion);
        System.out.printf("Tempo MergeSort:     %.3f ms%n", timeMerge);

        //Define variaveis para tempo mais longo e temp mais curto
        double min = Math.min(timeQuick, Math.min(timeInsertion, timeMerge));
        double max = Math.max(timeQuick, Math.max(timeInsertion, timeMerge));

        //Condições para Definição do Algoritmo mais rapido
        if (min == timeQuick) System.out.println("Mais rápido: QuickSort");
        else if (min == timeInsertion) System.out.println("Mais rápido: InsertionSort");
        else System.out.println("Mais rápido: MergeSort");

        //Condições iguais, só que pro mais lento
        if (max == timeQuick) System.out.println("Mais lento: QuickSort");
        else if (max == timeInsertion) System.out.println("Mais lento: InsertionSort");
        else System.out.println("Mais lento: MergeSort");

        //grava as arrays ordenadas em arquivos
        escreverArquivo("ordenado_quick.txt", arrQuick);
        escreverArquivo("ordenado_insertion.txt", arrInsertion);
        escreverArquivo("ordenado_merge.txt", arrMerge);
    }

    //Função para ler aquivo (numeros.txt)
        private static int[] lerArquivo(String nome) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(nome));
            String linha = reader.readLine();
            reader.close();
            String[] partes = linha.trim().split("[,\\s]+");
            int[] numeros = new int[partes.length];
            for (int i = 0; i < partes.length; i++) {
                numeros[i] = Integer.parseInt(partes[i]);
            }
            return numeros;
        }

    //Função para Criar e escrever a array ordenada em .txt
    private static void escreverArquivo(String nome, int[] arr) throws IOException {
        FileWriter writer = new FileWriter(nome);
        for (int i = 0; i < arr.length; i++) {
            writer.write(String.valueOf(arr[i]));
            if (i < arr.length - 1) writer.write(", ");
        }
        writer.close();
    }
}
