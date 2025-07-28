import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int[] result = cal(a,b);
        bw.write(result[0]+" "+result[1]);
        bw.flush();

    }
    private static int[] cal(int a, int b){
        if(a<b) {
            b *= 2;;
            a += 10;
        } else {
            b += 10;
            a *= 2;
        }
        return new int[]{a,b};
    }
}