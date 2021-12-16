public class ContaCorrente extends Conta {

  private double chequeEspecial;

  public ContaCorrente(int agência, int número, Cliente cliente, double saldo) {
    super(agência, número, cliente, saldo);
    this.chequeEspecial = 100;
  }

  public double getChequeEspecial() {
    return chequeEspecial;
  }

  public void setChequeEspecial(double chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
  }

  @Override
  public boolean saque(double valor) {
    if (valor <= super.saldo + chequeEspecial) {
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