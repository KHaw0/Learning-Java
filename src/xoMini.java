import java.util.Arrays;
import java.util.Scanner;
class xoMini {
    public static void main(String[] args) {
        xo obj = new xo();
        int n = Integer.parseInt(obj.input("TableSize(NxN): "));
        char[][] table = new char[n][n];
        boolean[][] used = new boolean[n][n];
        obj.setTable(table);
        obj.printTable(table);
        for(int i = 0; i < table.length * table.length; i++){
            char ch = obj.input("input X/O: ").charAt(0);
            if(ch == 'E'){
                break;
            }
            int indexI = Integer.parseInt(obj.input("Index i: "));
            int indexJ = Integer.parseInt(obj.input("Index j: "));
            if(ch == 'X' || ch == 'O' || ch == 'x' || ch == 'o'){
                if(indexI >= 0 && indexI < table.length && indexJ >= 0 && indexJ < table.length){
                    if(!used[indexI][indexJ]){
                        used[indexI][indexJ] = true;
                        obj.printTable(table);
                    }else{
                        i--;
                        System.out.println("INDEX Already");
                    }
                }else {
                    System.out.println("INDEX ERROR");
                }
            }else {
                System.out.println("pls input X/O");
            }

        }
    }

    String input(String UI){
        Scanner in = new Scanner(System.in);
        System.out.print(UI);
        return in.next();
    }

    void setTable(char[][] table){
        for(int i = 0; i < table.length; i++){
            Arrays.fill(table[i], '_');
        }
    }

    void printTable(char[][] table){
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}