/*
 * // IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;  

public class PedraPapelTesoura {  
    public static void main(String[] args){  

        Scanner leitor = new Scanner(System.in);  

        int jogadaJogador = leitor.nextInt();  
        int jogadaInimigo = leitor.nextInt();  

     //TODO: Crie as condições necessárias para verificar quem vencerá o embate;
     
     if(jogadaJogador == jogadaInimigo)
      System.out.println("Empatou");
    else if(jogadaJogador == 1 & jogadaInimigo == 3)
      System.out.println("Ganhou");
    else if(jogadaJogador == 2 & jogadaInimigo == 1)
      System.out.println("Ganhou");
    else if(jogadaJogador == 3 & jogadaInimigo == 2)
      System.out.println("Ganhou");
    else 
      System.out.println("Perdeu");
     }
}
 */
