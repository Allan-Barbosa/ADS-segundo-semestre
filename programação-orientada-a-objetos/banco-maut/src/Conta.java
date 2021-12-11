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
    System.out.println("Saldo da conta: " + this.saldo);
    this.enviaNotificacao("deposito",valor);
    }
    else
    {
      System.out.println("Valor inválido.");
    }
  }
  public boolean saque(double valor)
  {
    if (valor <= this.saldo){
      this.saldo -= valor;
      System.out.println("Saldo da conta: " + this.saldo);
      this.enviaNotificacao("saque",valor);
      return true;}
    else{
      System.out.println("Valor inválido.");
      return false;
    }
  }
  public void transferir(double valor, Conta contaDestino)
  {
    boolean saqueComSucesso = this.saque(valor);
    if (saqueComSucesso){
    contaDestino.deposita(valor);
    System.out.println("Transferência concluída.");
    this.enviaNotificacao("transfere",valor);
    }
  }

  private void enviaNotificacao(String operacao,double valor) {
    new Notificacao().enviaNotificacao(operacao,valor);
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
