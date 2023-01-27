/*
 * // IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final int SLICE = 4;
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();

    // TODO: Retorne o número de pizzas necessárias para atender o pedido. 
    
    while (T-->0) {
      int amigos = scanner.nextInt();
      int fatias = scanner.nextInt();

      if ((amigos * fatias) % SLICE == 0) {
        System.out.println((amigos * fatias) / SLICE);
      } else {
        System.out.println((amigos * fatias) / SLICE + 1);
      }
    }
    }
}
 */