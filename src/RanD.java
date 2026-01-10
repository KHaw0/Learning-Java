import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
class RanD
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rd = new Random();

        int n = in.nextInt();
        int rand;
        char[] data = new char[n];
        boolean[] use = new boolean[26];

        for(int i = 0; i < data.length; i++){
            rand = rd.nextInt(26);
            if(!use[rand]){
                use[rand] = true;
                data[i] = (char)('A' + rand);
            }else{
                i--;
            }
        }

        System.out.print("RAND:  ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }System.out.println();

        Arrays.sort(data);

        System.out.print("SORT:  ");
        for(int i = data.length - 1; i >= 0; i--){
            System.out.print(data[i] + " ");
        }System.out.println();
    }
}
