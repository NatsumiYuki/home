#include <stdio.h>
#include <string.h>

#define MAX_COUNTRIES 30
#define MAX_NAME_LENGTH 50
#define MAX_MESSAGE_LENGTH 100

typedef struct {
    char country[MAX_NAME_LENGTH];
    char message[MAX_MESSAGE_LENGTH];
} CountryMessage;

int main() {
    CountryMessage messages[MAX_COUNTRIES] = {
        {"brasil", "Feliz Natal!"},
        {"alemanha", "Frohliche Weihnachten!"},
        {"austria", "Frohe Weihnacht!"},
        {"coreia", "Chuk Sung Tan!"},
        {"espanha", "Feliz Navidad!"},
        {"grecia", "Kala Christougena!"},
        {"estados-unidos", "Merry Christmas!"},
        {"inglaterra", "Merry Christmas!"},
        {"australia", "Merry Christmas!"},
        {"portugal", "Feliz Natal!"},
        {"suecia", "God Jul!"},
        {"turquia", "Mutlu Noeller"},
        {"argentina", "Feliz Navidad!"},
        {"chile", "Feliz Navidad!"},
        {"mexico", "Feliz Navidad!"},
        {"antardida", "Merry Christmas!"},
        {"canada", "Merry Christmas!"},
        {"irlanda", "Nollaig Shona Dhuit!"},
        {"belgica", "Zalig Kerstfeest!"},
        {"italia", "Buon Natale!"},
        {"libia", "Buon Natale!"},
        {"siria", "Milad Mubarak!"},
        {"marrocos", "Milad Mubarak!"},
        {"japao", "Merii Kurisumasu!"}
    };

    char input[MAX_NAME_LENGTH];

    // Lê os nomes dos países até o EOF
    while (fgets(input, sizeof(input), stdin)) {
        // Remove o caractere de nova linha
        input[strcspn(input, "\n")] = 0;

        // Procura a mensagem correspondente
        int found = 0;
        for (int i = 0; i < MAX_COUNTRIES; i++) {
            if (strcmp(input, messages[i].country) == 0) {
                printf("%s\n", messages[i].message);
                found = 1;
                break;
            }
        }

        // Se não encontrou, imprime a mensagem de erro
        if (!found) {
            printf("--- NOT FOUND ---\n");
        }
    }

    return 0;
}
