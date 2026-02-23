import java.util.Arrays;
import java.util.Scanner;
class xo {
    public static void main(String[] args) {
        xo obj = new xo();
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

    void setTableX(char[][] table, int[][] tableX){
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                if(table[i][j] == 'x' || table[i][j] == 'X'){
                    tableX[i][j] = 1;
                }
            }
        }
    }

    void setTableO(char[][] table, int[][] tableO){
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                if(table[i][j] == 'o' || table[i][j] == 'O'){
                    tableO[i][j] = 1;
                }
            }
        }
    }

    void setNumInTable(char[][] table, int[][] tableX, int[][] tableO){
        setTableX(table, tableX);
        setTableO(table, tableO);
    }

    int getCount(int[][] data) {
        int n = data.length;
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < n; i++) {
            int row = 0;
            int col = 0;
            diag1 += data[i][i];
            for (int j = 0; j < n; j++) {
                row += data[i][j];
                col += data[j][i];
                if(i + j == n - 1) diag2 += data[i][j];
            }
            if (row == n) return n;
            if (col == n) return n;
        }
        if (diag1 == n) return n;
        if (diag2 == n) return n;
        return 0;
    }


    void getWin(int[][] tableX, int[][] tableO){
        int x = getCount(tableX);
        if(x == tableX.length) System.out.println("X WIN!!");
        int o = getCount(tableO);
        if(o == tableO.length) System.out.println("O WIN!!");
    }

	void game(char[][] table){
		int n = table.length;
        boolean[][] used = new boolean[n][n];
        int[][] tableX = new int[n][n];
        int[][] tableO = new int[n][n];
		int i = 0;	
        for(; i < table.length * table.length; i++){
            char ch = input("input X/O: ").charAt(0);
            if(ch == 'E' || ch == 'e'){
                break;
            }
            int indexI = Integer.parseInt(input("Index i: "));
            int indexJ = Integer.parseInt(input("Index j: "));
            if(ch == 'X' || ch == 'O' || ch == 'x' || ch == 'o'){
                if(indexI >= 0 && indexI < table.length && indexJ >= 0 && indexJ < table.length){
                    if(!used[indexI][indexJ]){
                        used[indexI][indexJ] = true;
                        setXO(table, ch, indexI, indexJ);
                        printTable(table);
                        setNumInTable(table, tableX, tableO);
                        getWin(tableX, tableO);
                        if(getCount(tableX) == table.length || getCount(tableO) == table.length) break;
                    }else{
                        i--;
                        System.out.println("INDEX Already Used!");
                    }
                }else {
					i--;
                    System.out.println("INDEX ERROR");
                }
            }else {
				i--;
                System.out.println("pls input X/O");
            }
        }
		if(i == table.length * table.length) System.out.println("DRAW!");
	}
}
