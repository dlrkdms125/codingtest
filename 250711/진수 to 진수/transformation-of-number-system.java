import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String[] n = br.readLine().split("");

        int num = 0;
        for(int i=0; i<n.length; i++){
            num = num*a + Integer.parseInt(n[i]);
        }
        int[] digits = new int[1000];
        int cnt = 0;
        if(num == 0) {
            digits[cnt++] = 0;
        }
        while(num > 0){
            digits[cnt++] = num % b;
            num /= b;
        }
        for(int i=cnt-1; i>=0; i--){
            bw.write(String.valueOf(digits[i]));
        }
        bw.flush();
    }
}
