#include <stdio.h>
#include <string.h>

int main(){
    
    int numeroPokemons, repetidos = 0, final, total, i;
    char nomePokemons[151][1000];


    scanf("%d", &numeroPokemons);

    // Read all Pokémon names
    for (int i = 0; i < numeroPokemons; i++) {
        scanf("%s", nomePokemons[i]); 
    }

    // Check for duplicates
    for (int i = 0; i < numeroPokemons; i++) {
        for (int j = 0; j < i; j++) {
            if (strcmp(nomePokemons[i], nomePokemons[j]) == 0) {
                repetidos++;
            }
        }
    }

    // Calculate missing Pokémon
    total = numeroPokemons - repetidos;
    final = 151 - total;

    printf("Falta(m) %d pomekon(s).", final);

    return 0;

}


