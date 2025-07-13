import java.util.*;
import java.io.*;

public class Main {
    // 동남서북
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};
    static int n;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int x = 0, y = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char ch = st.nextToken().charAt(0);
            int number = Integer.parseInt(st.nextToken());
            int Dir = getDir(ch);
            int nx = x+dx[Dir]*number;
            int ny = y+dy[Dir]*number;
            x = nx; 
            y = ny;
        }
        
        bw.write(x+" "+y);
        bw.flush();
    }
    private static int getDir(char c){
        if(c=='N') return 3;
        else if(c=='E') return 0;
        else if(c=='S') return 1;
        else return 2;
    }
    
}