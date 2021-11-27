#include <stdio.h>
#include <stdlib.h>

int *bublesort(int *numeros);

int main(int argc, char const *argv[])
{
  int comeco, final, meio, pesq;
  int A[12] = {91, 81, 77, 62, 36, 22, 21, 14, 10, 8, 7, 4};
  int *numeros;
  numeros = bublesort(A);
  comeco = 0;
  final = 11;

  for (int i = 0; i < 12; i++)
  {
    printf("%d,", numeros[i]);
  }
  meio = (int)(comeco + final) / 2;
  printf("Digite o numero para busca:\n");
  scanf("%d", &pesq);
  while (comeco <= final)
  {
    if (numeros[meio] < pesq)
      comeco = meio + 1;
    else if (numeros[meio] == pesq)
    {
      printf("%d foi encontrado na posicao:%d\n", pesq, meio);
      break;
    }
    else
      final = meio - 1;
    meio = (int)(comeco + final) / 2;
  }
  if (comeco > final)
  {
    printf("O numero %d nao esta no vetor.", pesq);
  }
  return 0;
}

int *bublesort(int *numeros)
{
  int aux;
  for (int t = 0; t < 12; t++)
  {
    for (int i = t + 1; i < 12; i++)
    {
      if (numeros[t] > numeros[i])
      {
        aux = numeros[t];
        numeros[t] = numeros[i];
        numeros[i] = aux;
      }
    }
  }
  return (numeros);
}