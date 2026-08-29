package mergesort;

import java.time.LocalDateTime;
import java.util.Comparator;

public class TransacoesBancarias {

    public static void main(String[] args) {
        Transacao[] transacoes = criarTransacoesDemonstracao();

        try {
            MergeSort.ordenar(transacoes, Comparator.comparing(Transacao::getDataHora));

            System.out.println("Transações em ordem de data e hora:");
            for (Transacao transacao : transacoes) {
                System.out.println(transacao);
            }
        } catch (UnsupportedOperationException excecao) {
            System.out.println(excecao.getMessage());
        }
    }

    private static Transacao[] criarTransacoesDemonstracao() {
        Transacao[] transacoes = new Transacao[50];
        LocalDateTime inicio = LocalDateTime.of(2026, 8, 1, 8, 0);

        for (int i = 0; i < transacoes.length; i++) {
            int deslocamentoHoras = (i * 17) % transacoes.length;
            double valor = 25.0 + ((i * 43) % 600);
            transacoes[i] = new Transacao(
                    inicio.plusHours(deslocamentoHoras),
                    valor,
                    "Transação " + (i + 1)
            );
        }

        return transacoes;
    }
}
