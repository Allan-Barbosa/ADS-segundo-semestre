import java.util.Scanner;
import javax.print.FlavorException;
public class Conta {
  Scanner teclado = new Scanner(System.in);
  private int agência;
  private int número;
  private double saldo;
  private Cliente cliente;
  private static int quantidadeDeContas;
  
  public Conta(int agência, int número, Cliente cliente,double saldo)
  {
    this.agência = agência;
    this.número = número;
    this.cliente = cliente;
    quantidadeDeContas++;
    this.saldo=saldo;
  }

  public void deposita(double valor)
  {
    if (valor >= 0){
    this.saldo += valor;
    System.out.println("Novo saldo: " + this.saldo);
    }
    else
    {
      System.out.println("Valor inválido.");
    }
  }
  public void saque(double valor)
  {
    if (valor <= this.saldo){this.saldo -= valor;
      System.out.println("Novo saldo: " + this.saldo);}
    else{
      System.out.println("Valor inválido.");
    }
  }
  public double transferir(double valor)
  {
    if (valor <= saldo)
    {
      this.saldo -=valor;
      System.out.println("Novo saldo: " + this.saldo);
      return valor;
    }
    else{
      System.out.println("Valor inválido.");
      return 0.0;
    }
  }

  public int getAgência() {
    return this.agência;
  }

  public int getNúmero() {
    return this.número;
  }

  public void getSaldo() {
    System.out.println("Saldo: " + this.saldo);
  }

  public Cliente getCliente() {
    return this.cliente;
  }

  public static int getQuantidadeDeContas() {
    return quantidadeDeContas;
  }
  
}
