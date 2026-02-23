import java.util.Scanner;

public class B02 {
    public static void main(String[] args) {
        B02 obj = new B02();
        double f = obj.Input("Enter Fahrenheit (F) >> ");
        obj.Display(f);
    }

    public double Input(String UI) {
        Scanner in = new Scanner(System.in);
        System.out.print(UI);
        return in.nextDouble();
    }

    public double getC(double f) {
        return (double) 5 / 9 * (f - 32);
    }

    public void Display(double f) {
        System.out.println("===============================");
        System.out.printf("%.2f Fahrenheit = %.2f Celsius", f, getC(f));
    }
}
