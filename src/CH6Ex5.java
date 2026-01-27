import java.util.Scanner;
class CH6Ex5
{
    Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        CH6Ex5 obj = new CH6Ex5();

        int x = obj.input("X : ");
        int y = obj.input("Y : ");

        System.out.println("gDC(" + x + "," + y + ")=" + obj.gCD(x, y));
    }

    int input(String UI){
        System.out.print(UI);
        return in.nextInt();
    }

    int gCD(int x, int y){
        if(x < y) return gCD(y, x);
        else if(y == 0) return x;
        else return gCD(y, x % y);
    }
}