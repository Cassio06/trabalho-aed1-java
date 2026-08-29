package avl;

public class IndiceCpf {

    public static void main(String[] args) {
        Funcionario[] funcionarios = criarFuncionariosDemonstracao();
        AVL<String, Funcionario> indice = new AVL<>();

        try {
            for (Funcionario funcionario : funcionarios) {
                indice.inserir(funcionario.getCpf(), funcionario);
            }

            String cpfProcurado = "000.000.000-13";
            System.out.println("Funcionário encontrado:");
            System.out.println(indice.buscar(cpfProcurado));
            System.out.println("Altura da AVL: " + indice.altura());
            System.out.println("Fator de balanceamento da raiz: " + indice.fatorBalanceamento());
        } catch (UnsupportedOperationException excecao) {
            System.out.println(excecao.getMessage());
        }
    }

    private static Funcionario[] criarFuncionariosDemonstracao() {
        Funcionario[] funcionarios = new Funcionario[25];
        String[] cargos = {"Analista", "Assistente", "Coordenador", "Técnico", "Gerente"};

        for (int i = 0; i < funcionarios.length; i++) {
            String cpf = String.format("000.000.000-%02d", i + 1);
            funcionarios[i] = new Funcionario(cpf, "Funcionário " + (i + 1), cargos[i % cargos.length]);
        }

        return funcionarios;
    }
}
