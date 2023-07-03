import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowDoMilhao {
    private List<Pergunta> perguntas;

    public ShowDoMilhao() {
        perguntas = new ArrayList<>();
    }

    public void carregarPerguntas(String nomeArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String enunciado = linha;
                List<String> alternativas = new ArrayList<>();

                for (int i = 0; i < 4; i++) {
                    linha = br.readLine();
                    if (linha != null) {
                        alternativas.add(linha.substring(3));
                    } else {
                        alternativas.add("");
                    }
                }

                linha = br.readLine();
                int respostaCorreta;
                if (linha != null && !linha.trim().isEmpty()) {
                    respostaCorreta = Integer.parseInt(linha.trim());
                } else {
                    respostaCorreta = 0;
                }

                Pergunta pergunta = new Pergunta(enunciado, alternativas, respostaCorreta);
                perguntas.add(pergunta);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de perguntas: " + e.getMessage());
        }
    }

    public void jogar() {
        int pontuacao = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < perguntas.size(); i++) {
            Pergunta pergunta = perguntas.get(i);
            System.out.println(pergunta.getEnunciado());

            List<String> alternativas = pergunta.getAlternativas();
            for (int j = 0; j < alternativas.size(); j++) {
                System.out.println((char) ('A' + j) + ") " + alternativas.get(j));
            }

            System.out.print("Digite a letra correspondente à resposta: ");
            String resposta = scanner.nextLine().toUpperCase();

            if (resposta.length() > 0) {
                char opcao = resposta.charAt(0);
                int indiceResposta = opcao - 'A';

                if (indiceResposta >= 0 && indiceResposta < alternativas.size()) {
                    if (indiceResposta == pergunta.getRespostaCorreta()) {
                        System.out.println("Resposta correta!");
                        pontuacao++;
                    } else {
                        System.out.println("Resposta incorreta!");
                        break;
                    }
                } else {
                    System.out.println("Opção inválida!");
                    break;
                }
            } else {
                System.out.println("Opção inválida!");
                break;
            }

            System.out.println();
            
            Opcoes opcoes = new Opcoes(pontuacao);
            opcoes.lista();
            if (i == 9 && pontuacao == 10) {
                System.out.println("Parabéns! Você acertou as 10 perguntas!");
                System.out.println("E ganhou UM MILHÃO DE REAIS!!!");
                System.out.println("Até a próxima partida!");
                System.exit(0);
            }
        }

        System.out.println("Fim de jogo! Dinheiro perdido: " + (pontuacao * 100000));
    }
    public void jogarTeste(String respostaTeste,int opcoesTeste) {
        int pontuacao = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < perguntas.size(); i++) {
            Pergunta pergunta = perguntas.get(i);
            System.out.println(pergunta.getEnunciado());

            List<String> alternativas = pergunta.getAlternativas();
            for (int j = 0; j < alternativas.size(); j++) {
                System.out.println((char) ('A' + j) + ") " + alternativas.get(j));
            }

            System.out.print("Digite a letra correspondente à resposta: ");
            String resposta = respostaTeste;

            if (resposta.length() > 0) {
                char opcao = resposta.charAt(0);
                int indiceResposta = opcao - 'A';

                if (indiceResposta >= 0 && indiceResposta < alternativas.size()) {
                    if (indiceResposta == pergunta.getRespostaCorreta()) {
                        System.out.println("Resposta correta!");
                        pontuacao++;
                    } else {
                        System.out.println("Resposta incorreta!");
                        break;
                    }
                } else {
                    System.out.println("Opção inválida!");
                    break;
                }
            } else {
                System.out.println("Opção inválida!");
                break;
            }

            System.out.println();

            Opcoes opcoes = new Opcoes(pontuacao);
            opcoes.listaTeste(opcoesTeste);
            if (i == 9 && pontuacao == 10) {
                System.out.println("Parabéns! Você acertou as 10 perguntas!");
                System.out.println("E ganhou UM MILHÃO DE REAIS!!!");
                System.out.println("Até a próxima partida!");
                System.exit(0);
            }
        }

        System.out.println("Fim de jogo! Dinheiro perdido: " + (pontuacao * 100000));
    }
}
