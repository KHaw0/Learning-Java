import java.util.Random;
class Mid_H
{
    public static void main(String[] args)
    {
        Random rd = new Random();

        int[] data = new int[6];
        for(; data[4] != 5;){
            int ch = rd.nextInt(0, 6);
            switch((char)('A' + ch)){
                case 'A': data[0]++; break;
                case 'B': data[1]++; break;
                case 'C': data[2]++; break;
                case 'D': data[3]++; break;
                case 'E': data[4]++; break;
                case 'F': data[5]++; break;
            }
            System.out.print((char)('A' + ch));
        }System.out.println();

        int max = data[0];
        for(int i = 0; i < data.length; i++){
            max = Math.max(max, data[i]);
        }

        for(int i = 0; i < data.length; i++){
            for(int j = max; j >= 1; j--){
                if(j <= data[i]){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(((char)('A' + i)) + "" + data[i]);
        }
    }
}
