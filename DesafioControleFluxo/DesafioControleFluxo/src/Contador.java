import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();

    try {
      contar(parametroUm, parametroDois);

    }catch (ParametrosInvalidosException exception) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    } 
    terminal.close();
  }
  static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
    if (parametroUm > parametroDois)
        throw new ParametrosInvalidosException();
    else {
        int contagem = parametroDois - parametroUm;

    for (int resultado = 1; resultado<=contagem; resultado++)
        System.out.println(resultado);
    }
  }

}
