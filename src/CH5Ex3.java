import java.util.Scanner;
import java.util.Random;
class  CH5Ex3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();

        System.out.print("M: ");
        int m = in.nextInt();
        System.out.print("N: ");
        int n = in.nextInt();
        System.out.print("P: ");
        int p = in.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[n][p];
        int[][] c = new int[m][p];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = rn.nextInt(-2, 2);
            }
        }System.out.println();

        System.out.println("A[" + m + "x" + n + "]");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }System.out.println();

        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                b[i][j] = rn.nextInt(-2, 2);
            }
        }

        System.out.println("B[" + n + "x" + p + "]");
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }System.out.println();

        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                int sum = 0;
                for(int k = 0; k < n; k++){
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }

        System.out.println("C[" + m + "x" + p + "]");
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }System.out.println();
    }
}
