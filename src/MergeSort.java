import java.util.Arrays;

public class MergeSort {
        // Função mesclar criada para combinar duas sublistas
        // vai receber a array a[] - Com os indices b, c, d
        // O indice b - indice de inicio
        // O indice c - indice de meio
        // O indice d - indice de final
        void mesclar(int a[], int b, int c, int d) {

            // criada a variavel n1 - Vai calcular a quantidade de elementos na primeira lista
            int n1 = c - b + 1;

            // criada a variavel n2 - vai calcular a quantidade de elementos da segunda lista
            int n2 = d - c;

            // craida a variavel L - que é uma array temporaria que vai de da posição b ate c
            int B[] = new int[n1];
            // craida a variavel R - que é uma array temporaria que vai da posição c ate d
            int D[] = new int[n2];

            // loop FOR criada para copiar os elementos da array principal a[] para a array temporaria B[] - copia os elementos da primeira sublista
            for (int i = 0; i < n1; ++i)
                B[i] = a[b + i];

            // loop FOR criada para copiar os elementos da array principal a[] para a array temporaria D[] - copis os elementos da segunda sublista
            for (int j = 0; j < n2; ++j)
                D[j] = a[c + 1 + j];

            // duas variaveis que irao receber 0 como inicio
            int i = 0;
            int j = 0;

            // a condicao WHILE compara elementos das arrays temporaria B[] e D[]
            int k = b;
            while (i < n1 && j < n2) {
                if (B[i] <= D[j]) {
                    a[k] = B[i];
                    i++;
                } else {
                    a[k] = D[j];
                    j++;
                }
                k++;
            }

            // as duas condicoes WHILE comparam elementos restantes da ARRAY B[] e D[]
            while (i < n1) {
                a[k] = B[i];
                i++;
                k++;
            }

            while (j < n2) {
                a[k] = D[j];
                j++;
                k++;
            }
        }


        // funcao organizar dividi o array em subarrays menores
        void organizar(int a[], int b, int d) {

            // a condicao IF e para seguir ate que b seja menor que d
            if (b < d) {

                // variavel m que vai receber as duas sublistas b e d e dividir por 2
                int m = (b + d) / 2;

                organizar(a, b, m);
                organizar(a, m + 1, d);

                // vai mesclar as arrays
                mesclar(a, b, m, d);
            }
        }


        //
        public static void main(String[] args) {
            // a array a recebe a sequencia de numeros para a organização
            int [] inicio = {30, 24, 2, 9, 4, 1};

            // Mostra os números que a array irao receber
            System.out.println("Inicio da array" + Arrays.toString(inicio));


            // classe MergeSort que e chamada com o nome dado da variavel x
            MergeSort Final = new MergeSort();
            Final.organizar(inicio, 0, inicio.length - 1);

            // resultado final
            System.out.println("Final da array" + Arrays.toString(inicio));
        }
}
