import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 1;
        for(int i=0; i<3; i++){
            sum = sum * Integer.parseInt(st.nextToken());
        }
        int result = sum(sum);
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static int sum(int n){
        if(n<10) return n;
        return sum(n/10)+n%10;
    }
}