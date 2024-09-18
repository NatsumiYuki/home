#include <stdio.h>
#include <string.h>

int main() {
    int n;
    scanf("%d\n", &n); // Ler o número de casos

    for (int zz = 0; zz < n; zz++) {
        char frase1[1001], frase2[1001];
        fgets(frase1, sizeof(frase1), stdin);
        fgets(frase2, sizeof(frase2), stdin);

        // Remover o '\n' da entrada
        frase1[strcspn(frase1, "\n")] = 0;
        frase2[strcspn(frase2, "\n")] = 0;

        int len1 = strlen(frase1);
        int len2 = strlen(frase2);
        char resultado[2002]; // Max length for result
        int index = 0;

        for (int i = 0; i < len1 || i < len2; i += 2) {
            if (i < len1) {
                resultado[index++] = frase1[i];
                if (i + 1 < len1) {
                    resultado[index++] = frase1[i + 1];
                }
            }
            if (i < len2) {
                resultado[index++] = frase2[i];
                if (i + 1 < len2) {
                    resultado[index++] = frase2[i + 1];
                }
            }
        }

        resultado[index] = '\0'; // Adiciona o terminador de string
        printf("%s\n", resultado); // Imprime o resultado
    }

    return 0;
}
