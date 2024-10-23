import java.util.Scanner;

abstract class Personagem {
    protected String nome;
    protected int hp; // Vida
    protected int sp; // Alma

    public Personagem(String nome) {
        this.nome = nome;
        this.hp = 100; // HP inicial
        this.sp = 100; // SP inicial
    }

    public abstract void habilidade();

    public void status() {
        System.out.println("Nome: " + nome);
        System.out.println("HP: " + hp);
        System.out.println("SP: " + sp);
    }
}

class Mago extends Personagem {
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void habilidade() {
        System.out.println(nome + " conjura uma magia arcana!");
        sp -= 10; // Custa 10 SP para conjurar uma magia
    }
}

class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void habilidade() {
        System.out.println(nome + " usa uma armadura pesada!");
        hp += 20; // Recupera 20 HP
    }
}

class Sacerdote extends Personagem {
    public Sacerdote(String nome) {
        super(nome);
    }

    @Override
    public void habilidade() {
        System.out.println(nome + " realiza um milagre divino!");
        sp -= 15; // Custa 15 SP para fazer um milagre
    }
}

class Ladrao extends Personagem {
    public Ladrao(String nome) {
        super(nome);
    }

    @Override
    public void habilidade() {
        System.out.println(nome + " fica invisível!");
        sp -= 5; // Custa 5 SP para ficar invisível
    }
}

public class JogoRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do seu personagem: ");
        String nome = scanner.nextLine();

        System.out.println("Escolha uma classe:");
        System.out.println("1. Mago");
        System.out.println("2. Guerreiro");
        System.out.println("3. Sacerdote");
        System.out.println("4. Ladrão");

        int escolha = scanner.nextInt();
        Personagem personagem = null;

        switch (escolha) {
            case 1:
                personagem = new Mago(nome);
                break;
            case 2:
                personagem = new Guerreiro(nome);
                break;
            case 3:
                personagem = new Sacerdote(nome);
                break;
            case 4:
                personagem = new Ladrao(nome);
                break;
            default:
                System.out.println("Classe inválida! O jogo será encerrado.");
                return;
        }

        boolean jogoAtivo = true;

        while (jogoAtivo) {
            System.out.println("\nStatus do personagem:");
            personagem.status();
            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Usar habilidade");
            System.out.println("2. Sair do jogo");

            int acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    personagem.habilidade();
                    break;
                case 2:
                    jogoAtivo = false;
                    break;
                default:
                    System.out.println("Ação inválida! Tente novamente.");
            }
        }

        System.out.println("Jogo encerrado. Até a próxima!");
        scanner.close();
    }
}
