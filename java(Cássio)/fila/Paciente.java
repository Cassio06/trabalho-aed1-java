package fila;

public class Paciente {

    private final String nome;
    private final String horarioChegada;
    private final String tipoAtendimento;

    public Paciente(String nome, String horarioChegada, String tipoAtendimento) {
        this.nome = nome;
        this.horarioChegada = horarioChegada;
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getNome() {
        return nome;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    @Override
    public String toString() {
        return nome + " - chegada: " + horarioChegada + " - atendimento: " + tipoAtendimento;
    }
}
