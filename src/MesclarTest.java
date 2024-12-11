// metodo para imprimir a
import java.lang.annotation.Target;
import java.util.Arrays;

public class MesclarTest {

    // Metodo responsavel para mesclar as duas arrays
    public static void mesclar(int[] a, int[] b, int[] c, int esquerda, int direita) {

        // Criação da das variaveis que irao receber 0 para inciar.
        int i = 0;
        int j = 0;
        int k = 0;


        // Condicao WHILE que enquanto tiver elementos nas arrays b[] e c[], vai compara com a array principal a[]
        // Teste do While
        while (i < esquerda && j < direita) {

            if (b[i] <= c[j]) {
                a[k++] = b[i++];
            }
            else {
                a[k++] = c[j++];
            }

            System.out.println("Testando o while que compara as arrays: " + Arrays.toString(a));
        }

        // condicao WHILE se caso houver elementos na array b[], copie para a array a[]
        while (i < esquerda) {
            a[k++] = b[i++];
        }

        System.out.println("Testando se tem elementos de b e se está copiando para a: " + Arrays.toString(b) + Arrays.toString(a) );

        // condicao WHILE se caso houve elementos na array c[], copie para a array a[]
        while (j < direita) {
            a[k++] = c[j++];
        }

        System.out.println("Testando se tem elementos de c e se está copiando para a: " + Arrays.toString(c) + Arrays.toString(a) );

    }

    // Metodo criado para chamar a logica MergeSorte
    public static int[] mesclagem(int[] a, int comprimento) {

        // Condicao IF para informar que caso o comprimento for menor que 2 ele não retornar nada
        if (comprimento < 2) {
            return a;
        }

        // Variavel para ver o meio da Array
        int meio = comprimento / 2;

        // Criar duas arrays temporarias para armazenar as duas metades
        int [ ] n1 = new int [meio];
        int [ ] n2 = new int [comprimento - meio];


        // loop FOR que vai preencher o array temporario n1 com os dados da array principal a[]
        for (int i = 0; i < meio; i++) {
            n1 [ i ] = a [ i ];
        }

        // loop FOR que vai preencher o array temporario n2 com os dados restantes da array principal a[]
        for (int i = meio; i < comprimento ; i++) {
            n2 [ i - meio] = a [ i ];
        }

        // Chama o metodo mesclagem que vai fazer a ordem das arrays temporarias n1 e n2
        mesclagem (n1, meio);
        mesclagem (n2, comprimento - meio);

        int test [] = mesclagem (n1, meio);
        int test2 [] = mesclagem (n2, comprimento - meio);

        System.out.println("Testando se o método está mesclando a ordem das arrays temp.: " + Arrays.toString(test));
        System.out.println("Testando se o método está mesclando a ordem das arrays temp.: " + Arrays.toString(test2));

        // faz a mesclagem das duas arrays para a array principal a[]
        mesclar(a, n1, n2, meio, comprimento - meio);
        return a;



    }

    // Metodo principal que executa o codigo
    public static void main(String[] args) {

        // Array que vai receber os dados iniciais
        int teste[] = {6,9,8,2,4,1};

        // variavel com o comprimento da array
        int size = teste.length;

        // Printa na tela a array com os dados iniciais
        System.out.println("Inicio da Array" + Arrays.toString(teste));

        // Chama o metodo para mesclar e ordenar a array
        mesclagem(teste, size);

        // Printa na tela a array com o resultado final em ordem
        System.out.println("Após o Merge Sort " + Arrays.toString(teste));
    }
}
