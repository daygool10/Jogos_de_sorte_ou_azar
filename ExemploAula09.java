public class ExemploAula09 {

    public static void main(String[] args) {
        Dado d1 = new Dado();
        Roleta r1 = new Roleta();
      
        d1.jogaJogo();
        d1.setAposta(6);
        d1.mostraResultado();
        
        r1.jogaJogo();
        r1.setAposta(13);
        r1.mostraResultado();
      
    }
}
