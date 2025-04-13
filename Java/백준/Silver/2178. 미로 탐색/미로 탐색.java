import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] check;
    static int[][] arr;
    static int[] moveX = {0,0,-1,1};
    static int[] moveY = {1,-1,0,0};
    static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        check = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char[] ch = str.toCharArray();

            for(int j=0; j<ch.length; j++){
                arr[i][j] = Character.getNumericValue(ch[j]);
            }
        }
        check[0][0] = true;
        bfs(0,0);

        bw.write(String.valueOf(arr[N-1][M-1]));
        bw.flush();
        bw.close();
        br.close();
    }
    public static void bfs(int x, int y){
        ArrayDeque<Spot> q = new ArrayDeque<>();
        q.add(new Spot(x,y));
        while(!q.isEmpty()){
            Spot s = q.poll();
            for(int i=0; i<4; i++){
                int nextX = s.x+moveX[i];
                int nextY = s.y+moveY[i];
                if(nextX<0 || nextY<0 || nextX>=N || nextY>=M){
                    continue;
                }
                if(check[nextX][nextY] || arr[nextX][nextY]==0){
                    continue;
                }
                q.add(new Spot(nextX, nextY));
                arr[nextX][nextY] = arr[s.x][s.y]+1;
                check[nextX][nextY] = true;
            }
        }
    }
    static class Spot {
        int x;
        int y;
        Spot(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
}