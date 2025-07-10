import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int[] line = new int[1000];
        for(int i=0; i<1000; i++){
            line[i] = 0;
        }
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j=a+100; j<b+100; j++){
                line[j]++;
            }
        }
        for(int i=0; i<line.length; i++){
            if(line[i]>max) max = line[i];
        }

        bw.write(String.valueOf(max));
        bw.flush();

    }
}