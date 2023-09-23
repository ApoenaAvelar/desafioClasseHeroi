public class Mago extends Heroi{

    public Mago(String nome, int idade) {
        super(nome, idade);
        
    }

    @Override
    public void atacar() {

        System.out.println("O mago atacou usando magia");
        
    }
    
}
