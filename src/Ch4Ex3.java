import java.util.Scanner;

public class Ch4Ex3 {
    Scanner in = new Scanner(System.in);

    static void main(String[] args) {
        Ch4Ex3 obj = new Ch4Ex3();

        int num;
        for (int i = 0; i < 10; i++) {
            num = Integer.parseInt(obj.input(""));
            obj.output(num);
        }
    }

    public String input(String UI){
        System.out.print(UI);
        return in.next();
    }

    public void output(int num){
        if(num % 2 == 0){
            System.out.println("EVEN");
        }else {
            System.out.println("ODD");
        }
    }
}
