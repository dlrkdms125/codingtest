import java.io.*;
import java.util.*;


public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result = add(a,b,c);
        bw.write(String.valueOf(result));
        bw.flush();

    }
    private static int add(int a, int b, int c){
        int answer = 0;
        if(a>b && b>c) answer = c;
        else if(a>c && c>b) answer = b;
        else if(b>a && a>c) answer = c;
        else if(b>c && c>a) answer = a;
        else if(c>a && a>b) answer = b;
        else answer = a;

        return answer;
    }
}