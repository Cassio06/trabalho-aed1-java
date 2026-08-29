package insertionsort;

import java.util.Comparator;

public class RankingVendedores {

    public static void main(String[] args) {
        Vendedor[] vendedores = criarVendedoresComSeteDiasDeVendas();
        Comparator<Vendedor> maiorTotalPrimeiro = Comparator
                .comparingDouble(Vendedor::getTotalVendido)
                .reversed();

        try {
            InsertionSort.ordenar(vendedores, maiorTotalPrimeiro);

            System.out.println("Ranking de vendas dos sete dias:");
            for (int i = 0; i < vendedores.length; i++) {
                System.out.println((i + 1) + "º - " + vendedores[i]);
            }
        } catch (UnsupportedOperationException excecao) {
            System.out.println(excecao.getMessage());
        }
    }

    private static Vendedor[] criarVendedoresComSeteDiasDeVendas() {
        Vendedor[] vendedores = new Vendedor[10];

        for (int vendedor = 0; vendedor < vendedores.length; vendedor++) {
            double total = 0.0;

            for (int dia = 0; dia < 7; dia++) {
                total += 100.0 + (vendedor * 23.0) + (dia * 17.5);
            }

            vendedores[vendedor] = new Vendedor("Vendedor " + (vendedor + 1), total);
        }

        return vendedores;
    }
}
