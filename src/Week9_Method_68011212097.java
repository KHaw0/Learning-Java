import java.util.Scanner;
class Week9_Method_68011212097 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Week9_Method_68011212097 obj = new Week9_Method_68011212097();

        int x1 = obj.input("X1 : ");
        int y1 = obj.input("Y1 : ");
        int x2 = obj.input("X2 : ");
        int y2 = obj.input("Y2 : ");
        int x3 = obj.input("X3 : ");
        int y3 = obj.input("Y3 : ");

        double sideA = obj.getSide(x1, y1, x2, y2);
        double sideB = obj.getSide(x2, y2, x3, y3);
        double sideC = obj.getSide(x3, y3, x1, y1);

        obj.display(sideA, sideB, sideC);
    }

    int input(String UI){
        System.out.print(UI);
        return in.nextInt();
    }

    double getSide(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    double getS(double a, double b, double c){
        return (a + b + c) / 2;
    }

    double getArea(double a, double b, double c){
        double S = getS(a, b, c);
        return Math.sqrt(S * (S - a) * (S - b) * (S - c));
    }

    void display(double a, double b, double c){
        System.out.printf("Side A : %.6f\n", a);
        System.out.printf("Side B : %.6f\n", b);
        System.out.printf("Side C : %.6f\n", c);
        System.out.printf("S : %.6f\n", getS(a, b, c));
        System.out.printf("Area : %.6f\n", getArea(a, b, c));
    }
}