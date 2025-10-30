import java.util.Scanner;

public class CH5Ex8 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        CH5Ex8 obj = new CH5Ex8();
        int n = obj.inputInt("N : ");
        double[][] data = new double[n][n];
        double[][] sum = new double[n][n];
        double[][] avg = new double[n][n];
        obj.getData(data);
        obj.getSum(sum, data);
        obj.getAvg(data, avg, n, sum);
        obj.Dispaly(avg);
    }

    public int inputInt(String UI){
        System.out.print(UI);
        return in.nextInt();
    }

    public double inputDouble(String UI){
        System.out.print(UI);
        return in.nextDouble();
    }

    public void getData(double[][] data){
        System.out.println("DATA : ");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = inputDouble("");
            }
        }
    }

    public void getSum(double[][] sum, double[][] data){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sum[i][i] += data[i][j];
            }
        }
    }

    public void getAvg(double[][] data, double[][] avg, int n, double[][] sum){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                avg[i][i] = sum[i][i] / n;
            }
        }
    }

    public void Dispaly(double[][] avg){
        System.out.println("AVERAGEDATA : ");
        for (int i = 0; i < avg.length; i++) {
            for (int j = 0; j < avg[i].length; j++) {
                if(avg[i][j] * 10 % 10 == 0){
                    System.out.printf("%.0f\t\t", avg[i][j]);
                }else{
                    System.out.print(avg[i][j] + "\t\t");
                }
            }
            System.out.println();
        }
    }
}
