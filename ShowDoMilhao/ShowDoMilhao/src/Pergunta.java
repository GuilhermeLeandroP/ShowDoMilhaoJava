import java.util.List;

public class Pergunta {
    private String enunciado;
    private List<String> alternativas;
    private int respostaCorreta;

    public Pergunta(String enunciado, List<String> alternativas, int respostaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public List<String> getAlternativas() {
        return alternativas;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }
}
