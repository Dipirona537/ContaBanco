import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("---Conta de banco em Java---");
        System.out.print("Por favor, digite o seu numero de conta bancária: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println();

        System.out.print("Por favor digite sua agência: ");
        agencia = sc.nextLine();
        System.out.println();

        System.out.print("Por favor digite seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.println();

        System.out.print("Por favor, digite seu saldo: ");
        saldo = sc.nextFloat();
        sc.nextLine();
        System.out.println();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de R$"+saldo+" já está disponível para saque.");
    }
}
