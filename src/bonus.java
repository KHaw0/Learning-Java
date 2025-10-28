import java.util.Scanner;
public class bonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER BONUS : ");
        double bonus = in.nextDouble();
        double formom = getFormom(bonus);
        double forson = getForson(bonus, formom);
        Display(formom, forson);
    }
    public static double getFormom(double bonus){
        double formom = bonus * (double)30/100;
        return formom;
    }
    public static double getForson(double bonus, double formom){
        double rembonus = bonus - formom;
        double forson = rembonus / 3;
        return forson;
    }
    public static void Display(double formom, double forson){
        System.out.println("FORMOM = " + formom);
        System.out.println("FORSON = " + forson);
    }
}
