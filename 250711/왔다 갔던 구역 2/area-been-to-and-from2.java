import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] line = new int[1001]; // 구간 체크용 (좌표 0~1000)
        int cnt = 0;
        int now = 500;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number  = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();
            if(dir.equals("R")) {
                for(int j=0; j<number; j++) {
                    int left = now + j;
                    int right = now + j + 1;
                    line[Math.min(left, right)]++;
                }
                now = now + number;
            } else {
                for(int j=0; j<number; j++) {
                    int left = now - j;
                    int right = now - j - 1;
                    line[Math.min(left, right)]++;
                }
                now = now - number;
            }
        }
        for(int i=0; i<line.length; i++){
            if(line[i]>=2) cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}
