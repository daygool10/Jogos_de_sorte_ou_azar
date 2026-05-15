import java.util.Random;

public class Roleta extends Jogo{

     @Override
     public void setAposta(int aposta){
            if(aposta > 36 || aposta < 1)
                System.out.println("Valor invalido para a roleta!");
            else
                super.setAposta(aposta);
    }
    
     @Override
     public void setResultado(int resultado){
        System.out.println("Nao pode roubar na roleta..."); 
    }
    
    
    @Override
    public void jogaJogo() {
        int resultado; 
        
        Random roleta = new Random();
        
        resultado = roleta.nextInt(36)+1;
        super.setResultado(resultado);
    
    }
    
    
}
