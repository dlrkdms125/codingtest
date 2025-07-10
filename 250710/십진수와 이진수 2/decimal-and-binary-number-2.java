import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] n = br.readLine().split("");
        int num = 0;
        for(int i=0; i<n.length; i++){
            num = num*2+Integer.parseInt(n[i]);
        }
        num = num*17;
        int cnt = 0;
        int[] digits = new int[1000];
        while(true) {
            if(num<2) {
                digits[cnt++]=num;
                break;
            }
            digits[cnt++] = num%2;
            num /= 2;
        }
        for(int i=cnt-1; i>=0; i--){
            bw.write(String.valueOf(digits[i]));
        }

        bw.flush();

    }
}
