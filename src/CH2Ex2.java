import java.util.Scanner;

public class CH2Ex2 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        CH2Ex2 obj = new CH2Ex2();
        int num1 = obj.Input("Input Num1 : ");
        int num2 = obj.Input("Input Num2 : ");
        obj.Dispaly(num1, num2);
    }

    public int Input(String UI){
        System.out.print(UI);
        return in.nextInt();
    }

    public void Dispaly(int num1, int num2){
        System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
        System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
        System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
    }
}
