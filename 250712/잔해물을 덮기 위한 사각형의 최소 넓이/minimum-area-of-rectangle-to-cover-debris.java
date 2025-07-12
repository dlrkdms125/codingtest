import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] checked = new int[2001][2001];
        int[] x1 = new int[2001];
        int[] y1 = new int[2001];
        int[] x2 = new int[2001];
        int[] y2 = new int[2001];
        for(int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken())+1000;
            y1[i] = Integer.parseInt(st.nextToken())+1000;
            x2[i] = Integer.parseInt(st.nextToken())+1000;
            y2[i] = Integer.parseInt(st.nextToken())+1000;
        }
        for(int i=x1[0]; i<=x2[0]; i++){
            for(int j=y1[0]; j<=y2[0]; j++){
                checked[i][j]++;
            }
        }
        for(int i=x1[1]; i<=x2[1]; i++){
            for(int j=y1[1]; j<=y2[1]; j++){
                checked[i][j]--;
            }
        }
        int area = 0;
        for(int i=0; i<2001; i++){
            for(int j=0; j<2001; j++){
                if(checked[i][j]>0) area++;
            }
        }

        bw.write(String.valueOf(area));
        bw.flush();
    }
}