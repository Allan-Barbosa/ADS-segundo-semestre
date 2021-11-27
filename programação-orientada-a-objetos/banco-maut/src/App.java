import java.util.Scanner;
import javax.print.FlavorException;
public class App {
    public static void main(String[] args) throws Exception {
        int continua=1;
        while (continua==1){
        Scanner teclado = new Scanner(System.in);

        Cliente cliente1 = new Cliente("allan","94738847326",10102001,"Picos-PI");
        Conta conta = new Conta(1041,1433,cliente1,1000);
        
        Cliente cliente2 = new Cliente("lucas","94843284326",25052003,"Picos-PI");
        Conta conta2 = new Conta(241,5523,cliente2,400);

        System.out.println("Digite 1 para ver o saldo, digite 2 para depositar, digite 3 para sacar, digite 4 para transferir dinheiro ou digite 5 para ver quantas contas temos no banco: ");
        int escolha = teclado.nextInt();
        if (escolha == 1){
            conta.getSaldo();
        }
        if (escolha == 2)
        {
            System.out.println("Digite o valor a ser depositado(use vírgula): ");
            double d = teclado.nextDouble();
            conta.deposita(d); 
        }
        if (escolha == 3)
        {
            System.out.println("Digite o valor a ser sacado(use vírgula): ");
            double d = teclado.nextDouble();
            conta.saque(d);
        }
        if (escolha == 4)
        {
            System.out.println("Digite o valor a ser transferido(use vírgula): ");
            double d = teclado.nextDouble();
            double f = conta.transferir(d);
            System.out.println("Digite o número da conta que irá receber a transferência: ");
            int a = teclado.nextInt();
            if (a==5523){
                System.out.println("Transferência realizada com sucesso.");
                System.out.println("Saldo da conta que recebeu a transferência: ");
                conta2.deposita(f);
            }
            else{
                System.out.println("Esta conta não existe no banco maut, seu dinheiro será devolvido");
                conta.deposita(f);
            }
        if (escolha == 5)
        {
            System.out.println("Quantidade de contas no Banco Maut: " + Conta.getQuantidadeDeContas());
        }
        }    
        System.out.println("Digite 1 para continuar e 0 para sair: ");
        continua = teclado.nextInt();

    }

    }
}
