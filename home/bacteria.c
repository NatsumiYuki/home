#include <stdio.h>
#include <string.h>

int main() {
    char dna[101], codigo[101];

    while (1) {
        // Lê a sequência de DNA
        if (fgets(dna, sizeof(dna), stdin) == NULL) {
            break; // Sai do loop se não houver mais entrada
        }
        // Remove o caractere de nova linha
        dna[strcspn(dna, "\n")] = '\0';

        // Lê a sequência do código genético
        if (fgets(codigo, sizeof(codigo), stdin) == NULL) {
            break; // Sai do loop se não houver mais entrada
        }
        // Remove o caractere de nova linha
        codigo[strcspn(codigo, "\n")] = '\0';

        // Verifica se o código genético está contido no DNA
        if (strstr(dna, codigo) != NULL) {
            printf("Resistente\n");
        } else {
            printf("Nao resistente\n");
        }
    }

    return 0;
}
