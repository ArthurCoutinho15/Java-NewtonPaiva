import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um número inteiro n: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();

                if (mat[i][j] < 0) {
                    count++;
                }
            }

        }
        System.out.println("Diagonal: ");
        for (int i = 0; i < mat.length; i++) {

            System.out.println(mat[i][i]);
        }
        System.out.println(count);

    }


}
