import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int answer = 0;
        if(b<=c || d<=a) answer = d-c+b-a;
        else {
            if(c<=a && a<=d && d<=b) answer = b-c;
            else if(a<=c && c<=b && b<=d) answer = d-a;
            else if(a<=c && c<=d && d<=b) answer = b-a;
            else if(c<=a && a<=b && b<=d) answer = d-c;
        }
        bw.write(String.valueOf(answer));
        bw.flush();

    }
}