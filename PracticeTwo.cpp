#include<stdio.h>
#include<string.h>
int main() {
    int character;
    do {
        printf("Input Character: ");
        scanf("%c", &character);
        getchar();
    } while (character != 'q');
    
    return 0;
}
