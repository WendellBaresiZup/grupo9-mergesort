import java.util.Arrays;

public class Mesclar {
    public static void mesclar(int[] a, int[] b, int[] c, int esquerda, int direita) {


        int i = 0;
        int j = 0;
        int k = 0;

        while (i < esquerda && j < direita) {

            if (b[i] <= c[j]) {
                a[k++] = b[i++];
            }
            else {
                a[k++] = c[j++];
            }
        }

        while (i < esquerda) {
            a[k++] = b[i++];
        }

        while (j < direita) {
            a[k++] = c[j++];
        }
    }

    public static void mesclagem(int[] a, int comprimento) {
        if (comprimento < 2) {
            return;
        }

        int meio = comprimento / 2;

        int [ ] n1 = new int [meio];
        int [ ] n2 = new int [comprimento - meio];


        for (int i = 0; i < meio; i++) {
            n1 [ i ] = a [ i ];
        }

        for (int i = meio; i < comprimento ; i++) {
            n2 [ i - meio] = a [ i ];
        }

        mesclagem (n1, meio);
        mesclagem (n2, comprimento - meio);


        mesclar(a, n1, n2, meio, comprimento - meio);
    }

    public static void main(String[] args) {

        int [ ] teste = {6,9,8,2,4,1};
        int size = teste.length;

        System.out.println("Inicio da Array" + Arrays.toString(teste));

        mesclagem(teste, size);

        System.out.println("Após o Merge Sort " + Arrays.toString(teste));
    }
}
