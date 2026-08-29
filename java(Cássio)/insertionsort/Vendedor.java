package insertionsort;

public class Vendedor {

    private final String nome;
    private final double totalVendido;

    public Vendedor(String nome, double totalVendido) {
        this.nome = nome;
        this.totalVendido = totalVendido;
    }

    public String getNome() {
        return nome;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    @Override
    public String toString() {
        return nome + " - total vendido: R$ " + String.format("%.2f", totalVendido);
    }
}
