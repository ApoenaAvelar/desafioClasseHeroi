public class Guerreiro extends Heroi{

    public Guerreiro(String nome, int idade) {
        super(nome, idade);
        
    }

    @Override
    public void atacar() {
        System.out.println("O Guerreiro atacou usando espada");
    }
    
}
