import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(getTime(a,b,c)));
        bw.flush();

    }
    static int getTime(int d, int h, int m){
        if(m-60<0) {
            m += 60;
            h--;
        } 
        if(h-11<0){
            d--;
            h += 24;
        }
        int sum = (d-11)*24*60 + (h-11)*60 + m-11;
        if(sum<0) sum = -1;
        return sum;
    }
}