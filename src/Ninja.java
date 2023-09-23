public class Ninja extends Heroi{

    public Ninja(String nome, int idade) {
        super(nome, idade);
        
    }

    @Override
    public void atacar() {
        System.out.println("O Ninja atacou usando shuriken");
    }
    
}
