import java.util.Random;
class Method1 {
    Random rn = new Random();
    public static void main(String[] args) {
        Method1 obj = new Method1();
        int n = 10;
        int[] data = new int[n];
        obj.setData(data);
        char[] grade = new char[n];
        obj.setGrade(data, grade);
        obj.display(data, grade);
    }

    void setData(int[] data){
        for(int i = 0; i < data.length; i++){
            data[i] = rn.nextInt(0, 100);
        }
    }

    void setGrade(int[] data, char[] grade){
        for(int i = 0; i < grade.length; i++){
            if(data[i] >= 70){
                grade[i] = 'S';
            }else{
                grade[i] = 'U';
            }
        }
    }

    void outputData(int[] data){
        System.out.print("Score : ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + "\t");
        }System.out.println();
    }

    void outputGrade(char[] grade){
        System.out.print("Grade : ");
        for(int i = 0; i < grade.length; i++){
            System.out.print(grade[i] + "\t");
        }System.out.println();
    }

    void display(int[] data, char[] grade){
        outputData(data);
        outputGrade(grade);
    }
}