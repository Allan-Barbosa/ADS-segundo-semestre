import java.util.Scanner;
import javax.print.FlavorException;
public class ContaDeBanco {
  Scanner teclado = new Scanner(System.in);
  int agencia;
  int numero;
  String nomeCliente;
  float saldo = 1000.0F;
  float saque;
  public float saca(){
    System.out.println("Digite o seu nome:");
    nomeCliente = teclado.nextLine();
    System.out.println("Digite o numero da agência:");
    agencia = teclado.nextInt();
    System.out.println("Digite o valor a ser sacado:");
    saque = teclado.nextFloat();
    if (saque<=saldo){
      System.out.println("O valor sacado foi: " + saque + " R$");
    }
    else{
      System.out.println("Valor da conta insuficiente: " + saldo + " R$");
    }
    return 0.1F;
  }
  public boolean deposita(float n){
    saldo += n;
    System.out.println("O novo saldo é: " + saldo);
    return true;
  }
}
