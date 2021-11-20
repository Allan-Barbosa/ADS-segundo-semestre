public class Curso {
  String nome;
  int cargaHoraria;
  float notaAvaliacao;
  boolean estaAtivo;

  public void media(float n1, float n2, float n3){
    float soma = n1 + n2 + n3;
    float media = soma / 3;
    System.out.println("média: " + media);
  }
}
