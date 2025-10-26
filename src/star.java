import java.util.Scanner;

public class star {

    public static void main(String[] args){
        star obj = new star();
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
            data[i] = Input("DATA [" + (i+1) + "] : ");
        }
    }

    public void DisplayData(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
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

    public void DisplayStar(int[] data){
        for (int i = getMax(data); i >= 1; i--) {
            for (int j = 0; j < data.length; j++){
                if(i <= data[j]){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public void Display(int[] data){
        DisplayStar(data);
        DisplayData(data);
    }

}
