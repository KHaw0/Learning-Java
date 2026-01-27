import java.util.Scanner;
import java.util.Random;
class Week8_Array2D_68011212097
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();

        int m = in.nextInt();
        int k = in.nextInt();

        int[][] data = new int[m][k];

        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                data[i][j] = rn.nextInt(1, 10);
            }
        }

        double[] avgRow = new double[m];
        int[] sumRow = new int[m];
        int sum = 0;
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                sum += data[i][j];
            }
            sumRow[i] = sum;
            avgRow[i] = sumRow[i] / (float)data.length;
            sum = 0;
        }

        int[][] dataFlip = new int[k][m];
        for(int i = 0; i < dataFlip.length; i++){
            for(int j = 0; j < dataFlip[i].length; j++){
                dataFlip[i][j] = data[j][i];
            }
        }
        double[] avgCol = new double[k];
        int[] sumCol = new int[k];
        sum = 0;
        for(int i = 0; i < dataFlip.length; i++){
            for(int j = 0; j < dataFlip[i].length; j++){
                sum += dataFlip[i][j];
            }
            sumCol[i] = sum;
            avgCol[i] = sumCol[i] / (float)dataFlip.length;
            sum = 0;
        }

        System.out.println();
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j] + "\t");
            }
            System.out.printf(">\t%d %.2f\n", sumRow[i], avgRow[i]);
        }System.out.println();

        for(int i = 0; i < sumCol.length; i++){
            System.out.print("v\t");
        }System.out.println();

        for(int i = 0; i < sumCol.length; i++){
            System.out.print(sumCol[i] + "\t");
        }System.out.println();

        for(int i = 0; i < avgCol.length; i++){
            System.out.printf("%.2f\t", avgCol[i]);
        }System.out.println();
    }
}