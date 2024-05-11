import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner teclado = new Scanner(System.in);


        Integer numero;
        String agencia;
        String NomeCliente;
        Float saldo;

        System.out.println("Numero: (ENTER para confirmar)");
        numero = teclado.nextInt();

        System.out.println("Agencia: (ENTER para confirmar)");
        agencia = teclado.next();

        System.out.println("Nome do cliente: (ENTER para confirmar)");
        NomeCliente = teclado.next();

        System.out.println("Saldo da conta: (ENTER para confirmar)");
        saldo=teclado.nextFloat();


        System.out.println("Ola " + NomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta "+ numero + "e seu saldo " + saldo + "já está disponivel para saque");






    }
}
