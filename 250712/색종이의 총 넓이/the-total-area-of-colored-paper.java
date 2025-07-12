import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] checked = new int[300][300];
        int[] x = new int[300];
        int[] y = new int[300];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken())+100;
            y[i] = Integer.parseInt(st.nextToken())+100;
        }
        for(int i=0; i<n; i++){
            for(int j=x[i]; j<x[i]+8; j++){
                for(int k=y[i]; k<y[i]+8; k++){
                    checked[j][k]++;
                }
            }
        }
        int area = 0;
        for(int i=0; i<300; i++){
            for(int j=0; j<300; j++){
                if(checked[i][j] > 0) area++;
            }
        }
        bw.write(String.valueOf(area));
        bw.flush();

    }
}