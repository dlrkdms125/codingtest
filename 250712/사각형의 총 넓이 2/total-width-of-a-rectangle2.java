import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int total = 0;
        int[] x1 = new int[10];
        int[] y1 = new int[10];
        int[] x2 = new int[10];
        int[] y2 = new int[10];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken())+100;
            y1[i] = Integer.parseInt(st.nextToken())+100;
            x2[i] = Integer.parseInt(st.nextToken())+100;
            y2[i] = Integer.parseInt(st.nextToken())+100;
        }
        int[][] checked = new int[201][201];
        for(int i=0; i<n; i++){
            for(int x=x1[i]; x<x2[i]; x++){
                for(int y=y1[i]; y<y2[i]; y++){
                    checked[x][y]++;
                }
            }
        }
        int area = 0;
        for(int x=0; x<=200; x++){
            for(int y=0; y<=200; y++){
                if(checked[x][y]>0) area++;
            }
        }


        bw.write(String.valueOf(area));
        bw.flush();

    }
}