#include<stdio.h>
#include<stdlib.h>
//algoritmo de ordenação bublesort
int main(int argc, char const *argv[])
{
    int aux;
    int numeros[5]={5,4,3,2,1};
    for (int j=0;j<5;j++){
        for (int i=j+1;i<5;i++)
        {
            if (numeros[j]>numeros[i])
            {
                aux = numeros[j];
                numeros[j]=numeros[i];
                numeros[i]=aux;
            }
        }
    printf("%d,",numeros[j]);
    }
    return 0;
}
