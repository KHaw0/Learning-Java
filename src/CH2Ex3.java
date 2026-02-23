import java.util.Scanner;

public class CH2Ex3 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        CH2Ex3 obj = new CH2Ex3();
        String product = obj.InputStr("Product : ");
        int price = obj.InputInt("Price : ");
        int amount = obj.InputInt("Amount : ");
        int pay = obj.InputInt("Pay : ");
        obj.Display(product, price, amount, pay);
    }

    public String InputStr(String UI) {
        System.out.print(UI);
        return in.nextLine();
    }

    public int InputInt(String UI) {
        System.out.print(UI);
        return in.nextInt();
    }

    public int getCost(int price, int amount) {
        return price * amount;
    }

    public int getChange(int price, int amount, int pay) {
        return pay - getCost(price, amount);
    }

    public void Display(String product, int price, int amount, int pay) {
        System.out.println("Buy " + product + ", Price " + price + " bath" + ", Amount " + amount);
        System.out.println("Cost = " + getCost(price, amount) + " Bath");
        System.out.println("Pay = " + pay + " Bath");
        System.out.println("Change = " + getChange(price, amount, pay) + " Bath");
    }
}
