import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] line = new int[2001];
        int offset = 1000;
        int cur = offset;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);
            if(dir=='R'){
                for(int j=1; j<=number; j++){
                    line[cur+j-1]++;
                }
                cur += number;
            } else {
                for(int j=1; j<=number; j++){
                    line[cur-j]++;
                }
                cur -= number;
            }
        }
        int cnt = 0;
        for(int i=0; i<line.length; i++){
            if(line[i]>=2) cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}
