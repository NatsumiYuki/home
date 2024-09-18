#include <stdio.h>
#include <string.h>

#define MAX_LENGTH 51 // Máximo de 50 caracteres + 1 para o terminador nulo

void combinarStrings(const char* str1, const char* str2, char* resultado) {
    int len1 = strlen(str1);
    int len2 = strlen(str2);
    int j = 0;

    // Alterna as letras das duas strings
    for (int i = 0; i < len1 || i < len2; i++) {
        if (i < len1) {
            resultado[j++] = str1[i]; // Adiciona letra da primeira string
        }
        if (i < len2) {
            resultado[j++] = str2[i]; // Adiciona letra da segunda string
        }
    }

    resultado[j] = '\0'; // Termina a string
}

int main() {
    int N;
    
    // Lê o número de casos de teste
    if (scanf("%d\n", &N) != 1 || N < 1) {
        fprintf(stderr, "Número de casos de teste inválido.\n");
        return 1;
    }

    for (int t = 0; t < N; t++) {
        char str1[MAX_LENGTH], str2[MAX_LENGTH], resultado[MAX_LENGTH * 2]; // Resultado pode ter até 100 caracteres

        // Lê as duas strings
        if (fgets(str1, sizeof(str1), stdin) == NULL || fgets(str2, sizeof(str2), stdin) == NULL) {
            fprintf(stderr, "Erro ao ler as strings.\n");
            return 1;
        }

        // Remove o caractere de nova linha, se presente
        str1[strcspn(str1, "\n")] = 0;
        str2[strcspn(str2, "\n")] = 0;

        // Combina as strings
        combinarStrings(str1, str2, resultado);
        
        // Imprime a string resultante
        printf("%s\n", resultado);
    }

    return 0;
}
