import java.util.Scanner;
class CH6Ex2
{
    Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        CH6Ex2 obj = new CH6Ex2();
        int x = obj.input("X : ");
        int n = obj.input("N : ");
        System.out.println(x + "^" + n + " = " + obj.power(x, n));
    }

    int input(String UI){
        System.out.print(UI);
        return in.nextInt();
    }

    long power(int x, int n){
        if(n == 0) return 0;
        else if(n == 1) return x;
        else return x * power(x, n - 1);
    }
}