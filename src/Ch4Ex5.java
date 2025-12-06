import java.util.Random;

public class Ch4Ex5 {
    static void main(String[] args) {
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            char num = (char)rn.nextInt(65, 90);
            System.out.println(num);
        }
    }
}
