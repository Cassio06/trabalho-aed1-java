package avl;

public class TesteAVL {

    public static void main(String[] args) {
        executar("árvore vazia", TesteAVL::testarArvoreVazia);
        executar("um elemento", TesteAVL::testarUmElemento);
        executar("ordem normal", TesteAVL::testarOrdemNormal);
        executar("ordem inversa", TesteAVL::testarOrdemInversa);
        executar("chave repetida", TesteAVL::testarChaveRepetida);
        executar("busca e remoção inexistentes", TesteAVL::testarChaveInexistente);
        executar("remoção e balanceamento", TesteAVL::testarRemocao);
    }

    private static void testarArvoreVazia() {
        AVL<Integer, String> arvore = new AVL<>();
        verificar(arvore.buscar(10) == null, "a busca vazia deve devolver null");
        verificar(arvore.remover(10) == null, "a remoção vazia deve devolver null");
        arvore.altura();
        arvore.fatorBalanceamento();
    }

    private static void testarUmElemento() {
        AVL<Integer, String> arvore = new AVL<>();
        arvore.inserir(10, "dez");
        verificar("dez".equals(arvore.buscar(10)), "o único elemento deve ser encontrado");
        verificar(Math.abs(arvore.fatorBalanceamento()) <= 1, "um nó isolado deve estar balanceado");
    }

    private static void testarOrdemNormal() {
        AVL<Integer, String> arvore = new AVL<>();
        arvore.inserir(1, "um");
        arvore.inserir(2, "dois");
        arvore.inserir(3, "três");
        verificar("três".equals(arvore.buscar(3)), "a maior chave deve ser encontrada");
        verificar(Math.abs(arvore.fatorBalanceamento()) <= 1, "a raiz deve permanecer balanceada");
    }

    private static void testarOrdemInversa() {
        AVL<Integer, String> arvore = new AVL<>();
        arvore.inserir(3, "três");
        arvore.inserir(2, "dois");
        arvore.inserir(1, "um");
        verificar("um".equals(arvore.buscar(1)), "a menor chave deve ser encontrada");
        verificar(Math.abs(arvore.fatorBalanceamento()) <= 1, "a raiz deve permanecer balanceada");
    }

    private static void testarChaveRepetida() {
        AVL<Integer, String> arvore = new AVL<>();
        arvore.inserir(5, "primeiro");
        arvore.inserir(5, "segundo");
        verificar(arvore.buscar(5) != null, "uma chave repetida não deve desaparecer");
    }

    private static void testarChaveInexistente() {
        AVL<Integer, String> arvore = new AVL<>();
        arvore.inserir(5, "cinco");
        verificar(arvore.buscar(99) == null, "uma chave inexistente deve devolver null");
        verificar(arvore.remover(99) == null, "remover uma chave inexistente deve devolver null");
    }

    private static void testarRemocao() {
        AVL<Integer, String> arvore = new AVL<>();
        arvore.inserir(2, "dois");
        arvore.inserir(1, "um");
        arvore.inserir(3, "três");
        verificar("dois".equals(arvore.remover(2)), "a remoção deve devolver o valor removido");
        verificar(arvore.buscar(2) == null, "a chave removida não deve ser encontrada");
        verificar(Math.abs(arvore.fatorBalanceamento()) <= 1, "a raiz deve permanecer balanceada");
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
