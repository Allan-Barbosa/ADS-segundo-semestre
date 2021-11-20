#include<stdio.h>
#include<stdlib.h>
// pesquisa-sequencial
int main(int argc, char const *argv[])
{
    // declaração de variável indexada
    int numeros[6],i,pesq,acha;
    // inserindo os numeros no vetor
    for (i=0;i<6;i++){
        printf("Digite o numero %d: ",i+1);
        scanf("%d", &numeros[i]);
    }
    // lendo o numero a ser pesquisado
    printf("Digite o numero a ser pesquisado: ");
    scanf("%d", &pesq);
    
    acha=0;
    i=0;
    while((i<6)&(acha==0)){
        if (pesq == numeros[i]){
            acha = 1;
        }
        else{
            i++;
        }
    }
    if (acha == 1){
        printf("o numero %d foi localizado na posicao %d",pesq,i+1);
    }
    else{
        printf("o numero %d nao foi localizado no vetor!",pesq);
    }
    return 0;
}
