import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[100][100];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int t=x; t<x+10; t++){
                for(int j=y; j<y+10; j++){
                    board[t][j] = 1;
                }
            }
        }
        int cnt = 0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(board[i][j]==1) cnt++;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}