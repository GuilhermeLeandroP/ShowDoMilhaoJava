import java.util.Scanner;

public class Opcoes {

    private Scanner scanner;
    private int pontuacao;

    public Opcoes(int pontuacao) {
        scanner = new Scanner(System.in);
        this.pontuacao = pontuacao;
    }

    public void lista() {
        System.out.println("\n\n\nO que você deseja fazer? ");
        listaOpcoes();
    }

    public void listaOpcoes() {

        System.out.println("\n1 - Continuar");
        System.out.println("2 - Parar");
        System.out.println("3 - Consultar Pontuação");
        System.out.println("4 - Consultar Regras");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Boa escolha");
                break;
            case 2:
                System.out.println("Infelizmente sua trajetória no show do milhão acaba por aqui!");
                System.out.println("Mas você leva para casa uma quantia de...");
                System.out.println((pontuacao * 100000)+" REAIS!!!!");
                System.exit(0);
                break;

            case 3:
                System.out.println("Sua pontuação é de: " + pontuacao);
                System.out.println("Seu dinheiro atual é de: " + (pontuacao * 100000));
                listaOpcoes();
                break;
            
            case 4: 
                regras();
                listaOpcoes();
                break;
                
            default:
                System.out.println("OPÇÃO INVÁLIDA!!!");
                listaOpcoes();
                break;
        }
    }

    public void listaTeste(int opcoesTeste) {
        System.out.println("\n\n\nO que você deseja fazer? ");
        listaopcoesTeste(opcoesTeste);
    }
    public void listaopcoesTeste(int opcoesTeste) {

        System.out.println("\n1 - Continuar");
        System.out.println("2 - Parar");
        System.out.println("3 - Consultar Pontuação");
        System.out.println("4 - Consultar Regras");

        int escolha = opcoesTeste;

        switch (escolha) {
            case 1:
                System.out.println("Boa escolha");
                break;
            case 2:
                System.out.println("Infelizmente sua trajetória no show do milhão acaba por aqui!");
                System.out.println("Mas você leva para casa uma quantia de...");
                System.out.println((pontuacao * 100000)+" REAIS!!!!");
                System.exit(0);
                break;

            case 3:
                System.out.println("Sua pontuação é de: " + pontuacao);
                System.out.println("Seu dinheiro atual é de: " + (pontuacao * 100000));
                listaOpcoes();
                break;

            case 4:
                regras();
                listaOpcoes();
                break;

            default:
                System.out.println("OPÇÃO INVÁLIDA!!!");
                listaOpcoes();
                break;
        }
    }

    public void regras() {
        System.out.println("\n\n\nRegras do jogo:");
        System.out.println("- Responda corretamente às perguntas para ganhar dinheiro.");
        System.out.println("- Cada pergunta tem um conjunto de alternativas, escolha a correta entre A e D.");
        System.out.println("- Caso responda incorretamente, o jogo é encerrado e vocè perde todo o dinheiro.");
        System.out.println("- Acerte todas as 10 perguntas para ganhar UM MILHÃO DE REAIS.");
        System.out.println("- Cada pergunta vale 100 mil reais.");
        System.out.println("- Após cada rodada, poderá abandonar e levar o dinheiro");
        System.out.println("- Divirta-se jogando o Show do Milhão!");
    }
}
