import java.util.*;
import java.io.*;

public class Main { 
    // 북동남서
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split("");
        int dir = 0;
        int x = 0;
        int y = 0;
        for(int i=0; i<input.length; i++){
            if(input[i].equals("R")){
                dir = (dir+1)%4;
            } else if(input[i].equals("L")){
                dir = (dir+3)%4;
            } else {
                x += dx[dir];
                y += dy[dir];
            }
        }

        bw.write(x+" "+y);
        bw.flush();
    }

}