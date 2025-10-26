import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        int width;
        int hight;
        int area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Width : ");
        width = in.nextInt();
        System.out.print("Enter Hight : ");
        hight = in.nextInt();
        area = hight * width;
        System.out.println("area = " + area);
    }
}
