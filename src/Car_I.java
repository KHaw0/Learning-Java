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
            System.out.printf("%s\t", lcnNum[i]);
            if(weight[i] * 10 % 1 == 0){
                System.out.printf("%.1f\t", weight[i]);
            }else{
                System.out.printf("%.2f\t", weight[i]);
            }
            System.out.printf("%s\t%d\t", type[i], fee[i]);
            if(cost[i] * 10 % 1 == 0){
                System.out.printf("%.1f\t", cost[i]);
            }else{
                System.out.printf("%.2f\t", cost[i]);
            }
            if(passPay[i] * 10 % 1 == 0){
                System.out.printf("%.1f\n", passPay[i]);
            }else{
                System.out.printf("%.2f\n", passPay[i]);
            }
        }
        System.out.println("***********************************************");
        if(maxCost * 10 % 1 == 0){
            System.out.printf("MAX\t\t\t\t%.1f\t", maxCost);
        }else{
            System.out.printf("MAX\t\t\t\t%.2f\t", maxCost);
        }
        if(maxPassPay * 10 % 1 == 0){
            System.out.printf("%.1f\n", maxPassPay);
        }else{
            System.out.printf("%.2f\n", maxPassPay);
        }
        if(sumPassPay * 10 % 1 == 0){
            System.out.printf("SUM\t\t\t\t\t%.1f\n", sumPassPay);
        }else{
            System.out.printf("SUM\t\t\t\t\t%.2f\n", sumPassPay);
        }
    }
}
