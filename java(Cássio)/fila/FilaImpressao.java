package fila;

public class FilaImpressao {

    public static void main(String[] args) {
        TrabalhoImpressao[] trabalhos = criarTrabalhosDemonstracao();
        Fila<TrabalhoImpressao> filaImpressao = new Fila<>();

        try {
            for (TrabalhoImpressao trabalho : trabalhos) {
                filaImpressao.enqueue(trabalho);
            }

            System.out.println("Trabalhos aguardando: " + filaImpressao.size());
            while (!filaImpressao.isEmpty()) {
                System.out.println("Imprimindo: " + filaImpressao.dequeue());
            }
        } catch (UnsupportedOperationException excecao) {
            System.out.println(excecao.getMessage());
        }
    }

    private static TrabalhoImpressao[] criarTrabalhosDemonstracao() {
        return new TrabalhoImpressao[]{
                new TrabalhoImpressao("Ana", "algoritmos.pdf", 8),
                new TrabalhoImpressao("Bruno", "resumo.docx", 3),
                new TrabalhoImpressao("Carla", "atividade-01.pdf", 5),
                new TrabalhoImpressao("Daniel", "grafo.png", 1),
                new TrabalhoImpressao("Elisa", "relatorio.pdf", 12),
                new TrabalhoImpressao("Fabio", "codigo.txt", 4),
                new TrabalhoImpressao("Gabriela", "pesquisa.pdf", 7),
                new TrabalhoImpressao("Heitor", "trabalho-final.pdf", 15),
                new TrabalhoImpressao("Isabela", "exercicios.pdf", 6),
                new TrabalhoImpressao("Joao", "capa.docx", 2),
                new TrabalhoImpressao("Karen", "tabela.pdf", 3),
                new TrabalhoImpressao("Lucas", "seminario.pdf", 9)
        };
    }
}
