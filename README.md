# Merge Sort - Implementação em Java

## Descrição

O **Merge Sort** é um algoritmo de ordenação baseado na técnica de **divisão e conquista**. O algoritmo divide o array em duas metades, ordena essas metades recursivamente e, em seguida, as mescla para formar a versão ordenada do array. O Merge Sort tem uma complexidade de tempo de **O(n log n)**, o que o torna eficiente mesmo para conjuntos de dados grandes.

### Funcionamento do Merge Sort

1. **Divisão**: O array é dividido em duas metades recursivamente até que cada subarray tenha apenas um elemento.
2. **Ordenação e mesclagem**: As sublistas de um único elemento são ordenadas por meio de mesclagem. Durante o processo de mesclagem, os elementos das duas metades são comparados e combinados de forma ordenada.

Este código implementa o algoritmo de Merge Sort, que é eficiente, estável e muito utilizado em sistemas que necessitam de uma ordenação rápida.

## Estrutura do Código

- **`mesclar()`**: Função responsável por mesclar duas subarrays ordenadas em uma única array ordenada.
- **`mesclagem()`**: Função recursiva que divide o array em subarrays menores até que o tamanho seja 1. Em seguida, ela chama a função mesclar() para ordenar as subarrays.
- **`main()`**: Função principal que demonstra o funcionamento do algoritmo, exibindo o array original e o array ordenado após a aplicação do Merge Sort.

## Como Executar o Código

Para executar o código, siga os passos abaixo:

### 1. Clonar o Repositório

Clone o repositório para o seu ambiente local:

```bash
git clone git@github.com:WendellBaresiZup/grupo9-mergesort.git
```
### 2. Navegar até o Diretório do Projeto
Entre na pasta do repositório clonado:

```bash
cd grupo9-mergesort
```
### Etapas 3 e 4 se quiser executar pelo terminal, se preferir executar direto na IDE pule para a etapa 5.

### 3. Compilar o Código Java
Compile o arquivo Java:

```bash
javac Mesclar.java
```

### 4. Executar o Código
Execute o código:

```bash
java Mesclar
```

### 5. Execute o código no botão RUN na IDE.

### Exemplo de Entrada e Saída

#### Entrada:

```
int teste[] = {6, 9, 8, 2, 4, 1};
```

#### Saída Esperada:

```
Inicio da Array[6, 9, 8, 2, 4, 1]
Após o Merge Sort [1, 2, 4, 6, 8, 9]
```
### Explicação dos Métodos

```
mesclar(int[] a, int[] b, int[] c, int esquerda, int direita)
```
#### Este método é responsável por mesclar dois arrays ordenados (b[] e c[]) em um único array (a[]). Ele compara os elementos de ambos os arrays e os coloca na posição correta de a[].

```
mesclagem(int[] a, int comprimento)
```

### Esse método é a função recursiva que divide o array a[] em duas metades, chama a si mesmo recursivamente para ordenar essas metades e, em seguida, usa a função mesclar() para combinar as duas metades ordenadas.

```
main(String[] args)
```

### A função principal executa o algoritmo de Merge Sort, imprimindo o estado do array antes e depois da ordenação.


## Fontes de Estudo

- [GeeksforGeeks - Merge Sort em Java](https://www.geeksforgeeks.org/java-program-for-merge-sort/)
- [Baeldung - Merge Sort em Java](https://www.baeldung.com/java-merge-sort)
- [CodeGym - Merge Sort em Java](https://codegym.cc/groups/posts/merge-sort-in-java)

## Autores e Papéis

Este projeto foi realizado pelo **Grupo 9**:

- **Wendell Baresi Santos de Oliveira** - Responsável pela **implementação** do algoritmo.
- **Erica Moraes Abdao** - Responsável pelos **testes** do algoritmo.
- **Jorge Francisco Vieira Silvestre** - Responsável pela **documentação** do projeto.

A colaboração entre os membros do grupo garantiu que todas as etapas do projeto fossem concluídas com sucesso.
