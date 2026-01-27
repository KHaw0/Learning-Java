import java.util.Scanner;
class Week6_Loop2_68011212097
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("input year: ");
        int year = in.nextInt();
        System.out.print("input month: ");
        int month = in.nextInt();
        System.out.print("input day: ");
        int day = in.nextInt();

        System.out.printf("%-10s%-10s%-10s\n", "YEAR:", "MONTH:", "DAY:");
        for(;;day--){
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException errr)
            {
            }


            System.out.printf("\r%-10d%-10d%-10d ", year, month, day);


            if(day == 1 && month > 0 && year >= 0){
                day = 31;
                month--;
                continue;
            }
            if(day == 1 && month == 0 && year > 0){
                month = 11;
                day = 31;
                year--;
                continue;
            }
            if(month == 0 && year == 0 && day == 0){
                System.out.println();
                System.out.println();
                System.out.println(".....BOOOOMMMMM.....");
                System.out.println("...HAPPY NEW YEAR...");
                break;
            }
        }
    }
}