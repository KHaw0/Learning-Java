import java.util.Scanner;
class  fibon
{
    Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        fibon obj = new fibon();
        int n = obj.in.nextInt();
        System.out.println("FibonN(" + n + ")=" + obj.fib(n));
    }

    int fib(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return fib(n - 1) + fib(n - 2);
    }
}