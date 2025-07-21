import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int maxx1 = Integer.MIN_VALUE;
        int minx2 = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            if(x1>maxx1) maxx1 = x1;
            if(x2<minx2) minx2 = x2;
        }
        if(maxx1<=minx2) bw.write("Yes");
        else bw.write("No");
        bw.flush();
        bw.close();
        br.close();
    }
}
