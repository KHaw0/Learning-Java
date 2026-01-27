import java.util.Scanner;
class Week4_Nested_if_68011212097
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        String month = "";
        String day = "";
        int numDay = 0;

        if(num >= 275 && num <= 305){
            month = "OCT";
            numDay += num - 274;
        }else if(num <= 335){
            month = "NOV";
            numDay += num - 305;
        }else if(num <= 366){
            month = "DEC";
            numDay += num - 335;
        }

        switch (num % 7){
            case 0:
                day = "TUE";
                break;
            case 1:
                day = "WED";
                break;
            case 2:
                day = "THR";
                break;
            case 3:
                day = "FRI";
                break;
            case 4:
                day = "SAT";
                break;
            case 5:
                day = "SUN";
                break;
            case 6:
                day = "MON";
                break;
            default:
                break;
        }
        System.out.println(day);
        System.out.println(month);
        System.out.println(numDay);
    }
}