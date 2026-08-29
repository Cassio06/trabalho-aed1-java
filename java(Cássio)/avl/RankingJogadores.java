package avl;

public class RankingJogadores {

    public static void main(String[] args) {
        Jogador[] jogadores = criarJogadoresDemonstracao();
        AVL<Integer, Jogador> ranking = new AVL<>();

        try {
            for (Jogador jogador : jogadores) {
                ranking.inserir(jogador.getPontuacao(), jogador);
            }

            int pontuacaoProcurada = 705;
            System.out.println("Jogador com " + pontuacaoProcurada + " pontos:");
            System.out.println(ranking.buscar(pontuacaoProcurada));
            System.out.println("Altura do ranking: " + ranking.altura());

            // TODO: percorrer a AVL por pontuação decrescente para exibir o ranking completo.
        } catch (UnsupportedOperationException excecao) {
            System.out.println(excecao.getMessage());
        }
    }

    private static Jogador[] criarJogadoresDemonstracao() {
        Jogador[] jogadores = new Jogador[30];

        for (int i = 0; i < jogadores.length; i++) {
            int pontuacao = 520 + ((i * 37) % 300);
            jogadores[i] = new Jogador("Jogador " + (i + 1), pontuacao);
        }

        return jogadores;
    }
}
