import java.util.Random;

public class Ch4Ex7 {
    static void main(String[] args) {
        Random rn = new Random();
        int count = 0, rd = 0;
        for (;count < 3; rd++) {
            int num = rn.nextInt(4, 7);
            System.out.println(num);
            if(num == 5){
                count++;
            }
        }
        System.out.println("Random " + rd + " times");
    }
}
