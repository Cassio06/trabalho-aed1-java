package avl;

public class Funcionario {

    private final String cpf;
    private final String nome;
    private final String cargo;

    public Funcionario(String cpf, String nome, String cargo) {
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return cpf + " - " + nome + " - " + cargo;
    }
}
