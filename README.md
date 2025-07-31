# 🖥️ Ordenação de Algoritmos

Este projeto implementa e compara três algoritmos de ordenação clássicos em Java:

*   **Insertion Sort**
*   **Merge Sort**
*   **Quick Sort**

Além disso, o programa mede o tempo de execução de cada algoritmo para identificar qual deles é o mais rápido e qual é o mais lento com base nos dados fornecidos.

## 📂 Estrutura do projeto

```bash
Ordenacao-de-algoritmos/
├── InsertionSort.java     # Implementação do algoritmo Insertion Sort
├── MergeSort.java         # Implementação do algoritmo Merge Sort
├── QuickSort.java         # Implementação do algoritmo Merge Sort
├── Main.java              # Classe principal que executa os algoritmos e exibe os resultados
└── numeros.txt            # Arquivo de entrada com números para ordenação
```

*Os arquivos `.class` são gerados automaticamente após a compilação.*

## 🚀 Como executar

1.  **Clonar o repositório**
    ```bash
    git clone https://github.com/Theo-Panella/Ordenacao-de-algoritmos.git
    cd Ordenacao-de-algoritmos
    ```

2.  **Compilar os arquivos**
    ```bash
    javac *.java
    ```

3.  **Executar o programa**
    ```bash
    java Main
    ```

O programa lerá os números do arquivo `numeros.txt`, executará cada algoritmo de ordenação e exibirá o tempo de execução de cada um.
OBS: Gera um arquivo para cada tipo de ordenação para prova viva da ordenação

## 📊 Exemplo de saída

```
Executando algoritmos de ordenação...

Insertion Sort:  0.023 segundos
Merge Sort:      0.004 segundos
Quick Sort:      0.003 segundos

O algoritmo mais rápido foi: Quick Sort
O algoritmo mais lento foi: Insertion Sort
```

## 🛠️ Tecnologias

*   Java 8+
*   Git/GitHub


