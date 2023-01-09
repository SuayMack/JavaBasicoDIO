public class Usuario {
  public static void main(String[] args) throws Exception{
    SmartTv smartTv = new SmartTv();
  

    smartTv.ligar();
    System.out.println("TV ligada? " + smartTv.ligada);
    System.out.println("Volume atual: " + smartTv.volume);
    System.out.println("Canal atual: " + smartTv.canal);
    smartTv.mudarCanal(13);
    System.out.println("Novo status ->canal? " + smartTv.canal);
    smartTv.aumentarCanal();
    System.out.println("Novo canal ->canal " + smartTv.canal);
    smartTv.diminuirCanal();
    System.out.println("Novo canal ->canal " + smartTv.canal);
  }
}
