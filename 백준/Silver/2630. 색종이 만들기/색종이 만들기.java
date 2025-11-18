import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int white = 0;
    public static int blue = 0;
    public static int[][] board;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        partition(0,0,n);
        bw.write(String.valueOf(white));
        bw.newLine();
        bw.write(String.valueOf(blue));
        bw.flush();
    }
    public static void partition(int row, int col, int size){
        if(colorCheck(row, col, size)) {
            if(board[row][col]==0) white++;
            else blue++;
            return;
        }
        int newSize = size/2;
        partition(row, col, newSize); // 2사분면
        partition(row, col+newSize, newSize); // 1사분면
        partition(row+newSize, col, newSize); // 3사분면
        partition(row+newSize, col+newSize, newSize); //4사분면
        
    }
    // 전체 파티션의 컬러가 같은지 체크함
    public static boolean colorCheck(int row, int col, int size) {
        int color = board[row][col];
        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
                // 색상이 같지 않다면
                if(board[i][j]!=color) return false;
            }
        }
        return true;
    }
}