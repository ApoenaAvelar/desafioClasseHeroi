public class Monje extends Heroi{

    public Monje(String nome, int idade) {
        super(nome, idade);
        
    }

    @Override
    public void atacar() {
        System.out.println("O Monje atacou usando artes marciais");
    }
    
}
