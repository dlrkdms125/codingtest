import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] x1 = new int[4];
        int[] y1 = new int[4];
        int[] x2 = new int[4];
        int[] y2 = new int[4];

        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken())+1000;
            y1[i] = Integer.parseInt(st.nextToken())+1000;
            x2[i] = Integer.parseInt(st.nextToken())+1000;
            y2[i] = Integer.parseInt(st.nextToken())+1000;
        }
        int[][] checked = new int[2001][2001];
        for(int i=0; i<2; i++){
            for(int x=x1[i]; x<x2[i]; x++){
                for(int y=y1[i]; y<y2[i]; y++){
                    checked[x][y]++;
                }
            }
        }
        for(int x=x1[2]; x<x2[2]; x++){
            for(int y=y1[2]; y<y2[2]; y++){
                checked[x][y]--;
            }
        }
        int area = 0;
        for(int i=0; i<2001; i++){
            for(int j=0; j<2001; j++){
                if(checked[i][j]==1) area++;
            }
        }
        bw.write(String.valueOf(area));
        bw.flush();
    }
}