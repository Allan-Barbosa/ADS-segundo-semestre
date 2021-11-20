import java.util.Scanner;
import javax.print.FlavorException;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ContaDeBanco conta = new ContaDeBanco();
        System.out.println("Digite 1 para saque e 2 para deposito: ");
        int escolha = teclado.nextInt();
        if (escolha == 1){
            conta.saca();
        }
        else{
            System.out.println("Digite o valor a ser depositado(use vírgula): ");
            float d = teclado.nextFloat();
            conta.deposita(d); 
        }
    }
}
