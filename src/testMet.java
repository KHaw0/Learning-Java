import java.util.Scanner;
class testMet
{
    Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        testMet obj = new testMet();
        int n = obj.in.nextInt();
        int m = obj.in.nextInt();
        System.out.println(obj.sum(n, m));
    }

    int sum(int n, int m){
        if(n >= m) return n;
        else return n + sum(n + 1, m);
    }
}