import java.util.*;
import java.io.*;

public class Main {
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] apos = new int[5000000];
        int[] bpos = new int[5000000];
        int time = 0;
        int offset = 1000000;
        int pos = offset;
        // a 이동
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            char dir = st.nextToken().charAt(0);
            int len = Integer.parseInt(st.nextToken());
            for(int j=0; j<len; j++){
                if(dir=='L') pos--;
                else pos++;
                apos[time++]=pos;
            }
        }
        int atime = time;

        time = 0;
        pos = offset;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            char dir = st.nextToken().charAt(0);
            int len = Integer.parseInt(st.nextToken());
            for(int j=0; j<len; j++){
                if(dir=='L') pos--;
                else pos++;
                bpos[time++]=pos;
            }
        }
        int btime = time;
        int answer = -1;
        for(int t=0; t<Math.min(atime, btime); t++){
            if(apos[t]==bpos[t]) {
                answer = t+1;
                break;
            }
        }


        bw.write(String.valueOf(answer));
        bw.flush();

    }
}