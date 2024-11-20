import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome !");
        String cliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta !");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo bancário !");
        double saldo = scanner.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque ", cliente, agencia, conta, saldo);

        System.out.println();

    }

}