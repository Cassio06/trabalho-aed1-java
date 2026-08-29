package bubblesort;

import java.util.Comparator;

public class ProdutosPreco {

    public static void main(String[] args) {
        ProdutoPreco[] produtos = criarProdutosDemonstracao();

        try {
            BubbleSort.ordenar(produtos, Comparator.comparingDouble(ProdutoPreco::getPreco));

            System.out.println("Produtos do menor para o maior preço:");
            for (ProdutoPreco produto : produtos) {
                System.out.println(produto);
            }
        } catch (UnsupportedOperationException excecao) {
            System.out.println(excecao.getMessage());
        }
    }

    private static ProdutoPreco[] criarProdutosDemonstracao() {
        return new ProdutoPreco[]{
                new ProdutoPreco("Teclado", 120.00),
                new ProdutoPreco("Mouse", 65.90),
                new ProdutoPreco("Monitor", 899.90),
                new ProdutoPreco("Cabo HDMI", 32.50),
                new ProdutoPreco("Webcam", 210.00),
                new ProdutoPreco("Fone", 149.90),
                new ProdutoPreco("Hub USB", 75.00),
                new ProdutoPreco("Suporte", 89.90),
                new ProdutoPreco("Pendrive", 44.90),
                new ProdutoPreco("Caixa de Som", 180.00),
                new ProdutoPreco("Adaptador", 39.90),
                new ProdutoPreco("Microfone", 250.00)
        };
    }
}
