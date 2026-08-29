package bubblesort;

import java.util.Comparator;

public class NotasTurma {

    public static void main(String[] args) {
        NotaAluno[] notas = criarNotasDemonstracao();

        try {
            BubbleSort.ordenar(notas, Comparator.comparingDouble(NotaAluno::getNota));

            System.out.println("Notas em ordem crescente:");
            for (NotaAluno notaAluno : notas) {
                System.out.println(notaAluno);
            }
        } catch (UnsupportedOperationException excecao) {
            System.out.println(excecao.getMessage());
        }
    }

    private static NotaAluno[] criarNotasDemonstracao() {
        NotaAluno[] notas = new NotaAluno[20];

        for (int i = 0; i < notas.length; i++) {
            double nota = ((i * 13) % 21) / 2.0;
            notas[i] = new NotaAluno("Aluno " + (i + 1), nota);
        }

        return notas;
    }
}
