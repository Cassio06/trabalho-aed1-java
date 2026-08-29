package fila;

public class TrabalhoImpressao {

    private final String aluno;
    private final String arquivo;
    private final int numeroPaginas;

    public TrabalhoImpressao(String aluno, String arquivo, int numeroPaginas) {
        this.aluno = aluno;
        this.arquivo = arquivo;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAluno() {
        return aluno;
    }

    public String getArquivo() {
        return arquivo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return aluno + " - " + arquivo + " - " + numeroPaginas + " página(s)";
    }
}
