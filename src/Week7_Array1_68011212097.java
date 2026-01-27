import java.util.Scanner;
class Week7_Array1_68011212097
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("N: ");
        int n = in.nextInt();

        String[] name = new String[n];
        double[] weight = new double[n];
        int[] height = new int[n];

        for(int i = 0; i < name.length; i++){
            name[i] = in.next();
            weight[i] = in.nextDouble();
            height[i] = in.nextInt();
        }

        double[] BMI = new double[n];
        for(int i = 0; i < BMI.length; i++){
            BMI[i] = weight[i] / Math.pow((height[i] * 0.01), 2);
        }

        double maxW = weight[0];
        double maxH = height[0];
        double maxB = BMI[0];
        double minW = weight[0];
        double minH = height[0];
        double minB = BMI[0];
        for(int i = 0; i < n; i++){
            maxW = Math.max(maxW, weight[i]);
            maxH = Math.max(maxH, height[i]);
            maxB = Math.max(maxB, BMI[i]);
            minW = Math.min(minW, weight[i]);
            minH = Math.min(minH, height[i]);
            minB = Math.min(minB, BMI[i]);
        }

        double sum = 0;
        for(int i = 0; i< weight.length; i++){
            sum += weight[i];
        }
        double avgW = sum / weight.length;

        sum = 0;
        for(int i = 0; i < height.length; i++){
            sum += height[i];
        }
        double avgH = sum / height.length;

        sum = 0;
        for(int i = 0; i < BMI.length; i++){
            sum += BMI[i];
        }
        double avgB = sum / BMI.length;

        char[] size = new char[n];
        int s = 0, m = 0, l = 0, x = 0;
        String nS = " ", nM = " ", nL = " ", nX = " ";
        int cS = 0, cM = 0, cL = 0, cX = 0;
        for(int i = 0; i < size.length; i++){
            if(BMI[i] < 18.6){
                size[i] = 'S';
                if(cS == 0){
                    nS += "\b" + name[i] + ",";
                    cS++;
                }else{
                    nS += name[i] + ",";
                }
                s++;
            }else if(BMI[i] < 23.0){
                size[i] = 'M';
                if(cM == 0){
                    nM += "\b" + name[i] + ",";
                    cM++;
                }else{
                    nM += name[i] + ",";
                }
                m++;
            }else if(BMI[i] <= 27.5){
                size[i] = 'L';
                if(cL == 0){
                    nL += "\b" + name[i] + ",";
                    cL++;
                }else{
                    nL += name[i] + ",";
                }
                l++;
            }else{
                size[i] = 'X';
                if(cX == 0){
                    nX += "\b" + name[i] + ",";
                    cX++;
                }else{
                    nX += name[i] + ",";
                }
                x++;
            }
        }

        System.out.printf("%-15s%10s %-1s%10s %-1s\n", "Name", "Weight", "Height", "BMI", "SIZE");
        for(int i = 0; i < n; i++){
            System.out.printf("%-15s%10.2f %-1d%13.2f %-1c\n", name[i], weight[i], height[i], BMI[i], size[i]);
        }

        System.out.printf("%-15s%10.2f %-1.2f%10.2f\n", "MAX", maxW, maxH, maxB);
        System.out.printf("%-15s%10.2f %-1.2f%10.2f\n", "MIN", minW, minH, minB);
        System.out.printf("%-15s%10.2f %-1.2f%10.2f\n", "AVERAGE", avgW, avgH, avgB);

        System.out.printf("%s%-5d\"%s\b\"\n","S:" , s, nS);
        System.out.printf("%s%-5d\"%s\b\"\n","M:" , m, nM);
        System.out.printf("%s%-5d\"%s\b\"\n","L:" , l, nL);
        System.out.printf("%s%-5d\"%s\b\"\n","X:" , x, nX);

    }
}
