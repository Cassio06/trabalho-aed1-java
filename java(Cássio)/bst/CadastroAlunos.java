package bst;

public class CadastroAlunos {

    public static void main(String[] args) {
        Aluno[] alunos = criarAlunosDemonstracao();
        BST<Integer, Aluno> cadastro = new BST<>();

        try {
            for (Aluno aluno : alunos) {
                cadastro.inserir(aluno.getMatricula(), aluno);
            }

            int matriculaProcurada = 1008;
            System.out.println("Busca pela matrícula " + matriculaProcurada + ":");
            System.out.println(cadastro.buscar(matriculaProcurada));

            System.out.println("\nAlunos em ordem de matrícula:");
            cadastro.listarEmOrdem();
        } catch (UnsupportedOperationException excecao) {
            System.out.println(excecao.getMessage());
        }
    }

    private static Aluno[] criarAlunosDemonstracao() {
        Aluno[] alunos = new Aluno[20];
        String[] cursos = {"Computação", "Engenharia", "Matemática", "Administração"};

        for (int i = 0; i < alunos.length; i++) {
            int matricula = 1001 + ((i * 7) % alunos.length);
            alunos[i] = new Aluno(matricula, "Aluno " + (i + 1), cursos[i % cursos.length]);
        }

        return alunos;
    }
}
