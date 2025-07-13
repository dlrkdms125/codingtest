import java.util.*;
import java.io.*;

public class Main { 
    // 북동남서
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};
    static String input;
    static int x = 0, y = 0;
    static int curDir = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = 0, y = 0;
        int dir = 0;
        input = br.readLine();
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch=='L') curDir = (curDir+3)%4;
            else if(ch=='R') curDir = (curDir+1)%4;
            else {
                x += dx[curDir];
                y += dy[curDir];
            } 
        }

        bw.write(String.valueOf(x+" "+y));
        bw.flush();

    }
    
}