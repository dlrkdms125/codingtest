import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int n = Integer.parseInt(br.readLine());
       int[] x1 = new int[n];
       int[] y1 = new int[n];
       int[] x2 = new int[n];
       int[] y2 = new int[n];
       int offset = 1000;
       char[][] checked = new char[2001][2001];
       for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken())+offset;
            y1[i] = Integer.parseInt(st.nextToken())+offset;
            x2[i] = Integer.parseInt(st.nextToken())+offset;
            y2[i] = Integer.parseInt(st.nextToken())+offset;
       }
       for(int i=0; i<n; i++){
         for(int x=x1[i]; x<x2[i]; x++){
            for(int y=y1[i]; y<y2[i]; y++){
                if(i%2 == 0) checked[x][y] = 'R';
                else checked[x][y] = 'B';
            }
         }
       }
       int area = 0;
       for(int i=0; i<2001; i++){
        for(int j=0; j<2001; j++){
            if(checked[i][j]=='B') area++;
        }
       }

       bw.write(String.valueOf(area));
       bw.flush();
    }
}