import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    static int zerocount = 0;
    static int minuscount = 0;
    static int onecount = 0;
    static int[][] board;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new int[n+1][n+1];
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        partition(0,0,n);
        bw.write(String.valueOf(minuscount));
        bw.newLine();
        bw.write(String.valueOf(zerocount));
        bw.newLine();
        bw.write(String.valueOf(onecount));
        bw.flush();
    }
    public static boolean numbercheck(int row, int col, int size) {
        int number = board[row][col];
        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
                if(board[i][j]!=number) return false;
            }
        }
        return true;
    }
    public static void partition(int row, int col, int size) throws IOException {
        if(numbercheck(row, col, size)) {
            if(board[row][col]==-1) minuscount++;
            else if(board[row][col]==0) zerocount++;
            else onecount++;
            return;
        }
        int newSize = size/3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                partition(row+i*newSize, col+j*newSize, newSize);
            }
        }
    }
}