import java.util.*;
import java.io.*;

class Bomb {
    String code;
    char color;
    int second;
    public Bomb(String code, char color, int second){
        this.code=code;
        this.color=color;
        this.second=second;
    }
};


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String code = st.nextToken();
        char color = st.nextToken().charAt(0);
        int second = Integer.parseInt(st.nextToken());
        Bomb bomb = new Bomb(code, color, second);
        bw.write("code : "+bomb.code);
        bw.newLine();
        bw.write("color : "+bomb.color);
        bw.newLine();
        bw.write("second : "+bomb.second);
        bw.flush();

    }
}