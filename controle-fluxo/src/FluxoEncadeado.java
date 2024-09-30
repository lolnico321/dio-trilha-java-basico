public class FluxoEncadeado {
    public static void main(String[] args) {

        //fluxo encadeado
        
        int nota = 3;

          if (nota >= 7) 
            System.out.println("Aprovado");

          else if (nota >= 5 && nota < 7)
          System.out.println("Prova Recuperação");          
        
         else
            System.out.println("Reprovado");
    }
}
