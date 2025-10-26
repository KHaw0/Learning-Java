import java.util.Scanner;

public class fn12 {
    public static void main(String[] args){
        fn12 obj = new fn12();
        int n = obj.Input("N : ");
        int[] data = new int[n];
        obj.getData(data);
        obj.Display(data);
    }

    public int Input(String UI){
        Scanner in = new Scanner(System.in);
        System.out.print(UI);
        return in.nextInt();
    }

    public void getData(int[] data){
        for (int i = 0; i < data.length; i++) {
            data[i] = Input("\t");
        }
    }

    public int getMax(int[] data){
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if(data[i] > max){
                max = data[i];
            }
        }
        return max;
    }

    public void Display(int[] data){
        disM(data);
        disHaft(data);
        disW(data);
    }

    public void disM(int[] data){
        for (int i = getMax(data); i >= 0; i--) {
            System.out.print("\t\t");
            for (int j = 0; j < data.length; j++) {
                if(i < data[j]){
                    System.out.print("M\t");
                }else if(i == data[j]){
                    System.out.print(data[j] + "\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public void disHaft(int[] data){
        System.out.print("\t\t");
        for (int i = 0; i < data.length; i++) {
            System.out.print("-\t");
        }
        System.out.println();
    }

    public void disW(int[] data){
        for (int i = 0; i <= getMax(data); i++) {
            System.out.print("\t\t");
            for (int j = 0; j < data.length; j++) {
                if(i < data[j]){
                    System.out.print("W\t");
                }else if(i == data[j]){
                    System.out.print(data[j] + "\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
