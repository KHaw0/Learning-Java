import java.util.Scanner;

public class language {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        language obj = new language();
        String language1 = obj.Input("input Language1 >> ");
        String language2 = obj.Input("input Language2 >> ");
        String language3 = obj.Input("input Language3 >> ");
        obj.Display(language1, language2, language3);
    }

    public String Input(String UI){
        System.out.print(UI);
        return in.nextLine();
    }

    public void Display(String one, String two, String three){
        System.out.println("==============================");
        System.out.print("I can speak " + one + " ");
        System.out.print("and " + two + " ");
        System.out.println("except " + three);
    }
}
