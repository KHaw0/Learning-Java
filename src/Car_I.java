import java.util.Scanner;
class Car_I
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\t    N: ");
        int n = in.nextInt();

        String[] lcnNum = new String[n];
        double[] weight = new double[n];

        System.out.print("LcnNum/Weight: ");
        for(int i = 0;i < weight.length; i++){
            if(i >= 1){
                System.out.print("\t\t\b");
            }
            lcnNum[i] = in.next();
            weight[i] = in.nextDouble();
        }

        String[] type = new String[n];
        int[] fee = new int[n];
        double[] cost = new double[n];
        double[] passPay = new double[n];
        double sumPassPay = 0;
        for(int i = 0; i < n; i++){
            if(weight[i] >= 0.75 && weight[i] < 1.75){
                type[i] = "CAR";
                fee[i] = 35;
            }else if(weight[i] >= 1.75 && weight[i] <= 3.25){
                type[i] = "VAN";
                fee[i] = 72;
            }else if(weight[i] > 3.25 && weight[i] <= 5){
                type[i] = "TRUCK";
                fee[i] = 137;
            }else{
                type[i] = "\"ERROR\"";
                fee[i] = 0;
            }
            cost[i] = fee[i] * weight[i];
            passPay[i] = fee[i] + cost[i];
            sumPassPay += passPay[i];
        }
        double maxCost = cost[0];
        double maxPassPay = passPay[0];
        for(int i = 0; i < n; i++){
            maxCost = Math.max(maxCost, cost[i]);
            maxPassPay = Math.max(maxPassPay, passPay[i]);
        }

        System.out.printf("LcnNum\tWEIGHT\tTYPE\tFEE\tCOST\tPASSpay\n");
        for(int i = 0; i < n; i++){
            if(weight[i] * 10 % 1 == 0){
                System.out.printf("%s\t%.1f\t%s\t%d\t%.1f\t%.1f\n", lcnNum[i], weight[i], type[i], fee[i], cost[i], passPay[i]);
            }else{
                System.out.printf("%s\t%.2f\t%s\t%d\t%.1f\t%.1f\n", lcnNum[i], weight[i], type[i], fee[i], cost[i], passPay[i]);
            }
        }
        System.out.println("***********************************************");
        System.out.printf("MAX\t\t\t\t%.1f\t%.1f\n", maxCost, maxPassPay);
        System.out.printf("SUM\t\t\t\t\t%.1f\n", sumPassPay);
    }
}
