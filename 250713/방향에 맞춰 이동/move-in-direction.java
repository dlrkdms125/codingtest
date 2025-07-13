import java.util.*;
import java.io.*;

public class Main {
    // 동서남북 순서
    static int[] dx = new int[]{1,0,-1,0};
    static int[] dy = new int[]{0,-1,0,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int x = 0, y = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char dir = st.nextToken().charAt(0);
            int number = Integer.parseInt(st.nextToken());
            int d = 0;
            if(dir=='E') d = 0;
            else if(dir=='S') d = 1;
            else if(dir=='W') d = 2;
            else if(dir=='N') d = 3;
            x += dx[d]*number;
            y += dy[d]*number;
        }
        bw.write(x+" "+y);
        bw.flush();


    }
}