public class ContaPoupanca extends Conta {

  private double rendimento;

  public ContaPoupanca(int agência, int número, Cliente cliente, double saldo) {
    super(agência, número, cliente, saldo);
    this.rendimento = 0.02;
  }

  public double getRendimento() {
    return rendimento;
  }

  public void setRendimento(double rendimento) {
    this.rendimento = rendimento;
  }

  @Override
  public boolean saque(double valor) {
    if (valor <= super.saldo) {
      super.saldo -= valor;
      System.out.println("Saldo da conta: " + super.saldo);
      super.enviaNotificacao("saque", valor);
      return true;
    } else {
      System.out.println("Valor inválido.");
      return false;
    }
  }
}