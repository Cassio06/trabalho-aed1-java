package avl;

public class Jogador {

    private final String nome;
    private final int pontuacao;

    public Jogador(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return nome + " - " + pontuacao + " ponto(s)";
    }
}
