import java.util.Arrays;
import java.util.Scanner;
class xoMini {
    public static void main(String[] args) {
        xoMini obj = new xoMini();
        int n = Integer.parseInt(obj.input("TableSize(NxN): "));
        char[][] table = new char[n][n];
        obj.setTable(table);
        obj.printTable(table);
        obj.game(table);
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

	void setXO(char[][] table, char ch, int i, int j){
        table[i][j] = ch;
    }

	void game(char[][] table){
		boolean[][] used = new boolean[table.length][table.length];
		for(int i = 0; ; i++){
            char ch = input("input X/O: ").charAt(0);
            if(ch == 'E'){
                break;
            }
            int indexI = Integer.parseInt(input("Index i: "));
            int indexJ = Integer.parseInt(input("Index j: "));
            if(ch == 'X' || ch == 'O'){
                if(indexI >= 0 && indexI < table.length && indexJ >= 0 && indexJ < table.length){
                    if(!used[indexI][indexJ]){
                        used[indexI][indexJ] = true;
						setXO(table, ch, indexI, indexJ);
                        printTable(table);
                    }else{
                        i--;
                        System.out.println("INDEX Already Used!");
                    }
                }else {
                    System.out.println("INDEX ERROR!");
                }
            }else {
                System.out.println("pls input X/O");
            }
			if(i == table.length * table.length - 1) break;
        }
	}
}
