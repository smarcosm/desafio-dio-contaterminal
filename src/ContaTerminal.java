import java.util.Scanner;

public class ContaTerminal {
    String agencia;
    int numero;
    String nomeCliente;
    float saldo;

    public ContaTerminal(){}

    public static void main(String[] args) {

        ContaTerminal contaTerminal = new ContaTerminal();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua Agência!");
        contaTerminal.agencia = scanner.next();
        System.out.println("Por favor, digite o número da sua Conta!");
        contaTerminal.numero = scanner.nextInt();
        System.out.println("Por favor, digite o seu Nome!");
        contaTerminal.nomeCliente = scanner.next();
        System.out.println("Por favor, digite o seu Saldo!");
        contaTerminal.saldo = scanner.nextFloat();

        System.out.println("Olá "+
                contaTerminal.nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+
                contaTerminal.agencia+", conta "+
                contaTerminal.numero +" e seu saldo "+
                contaTerminal.saldo +" já está disponível para saque");
    }
}