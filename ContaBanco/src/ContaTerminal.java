import java.util.Scanner;

public class ContaTerminal {  

  public static void main(String[] args) throws Exception {
        
    int number;
    String agency;
    String firstName;
    String lastName;
    double saldo;

    try (Scanner entrada = new Scanner(System.in)) {
      System.out.println("Por favor, digite o número da Agência: ");
      agency = entrada.next();
      System.out.println("Por favor informe o número da conta: ");
      number = entrada.nextInt();
      System.out.println("Por favor informe seu primeiro nome: ");
      firstName = entrada.next();
      System.out.println("Por favor informe seu ultimo nome: ");
      lastName = entrada.next();
      System.out.println("Por informar valor de deposito: ");
      saldo = entrada.nextDouble();
    }

    System.out.println("Olá "+firstName+ lastName+
    ", obrigado por criar uma conta em nosso banco, sua agência é "
    +agency+", conta "+number+" e seu saldo R$ "+saldo+" ja esta disponivel para saque.");

  }
}
