import java.util.Arrays;
import java.util.Scanner;



    public class Transpos {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("row size ");
            int n = sc.nextInt();
            System.out.println("coloum size ");
            int m = sc.nextInt();
            int A[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.println("enter " + i + "," + j);
                    A[i][j] = sc.nextInt();
                }
            }

            int value[][] = matrixTran(A, n, m);
            for (int[] values : value) {
                System.out.println(Arrays.toString(values));
            }
        }

        public static int[][] matrixTran(int A[][], int n, int m) {
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i < j) {
                        temp = A[i][j];
                        A[i][j] = A[j][i];
                        A[j][i] = temp;
                    }
                }

            }
            return A;
        }
    }