/*
 * // IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner; 
 
public class RPG { 
  public static void main(String[] args){ 
    Scanner leitor = new Scanner(System.in); 
 
    int dados = leitor.nextInt(); 
    int vidaDoJogador = leitor.nextInt(); 
    int ataqueDoJogador= leitor.nextInt(); 
    int defesaDoJogador = leitor.nextInt(); 
    int vidaDoInimigo= leitor.nextInt(); 
    int ataqueDoInimigo = leitor.nextInt();

    //TODO: Crie as condições necessárias para verificar se o jogador vai sobreviver, e contra-atacar, ou morrer;
    int critico = dados * 2;
    int danoJogador = (vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados)));
    int danoInimigo = (vidaDoInimigo - (ataqueDoJogador + dados));
    
    
    if(dados == 9){
      ataqueDoJogador += critico;   
      defesaDoJogador += critico;
    }
    
    if(danoJogador <= 0){
      System.out.println("Jogador nao sobreviveu" );
    }else if(danoJogador > 0 && danoInimigo > 0){
      System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
    }else{
      System.out.println("Jogador sobreviveu e derrotou o inimigo");
    }
  }
}
 */
