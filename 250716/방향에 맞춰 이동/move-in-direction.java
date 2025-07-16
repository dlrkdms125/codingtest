import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {-1, 0,0,1};
    static int[] dy = {0,-1,1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char dir = st.nextToken().charAt(0);
            int number = Integer.parseInt(st.nextToken());
            if(dir=='W'){
                x += number*dx[0];
                y += number*dy[0];
            } else if(dir=='S'){
                x += number*dx[1];
                y += number*dy[1];
            } else if(dir=='N'){
                x += number*dx[2];
                y += number*dy[2];
            } else {
                x += number*dx[3];
                y += number*dy[3];
            }
        }

        bw.write(x+" "+y);
        bw.flush();

    }
}