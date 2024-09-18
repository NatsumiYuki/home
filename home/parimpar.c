#include <stdio.h>
#include <string.h>

// Função para imprimir um array de inteiros
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// Função de ordenação (inserção) para um array
void insertionSort(int arr[], int size) {
    for (int i = 1; i < size; i++) {
        int temp = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
}

int main() {
    int numLinhas, numeros;
    int par[500], impar[500];
    int parContador = 0, imparContador = 0;

    scanf("%d", &numLinhas);

    for (int i = 0; i < numLinhas; i++) {
        scanf("%d", &numeros);
        if (numeros % 2 == 0) {
            par[parContador++] = numeros; // Armazena o número na posição parContador
        } else {
            impar[imparContador++] = numeros; // Armazena o número na posição imparContador
        }
    }

    // Ordenar os números pares e ímpares
    insertionSort(par, parContador);
    insertionSort(impar, imparContador);

    // Criar o array final
    int ordenar[500];
    int k = 0;

    // Adiciona pares ao array final
    for (int i = 0; i < parContador; i++) {
        ordenar[k++] = par[i];
    }

    // Adiciona ímpares ao array final em ordem reversa
    for (int i = imparContador - 1; i >= 0; i--) {
        ordenar[k++] = impar[i];
    }

    printArray(ordenar, k); // Imprime o array final

    return 0;
}
