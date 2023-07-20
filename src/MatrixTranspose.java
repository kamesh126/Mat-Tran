import java.util.Arrays;
import java.util.Scanner;
public class MatrixTranspose {



        public static int[][] matrix(int[][] A,int n,int m) {
            int temp=0;
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    if(i<j) {
                        temp=A[i][j];
                        A[i][j]=A[j][i];
                        A[j][i]=temp;
                    }
                }
            }

            return A;
        }

        public static void main(String[]args) {
            Scanner B=new Scanner(System.in);
            System.out.println("enter the values:");
            int n=B.nextInt();
            int m=B.nextInt();
            int [][]A=new int[n][m];
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    A[i][j]=B.nextInt();

                }
                int[][] value=matrix(A,n,m);
                for(int[]values:value) {
                    System.out.println(Arrays.toString(values));
                }
            }
        }
    }
