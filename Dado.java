import java.util.Random;

public class Dado extends Jogo {
    
    @Override
     public void setAposta(int aposta){
            if(aposta > 6 || aposta < 1)
                System.out.println("Valor invalido para o dado!");
            else
                super.setAposta(aposta);
    }
     
     @Override
     public void setResultado(int resultado){
        System.out.println("Nao pode roubar no dado..."); 
    }
    
    
    @Override
    public void jogaJogo() {
       int resultado; 
        
        Random dado = new Random();
        resultado = dado.nextInt(6)+1;
        
        super.setResultado(resultado);
    }
}
