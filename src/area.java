import java.util.Scanner;

public class area {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        area obj = new area();
        double width = obj.Input("WIDTH : ");
        double height = obj.Input("HEIGHT : ");
        System.out.println("AREA = " + obj.getArea(width, height));
    }

    public double Input(String UI) {
        System.out.print(UI);
        return in.nextDouble();
    }

    public double getArea(double w, double h) {
        return w * h;
    }
}
