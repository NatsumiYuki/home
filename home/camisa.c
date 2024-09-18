#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char nome[51];
    char cor[10];
    char tamanho[2];
} Camiseta;

int compare(const void *a, const void *b) {
    Camiseta *c1 = (Camiseta *)a;
    Camiseta *c2 = (Camiseta *)b;

    // Comparar pela cor (ascendente)
    int corCompare = strcmp(c1->cor, c2->cor);
    if (corCompare != 0) return corCompare;

    // Comparar pelo tamanho (descendente)
    if (strcmp(c1->tamanho, c2->tamanho) != 0) {
        return strcmp(c2->tamanho, c1->tamanho); // inverte a comparação para ordem descendente
    }

    // Comparar pelo nome (ascendente)
    return strcmp(c1->nome, c2->nome);
}

int main() {
    int N;
    int primeiroCaso = 1;

    while (1) {
        scanf("%d", &N);
        if (N == 0) break;

        Camiseta *camisetas = malloc(N * sizeof(Camiseta));

        for (int i = 0; i < N; i++) {
            // Lê o nome do estudante
            getchar(); // Limpa o buffer do '\n'
            fgets(camisetas[i].nome, sizeof(camisetas[i].nome), stdin);
            camisetas[i].nome[strcspn(camisetas[i].nome, "\n")] = 0; // Remove o '\n'

            // Lê a cor e o tamanho
            scanf("%s %s", camisetas[i].cor, camisetas[i].tamanho);
        }

        // Ordena as camisetas
        qsort(camisetas, N, sizeof(Camiseta), compare);

        // Imprime uma linha em branco entre os casos de teste, exceto no primeiro
        if (!primeiroCaso) {
            printf("\n");
        }
        primeiroCaso = 0;

        // Imprime as camisetas ordenadas
        for (int i = 0; i < N; i++) {
            printf("%s %s %s\n", camisetas[i].cor, camisetas[i].tamanho, camisetas[i].nome);
        }

        free(camisetas);
    }

    return 0;
}
