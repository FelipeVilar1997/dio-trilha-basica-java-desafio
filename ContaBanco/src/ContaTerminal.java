import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[]args){        
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("*** Bem-vindo ao acesso a conta ***");

        System.out.println("Por favor, digite o número da Agência!");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo!");
        Double saldoConta = scanner.nextDouble(); 

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta +  "já está disponível para saque");
    }
}
