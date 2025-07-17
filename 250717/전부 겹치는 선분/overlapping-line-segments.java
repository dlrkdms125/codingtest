import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] line = new int[102];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            for(int j=x1-1; j<x2; j++){
                line[j]++;
            }
        }
        String answer = "No";
        for(int i=0; i<line.length; i++){
            if(line[i]>=3) {
                answer = "Yes";
                break;
            } 
        }
        bw.write(answer);
        bw.flush();
    }
}