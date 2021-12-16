import java.time.LocalDate;

// import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // int continua=1;
        // Scanner teclado = new Scanner(System.in);

        LocalDate dataNascimento = LocalDate.of(2002, 6, 15);
        Cliente cliente1 = new Cliente("allan", "000.000.000-00", dataNascimento,
                new Endereco("logradouro 1", 10, "bairro", "Picos", "PI"));
        Conta conta1 = new ContaPoupanca(1041, 1433, cliente1, 1000);

        Cliente cliente2 = new Cliente("lucas", "111.111.111-11", dataNascimento,
                new Endereco("logradouro 1", 11, "bairro", "Picos", "PI"));
        Conta conta2 = new ContaCorrente(241, 5523, cliente2, 400);

        conta2.saque(500);
        System.out.println(conta2.saldo);

        // while (continua==1){

        // System.out.println("Digite 1 para ver o saldo, digite 2 para depositar,
        // digite 3 para sacar, digite 4 para transferir dinheiro ou digite 5 para ver
        // quantas contas temos no banco: ");
        // int escolha = teclado.nextInt();
        // if (escolha == 1){
        // conta.getSaldo();
        // }
        // if (escolha == 2)
        // {
        // System.out.println("Digite o valor a ser depositado(use vírgula): ");
        // double d = teclado.nextDouble();
        // conta.deposita(d);
        // }
        // if (escolha == 3)
        // {
        // System.out.println("Digite o valor a ser sacado(use vírgula): ");
        // double d = teclado.nextDouble();
        // conta.saque(d);
        // }
        // if (escolha == 4)
        // {
        // System.out.println("Digite o valor a ser transferido(use vírgula): ");
        // double d = teclado.nextDouble();
        // conta.transferir(d,conta2);

        // }
        // if (escolha == 5)
        // {
        // System.out.println("Quantidade de contas no Banco Maut: " +
        // Conta.getQuantidadeDeContas());
        // }
        // System.out.println("Digite 1 para continuar e 0 para sair: ");
        // continua = teclado.nextInt();

        // }

    }
}
