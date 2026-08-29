package bubblesort;

public class NotaAluno {

    private final String nome;
    private final double nota;

    public NotaAluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nome + " - nota: " + nota;
    }
}
