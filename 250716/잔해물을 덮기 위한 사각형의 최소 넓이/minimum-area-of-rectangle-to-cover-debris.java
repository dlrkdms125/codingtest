import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] checked = new int[2001][2001];
        int[] x1 = new int[2];
        int[] y1 = new int[2];
        int[] x2 = new int[2];
        int[] y2 = new int[2];
        int offset = 1000;

        for(int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken())+offset;
            y1[i] = Integer.parseInt(st.nextToken())+offset;
            x2[i] = Integer.parseInt(st.nextToken())+offset;
            y2[i] = Integer.parseInt(st.nextToken())+offset;
        }
        
        for(int i=0; i<2; i++){
            for(int x=x1[i]; x<x2[i]; x++){
                for(int y=y1[i]; y<y2[i]; y++) {
                    checked[x][y]=i+1;
                }
            }
        }
        int minX = 2000;
        int maxX = 0;
        int minY = 2000;
        int maxY = 0;
        boolean firstRectExist = false;
        for(int x=0; x<=2000; x++){
            for(int y=0; y<=2000; y++){
                if(checked[x][y]==1){
                    firstRectExist = true;
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                }
            }
        }

        int area;
        if(!firstRectExist) area = 0;
        else area = (maxX-minX+1)*(maxY-minY+1);

        bw.write(String.valueOf(area));
        bw.flush();
    }
}