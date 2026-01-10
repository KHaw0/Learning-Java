import java.util.Scanner;
class PrimeNo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("NUM: ");
        int num = in.nextInt();


        System.out.println("Factor\tPrimeOfFactor");
        int prime;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + "\t");
                int count = 0;
                for(int j = 1; j <= i; j++){
                    if(i % j == 0){
                        count++;
                    }
                }
                if(count == 2){
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
