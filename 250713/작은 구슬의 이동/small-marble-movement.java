import java.util.*;
import java.io.*;

public class Main {
    // U,D,R,L, 순서
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken())-1;
        int c = Integer.parseInt(st.nextToken())-1;
        String d = st.nextToken();
        int dir = getdir(d);
        int x = r, y = c;

        while(t>0){
            int nx = x+dx[dir];
            int ny = y+dy[dir];
            if(inRange(nx, ny)){
                x = nx;
                y = ny;
                t--;
            } else {
                dir = reverseDir(dir);
                t--;
            }
        }

        bw.write(String.valueOf((x+1)+" "+(y+1)));
        bw.flush();
    }
    private static int getdir(String d){
        if(d.equals("U")) {
            return 0;
        } else if(d.equals("D")){
            return 1;
        } else if(d.equals("R")){
            return 2;
        } else {
            return 3;
        }
    }
    private static int reverseDir(int dir){
        if(dir==0) return 1;
        if(dir==1) return 0;
        if(dir==2) return 3;
        return 2;
    }
    private static boolean inRange(int x, int y){
        if(x>=0 && x<n && y>=0 && y<n) return true;
        else return false;
    }
}