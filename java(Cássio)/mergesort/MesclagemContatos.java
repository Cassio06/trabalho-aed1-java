package mergesort;

import java.util.Comparator;

public class MesclagemContatos {

    public static void main(String[] args) {
        Contato[] primeiraLista = criarLista("A", 20);
        Contato[] segundaLista = criarLista("B", 20);
        Contato[] todosOsContatos = juntar(primeiraLista, segundaLista);

        try {
            MergeSort.ordenar(todosOsContatos, Comparator.comparing(Contato::getNome));

            System.out.println("Contatos mesclados em ordem alfabética:");
            for (Contato contato : todosOsContatos) {
                System.out.println(contato);
            }
        } catch (UnsupportedOperationException excecao) {
            System.out.println(excecao.getMessage());
        }
    }

    private static Contato[] criarLista(String identificador, int quantidade) {
        Contato[] contatos = new Contato[quantidade];

        for (int i = 0; i < contatos.length; i++) {
            int numero = contatos.length - i;
            String nome = "Contato " + identificador + String.format("%02d", numero);
            String email = identificador.toLowerCase() + numero + "@exemplo.com";
            contatos[i] = new Contato(nome, email);
        }

        return contatos;
    }

    private static Contato[] juntar(Contato[] primeiraLista, Contato[] segundaLista) {
        Contato[] contatos = new Contato[primeiraLista.length + segundaLista.length];

        for (int i = 0; i < primeiraLista.length; i++) {
            contatos[i] = primeiraLista[i];
        }

        for (int i = 0; i < segundaLista.length; i++) {
            contatos[primeiraLista.length + i] = segundaLista[i];
        }

        return contatos;
    }
}
