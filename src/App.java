import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        final String[] classe = {"Mago", "Guerreiro", "Monje", "Ninja"} ;
        Heroi heroi = null;


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do seu herói: ");
        String nome = sc.nextLine();
        System.out.println("Qual a idade do seu herói ");
        int idade = sc.nextInt();
        System.out.println("Agora escolha o tipo de herói? ");
        int i = 1;
        for (String string : classe) {
            System.out.println("(" + i + ") - " + string);
            i++;
        }
        System.out.println("Escolha agora:");
        int tipo = sc.nextInt();
        sc.close();

        switch (tipo) {
            case 1:
                heroi = new Mago(nome, idade);
                heroi.atacar();
                break;

            case 2:
                heroi  = new Guerreiro(nome, idade);
                heroi.atacar();
                break;

            case 3:
                heroi  = new Monje(nome, idade);
                heroi.atacar();
                break;
            case 4:
                heroi = new Ninja(nome, idade);
                heroi.atacar();
                break;    
            default:
                System.out.println("Tipo de herói invalido");
                break;
        }

        


    }
}
