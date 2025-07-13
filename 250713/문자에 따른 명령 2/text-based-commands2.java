import java.util.*;
import java.io.*;

public class Main { 
    // 북동남서
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = 0, y = 0;
        int dirNum = 0;
        String[] input = br.readLine().split("");
        for(int i=0; i<input.length; i++){
            if(input[i].equals("L")) {
                dirNum = (dirNum+3)%4;
            } else if(input[i].equals("R")){
                dirNum = (dirNum+1)%4;
            } else if(input[i].equals("F")){
                x += dx[dirNum];
                y += dy[dirNum];
            }
        }

        bw.write(String.valueOf(x+" "+y));
        bw.flush();

    }
}