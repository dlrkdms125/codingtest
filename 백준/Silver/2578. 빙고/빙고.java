import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    static int[][] board;
    static boolean[][] vi;
    static int bingocnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        board = new int[6][6];
        StringTokenizer st;
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        vi = new boolean[6][6];
        int cnt = 0;
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                int number = Integer.parseInt(st.nextToken());
                cnt++;
                check(number);
                bingocnt = 0;
                rCheck();
                lrCheck();
                rlCheck();
                cCheck();
                // 빙고인지 확인하는 메소드 호출

                if(bingocnt>=3) {
                    bw.write(String.valueOf(cnt));
                    bw.flush();
                    return;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
    // 빙고 체크하는 메소드
    public static void check(int number){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(board[i][j]==number) vi[i][j] = true;
            }
        }
    }
    
    // 가로 체크
    public static void rCheck(){
        for(int i=0; i<5; i++){
            int cnt = 0;
            for(int j=0; j<5; j++){
                if(vi[i][j]) cnt++;
            }
            if(cnt==5) bingocnt++;
        }
    }
    // 세로 체크
    public static void cCheck(){
        for(int i=0; i<5; i++){
            int cnt = 0;
            for(int j=0; j<5; j++){
                if(vi[j][i]) cnt++;
            }
            if(cnt==5) bingocnt++;
        }
    }
    // 왼쪽에서 오른쪽으로 그어지는 대각선 체크
    public static void lrCheck() {
        int cnt = 0;
        for(int i=0; i<5; i++){
            if(vi[i][i]) cnt++;
        }
        if(cnt==5) bingocnt++;
    }
    // 오른쪽에서 왼쪽으로 그어지는 대각선 체크
    public static void rlCheck() {
        int cnt = 0;
        for(int i=0; i<5; i++){
            if(vi[i][4-i]) cnt++;
        }
        if(cnt==5) bingocnt++;
    }
}