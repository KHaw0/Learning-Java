import java.util.Scanner;
import java.util.concurrent.Callable;

public class B03 {
    public static void main(String[] args) {
        B03 obj = new B03();
        int ass = obj.Input("Assignment score >> ");
        int mid = obj.Input("Midterm score >> ");
        int fn = obj.Input("Final score >> ");
        obj.Display(ass, mid, fn);
    }

    public int Input(String UI) {
        Scanner in = new Scanner(System.in);
        System.out.print(UI);
        return in.nextInt();
    }

    public double getAverage(int ass, int mid, int fn) {
        return ((double) ass + mid + fn) / 3;
    }

    public String getStr(int ass, int mid, int fn) {
        double avg = getAverage(ass, mid, fn);
        if (avg >= 80) {
            return "Pass";
        } else if (avg >= 65) {
            return "Good";
        } else if (avg >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public void Display(int ass, int mid, int fn) {
        System.out.println("==============================");
        System.out.printf("Average score: %.2f ", getAverage(ass, mid, fn));
        System.out.println("(" + getStr(ass, mid, fn) + ")");
    }
}
