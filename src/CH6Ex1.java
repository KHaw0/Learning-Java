import java.util.Scanner;
class CH6Ex1
{
    Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        CH6Ex1 obj = new CH6Ex1();
        int p = 50000;
        double r = 2.37;
        int y = obj.input("Y : ");
        System.out.println("pLone : " + obj.pLone(p, y, r));
    }

    int input(String UI){
        System.out.print(UI);
        return in.nextInt();
    }

    double pLone(int p, int y, double r){
        if(y <= 0) return p;
        else return (1 + r / 100) * pLone(p, y - 1, r);
    }
}