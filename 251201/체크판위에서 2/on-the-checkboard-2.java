import java.util.*;
import java.io.*;

public class Main {
    static int r,c;
    static char[][] board;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        board = new char[r][c];
        for(int i=0; i<r; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<c; j++){
                board[i][j] = st.nextToken().charAt(0);
            }
        }
        int cnt = 0;
        for(int i=1; i<r-1; i++){
            for(int j=1; j<c-1; j++){
                for(int k=i+1; k<r; k++){
                    for(int t=j+1; t<c; t++){
                        if(board[0][0]!=board[i][j] && board[i][j]!=board[k][t]) cnt++;
                    }
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
