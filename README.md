# Algoritmos e Estruturas de Dados em Java

## Objetivo

Este projeto acadêmico reúne aplicações simples de Fila, BST, AVL, Bubble Sort, Insertion Sort e Merge Sort. Todo o código usa Java puro, vetores e execução no console, sem Maven, Gradle, JUnit ou bibliotecas externas.

As classes de domínio e as aplicações estão preparadas. As estruturas e os algoritmos principais permanecem marcados com `TODO` para serem implementados por Cássio.

## Divisão das pastas

```text
java(Cássio)/
├── fila/
├── bst/
├── avl/
├── bubblesort/
├── insertionsort/
└── mergesort/
```

Cada pasta é também um pacote Java com o mesmo nome.

## Aplicações

| Exercício | Pacote | Classe com `main` |
|---|---|---|
| 1 - Clínica médica | `fila` | `Clinica` |
| 2 - Fila de impressão | `fila` | `FilaImpressao` |
| 7 - Cadastro e busca de alunos | `bst` | `CadastroAlunos` |
| 8 - Autocomplete de produtos | `bst` | `AutocompleteProdutos` |
| 9 - Índice de CPF | `avl` | `IndiceCpf` |
| 10 - Ranking de jogadores | `avl` | `RankingJogadores` |
| 15 - Notas da turma | `bubblesort` | `NotasTurma` |
| 16 - Produtos por preço | `bubblesort` | `ProdutosPreco` |
| 19 - Jogo de cartas | `insertionsort` | `JogoCartas` |
| 20 - Ranking de vendedores | `insertionsort` | `RankingVendedores` |
| 21 - Transações bancárias | `mergesort` | `TransacoesBancarias` |
| 22 - Mesclagem de contatos | `mergesort` | `MesclagemContatos` |

## Como executar um `main` no IntelliJ

1. Abra a pasta do projeto no IntelliJ.
2. Confirme que `java(Cássio)` aparece como pasta de código-fonte. Se necessário, clique nela com o botão direito e escolha **Mark Directory as > Sources Root**.
3. Abra a classe da aplicação desejada.
4. Clique no triângulo verde ao lado de `main`.
5. Escolha **Run 'NomeDaClasse.main()'** e use o console.

Enquanto o algoritmo usado pela aplicação estiver pendente, o console mostrará `TODO: implementar por Cássio`.

## Testes de console

Execute pelo IntelliJ os `main` destas classes:

- `fila.TesteFila`;
- `bst.TesteBST`;
- `avl.TesteAVL`;
- `bubblesort.TesteBubbleSort`;
- `insertionsort.TesteInsertionSort`;
- `mergesort.TesteMergeSort`.

Os casos mostram `[PENDENTE]` enquanto os contratos lançam `UnsupportedOperationException`. Depois da implementação, eles podem mostrar `[OK]`, `[FALHOU]` ou `[REVISAR]`.

## Implementações ainda marcadas com `TODO`

- `Fila<T>`: `enqueue`, `dequeue`, `front`, `isEmpty` e `size`;
- `BubbleSort`: método `ordenar`;
- `InsertionSort`: método `ordenar`;
- `BST`: `inserir`, `buscar`, `remover` e `listarEmOrdem`;
- `MergeSort`: método `ordenar`;
- `AVL`: `inserir`, `buscar`, `remover`, `altura` e `fatorBalanceamento`;
- autocomplete: filtrar a travessia da BST pelo prefixo digitado;
- ranking de jogadores: percorrer a AVL por pontuação decrescente;
- teste da fila: definir o comportamento de `dequeue` quando a fila estiver vazia.
