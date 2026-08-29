package mergesort;

import java.time.LocalDateTime;

public class Transacao {

    private final LocalDateTime dataHora;
    private final double valor;
    private final String descricao;

    public Transacao(LocalDateTime dataHora, double valor, String descricao) {
        this.dataHora = dataHora;
        this.valor = valor;
        this.descricao = descricao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return dataHora + " - R$ " + String.format("%.2f", valor) + " - " + descricao;
    }
}
