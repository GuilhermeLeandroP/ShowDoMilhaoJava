import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void TestandoOjogarComValoresChumbados() {
        String nomeArquivo = "perguntas.txt";
        String caminhoCompleto = System.getProperty("user.dir") + "/" + nomeArquivo;


        Apresentacao inicio = new Apresentacao();
        String nomeJogador = "Nome Jogador"; // Bote qualquer nome que quiser //
        int comecar = 1; // 1 = Começar e 2 = Não começar //
        inicio.apresentacaoTeste(nomeJogador, comecar);


        ShowDoMilhao showDoMilhao = new ShowDoMilhao();
        showDoMilhao.carregarPerguntas(caminhoCompleto);
        String respostaTeste = "B"; // Opções só entre A, B, C ou D //
        int opcoesTeste = 1; // Opções só entre 1 a 4 //
        showDoMilhao.jogarTeste(respostaTeste, opcoesTeste);


    }
}