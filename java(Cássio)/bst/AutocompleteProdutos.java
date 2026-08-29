package bst;

public class AutocompleteProdutos {

    public static void main(String[] args) {
        Produto[] produtos = criarProdutosDemonstracao();
        BST<String, Produto> catalogo = new BST<>();

        try {
            for (Produto produto : produtos) {
                catalogo.inserir(produto.getNome().toLowerCase(), produto);
            }

            String nomeExato = "caderno";
            System.out.println("Busca exata por \"" + nomeExato + "\":");
            System.out.println(catalogo.buscar(nomeExato));

            String prefixo = "ca";
            System.out.println("\nPrefixo para autocomplete: " + prefixo);
            // TODO: adaptar a travessia da BST para exibir somente nomes com o prefixo.
            catalogo.listarEmOrdem();
        } catch (UnsupportedOperationException excecao) {
            System.out.println(excecao.getMessage());
        }
    }

    private static Produto[] criarProdutosDemonstracao() {
        String[] nomes = {
                "Agenda", "Apontador", "Borracha", "Caderno", "Calculadora",
                "Caneta Azul", "Caneta Preta", "Caneta Vermelha", "Cartolina", "Clips",
                "Cola Bastao", "Compasso", "Corretivo", "Estojo", "Etiqueta",
                "Fichario", "Giz de Cera", "Grampeador", "Lapis", "Lapiseira",
                "Livro", "Marcador", "Mochila", "Papel A4", "Pasta",
                "Regua", "Tesoura", "Tinta Guache", "Transferidor", "Universitario"
        };
        Produto[] produtos = new Produto[nomes.length];

        for (int i = 0; i < nomes.length; i++) {
            produtos[i] = new Produto(nomes[i]);
        }

        return produtos;
    }
}
