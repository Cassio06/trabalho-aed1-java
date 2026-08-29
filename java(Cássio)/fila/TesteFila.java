package fila;

public class TesteFila {

    public static void main(String[] args) {
        executar("fila vazia", TesteFila::testarFilaVazia);
        executar("um elemento", TesteFila::testarUmElemento);
        executar("vários elementos", TesteFila::testarVariosElementos);
        executar("elementos repetidos", TesteFila::testarElementosRepetidos);
        executar("remoção em fila vazia", TesteFila::testarRemocaoEmFilaVazia);
    }

    private static void testarFilaVazia() {
        Fila<Integer> fila = new Fila<>();
        verificar(fila.isEmpty(), "uma fila nova deve estar vazia");
        verificar(fila.size() == 0, "uma fila nova deve ter tamanho zero");
    }

    private static void testarUmElemento() {
        Fila<String> fila = new Fila<>();
        fila.enqueue("A");
        verificar("A".equals(fila.front()), "front deve consultar o primeiro elemento");
        verificar("A".equals(fila.dequeue()), "dequeue deve remover o primeiro elemento");
        verificar(fila.isEmpty(), "a fila deve ficar vazia após a remoção");
    }

    private static void testarVariosElementos() {
        Fila<Integer> fila = new Fila<>();
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        verificar(fila.size() == 3, "o tamanho deve ser três");
        verificar(fila.dequeue() == 10, "a fila deve respeitar a ordem de chegada");
        verificar(fila.dequeue() == 20, "o segundo elemento deve ser removido depois");
        verificar(fila.dequeue() == 30, "o último elemento deve sair por último");
    }

    private static void testarElementosRepetidos() {
        Fila<Integer> fila = new Fila<>();
        fila.enqueue(7);
        fila.enqueue(7);

        verificar(fila.dequeue() == 7, "o primeiro valor repetido deve ser removido");
        verificar(fila.dequeue() == 7, "o segundo valor repetido deve ser removido");
    }

    private static void testarRemocaoEmFilaVazia() {
        Fila<Integer> fila = new Fila<>();
        // TODO: definir e verificar o comportamento de dequeue em uma fila vazia.
        fila.dequeue();
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
