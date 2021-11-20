#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    float notas[4],media,soma=0;
    // ler as notas dos alunos
    for (int i=0;i<=3;i++){
        printf("Digite a nota %d: ",i+1);
        scanf("%f", &notas[i]);
        soma+=notas[i];
    }
    media=soma/4;
    printf("A media do aluno e: %.2f",media);
    printf("");
    return 0;
}
