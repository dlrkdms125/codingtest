import java.util.*;
import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum = 0;
        for(int i=a; i<=b; i++){
            if(isPrime(i)) sum += i;
        }
        bw.write(String.valueOf(sum));
        bw.flush();

    }
    private static boolean isPrime(int n){
        boolean answer = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0) answer = false;
        }
        return answer;
    }
}