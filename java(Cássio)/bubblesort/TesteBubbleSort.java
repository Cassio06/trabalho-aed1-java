package bubblesort;

import java.util.Comparator;

public class TesteBubbleSort {

    public static void main(String[] args) {
        executar("vetor vazio", () -> testar(new Integer[]{}, new Integer[]{}));
        executar("um elemento", () -> testar(new Integer[]{7}, new Integer[]{7}));
        executar("vários elementos", () -> testar(
                new Integer[]{4, 1, 5, 2, 3},
                new Integer[]{1, 2, 3, 4, 5}
        ));
        executar("ordem normal", () -> testar(
                new Integer[]{1, 2, 3, 4, 5},
                new Integer[]{1, 2, 3, 4, 5}
        ));
        executar("ordem inversa", () -> testar(
                new Integer[]{5, 4, 3, 2, 1},
                new Integer[]{1, 2, 3, 4, 5}
        ));
        executar("elementos repetidos", () -> testar(
                new Integer[]{3, 1, 3, 2, 1},
                new Integer[]{1, 1, 2, 3, 3}
        ));
    }

    private static void testar(Integer[] valores, Integer[] esperado) {
        BubbleSort.ordenar(valores, Comparator.naturalOrder());
        verificarMesmaOrdem(valores, esperado);
    }

    private static void verificarMesmaOrdem(Integer[] atual, Integer[] esperado) {
        if (atual.length != esperado.length) {
            throw new AssertionError("o tamanho do vetor foi alterado");
        }

        for (int i = 0; i < atual.length; i++) {
            if (!atual[i].equals(esperado[i])) {
                throw new AssertionError("ordem incorreta na posição " + i);
            }
        }
    }

    private static void executar(String nome, Runnable casoDeTeste) {
        try {
            casoDeTeste.run();
            System.out.println("[OK] " + nome);
        } catch (UnsupportedOperationException excecao) {
            System.out.println("[PENDENTE] " + nome + " - " + excecao.getMessage());
        } catch (AssertionError erro) {
            System.out.println("[FALHOU] " + nome + " - " + erro.getMessage());
        } catch (RuntimeException excecao) {
            System.out.println("[REVISAR] " + nome + " - " + excecao);
        }
    }
}
