#include <stdio.h>
#include <string.h>

    int alfabetoAlienigena(char *frases, char *vogais){
        int contador = 0;
        //compara a I com todas J
        for (int i = 0 ; frases[i] != '\0' ; i++){
            for(int j = 0 ; vogais[j] != '\0' ; j++){
                if (frases[i] == vogais[j]){
                    contador++;
                }
            }
        }
        return contador;
    }

    int main (){
        char vogais[100];
        char frases[100];

            scanf("%s", vogais) 
            scanf(" %[^\n]", frases);
            printf("%d", alfabetoAlienigena(frases, vogais));
        


        return 0;
    }


