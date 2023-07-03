public class Main {
    public static void main(String[] args) {
        String nomeArquivo = "perguntas.txt";
        String caminhoCompleto = System.getProperty("user.dir") + "/" + nomeArquivo;

        Apresentacao inicio = new Apresentacao();
        inicio.apresentacao();
        ShowDoMilhao jogo = new ShowDoMilhao();
        jogo.carregarPerguntas(caminhoCompleto);
        jogo.jogar();
    }
}
