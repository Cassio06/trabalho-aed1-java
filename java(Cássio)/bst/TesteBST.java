package bst;

public class TesteBST {

    public static void main(String[] args) {
        executar("árvore vazia", TesteBST::testarArvoreVazia);
        executar("um elemento", TesteBST::testarUmElemento);
        executar("ordem normal", TesteBST::testarOrdemNormal);
        executar("ordem inversa", TesteBST::testarOrdemInversa);
        executar("chave repetida", TesteBST::testarChaveRepetida);
        executar("busca e remoção inexistentes", TesteBST::testarChaveInexistente);
        executar("remoção existente", TesteBST::testarRemocaoExistente);
    }

    private static void testarArvoreVazia() {
        BST<Integer, String> arvore = new BST<>();
        verificar(arvore.buscar(10) == null, "a busca vazia deve devolver null");
        verificar(arvore.remover(10) == null, "a remoção vazia deve devolver null");
    }

    private static void testarUmElemento() {
        BST<Integer, String> arvore = new BST<>();
        arvore.inserir(10, "dez");
        verificar("dez".equals(arvore.buscar(10)), "o único elemento deve ser encontrado");
    }

    private static void testarOrdemNormal() {
        BST<Integer, String> arvore = new BST<>();
        arvore.inserir(1, "um");
        arvore.inserir(2, "dois");
        arvore.inserir(3, "três");
        verificar("três".equals(arvore.buscar(3)), "a maior chave deve ser encontrada");
        arvore.listarEmOrdem();
    }

    private static void testarOrdemInversa() {
        BST<Integer, String> arvore = new BST<>();
        arvore.inserir(3, "três");
        arvore.inserir(2, "dois");
        arvore.inserir(1, "um");
        verificar("um".equals(arvore.buscar(1)), "a menor chave deve ser encontrada");
        arvore.listarEmOrdem();
    }

    private static void testarChaveRepetida() {
        BST<Integer, String> arvore = new BST<>();
        arvore.inserir(5, "primeiro");
        arvore.inserir(5, "segundo");
        verificar(arvore.buscar(5) != null, "uma chave repetida não deve desaparecer");
    }

    private static void testarChaveInexistente() {
        BST<Integer, String> arvore = new BST<>();
        arvore.inserir(5, "cinco");
        verificar(arvore.buscar(99) == null, "uma chave inexistente deve devolver null");
        verificar(arvore.remover(99) == null, "remover uma chave inexistente deve devolver null");
    }

    private static void testarRemocaoExistente() {
        BST<Integer, String> arvore = new BST<>();
        arvore.inserir(2, "dois");
        arvore.inserir(1, "um");
        arvore.inserir(3, "três");
        verificar("dois".equals(arvore.remover(2)), "a remoção deve devolver o valor removido");
        verificar(arvore.buscar(2) == null, "a chave removida não deve ser encontrada");
    }

    private static void executar(String nome, Runnable casoDeTeste) {
        try {
            casoDeTeste.run();
            System.out.println("[OK] " + nome);
        } catch (UnsupportedOperationException excecao) {
            System.out.println("[PENDENTE] " + nome + " - " + excecao.getMessage());
        } catch (AssertionError erro) {
            System.out.println("[FALHOU] " + nome + " - " + erro.getMessage());
        } catch (RuntimeException excecao) {
            System.out.println("[REVISAR] " + nome + " - " + excecao);
        }
    }

    private static void verificar(boolean condicao, String mensagem) {
        if (!condicao) {
            throw new AssertionError(mensagem);
        }
    }
}
