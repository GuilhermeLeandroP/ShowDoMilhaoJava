import java.util.Scanner;

public class Apresentacao {
    private String nome;
    private Scanner scanner;

    public Apresentacao() {
        scanner = new Scanner(System.in);
    }

    public void apresentacao() {
        bemvindo();
        pegarNomeJogador();
        comecar();
    }

    private void bemvindo() {
        System.out.println("MAHOEEEEE!!!! Bem vindo ao show do milhão!!!!");
    }

    public void pegarNomeJogador() {
        System.out.println("Qual é o nome do próximo milionário?");
        nome = scanner.nextLine();
    }

    public void comecar() {
        System.out.println("Vamos começar " + nome + "?");
        confirmar();
    }

    public void confirmar() {
        System.out.println("1 - SIM");
        System.out.println("2 - NÃO");

        String iniciar = scanner.nextLine();
        switch (iniciar) {
            case "1":
                System.out.println("Vamos lá!");
                break;
            case "2":
                System.out.println("Encerrando o show do milhão...");
                System.exit(0);
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                confirmar();
                break;
        }
    }








    public void apresentacaoTeste(String nomeJogador, int comecar) {
        bemvindo();
        pegarNomeJogadorTeste(nomeJogador);
        comecarTeste(comecar);
    }

    public void pegarNomeJogadorTeste(String nomeJogador) {
        System.out.println("Qual é o nome do próximo milionário?");
        nome = nomeJogador;
    }

    public void comecarTeste(int comecar) {
        System.out.println("Vamos começar " + nome + "?");
        confirmarTeste(comecar);
    }

    public void confirmarTeste(int comecar) {
        System.out.println("1 - SIM");
        System.out.println("2 - NÃO");

        String iniciar = String.valueOf(comecar);
        switch (iniciar) {
            case "1":
                System.out.println("Vamos lá!");
                break;
            case "2":
                System.out.println("Encerrando o show do milhão...");
                System.exit(0);
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                confirmar();
                break;
        }
    }

}
