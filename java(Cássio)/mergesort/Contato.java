package mergesort;

public class Contato {

    private final String nome;
    private final String informacaoContato;

    public Contato(String nome, String informacaoContato) {
        this.nome = nome;
        this.informacaoContato = informacaoContato;
    }

    public String getNome() {
        return nome;
    }

    public String getInformacaoContato() {
        return informacaoContato;
    }

    @Override
    public String toString() {
        return nome + " - " + informacaoContato;
    }
}
