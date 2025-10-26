import java.util.Scanner;

public class numoe {
    public static void main(String[] args){
        numoe obj = new numoe();
        int n = obj.Input("N : ");
        int[] num = new int[n];
        obj.getNum(num);
        obj.Display(num);
    }

    public int Input(String UI){
        Scanner in = new Scanner(System.in);
        System.out.print(UI);
        return in.nextInt();
    }

    public void getNum(int[] num){
        for (int i = 0; i < num.length; i++) {
            num[i] = Input("Num[" + (i+1) + "] : ");
        }
    }

    public int getOdd(int[] num){
        int odd = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] % 2 != 0){
                odd++;
            }
        }
        return odd;
    }

    public int getEven(int[] num){
        int even = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] % 2 == 0){
                even++;
            }
        }
        return even;
    }

    public void Display(int[] num){
        System.out.println("EVEN = " + getEven(num));
        System.out.println("ODD = " + getOdd(num));
    }

}
