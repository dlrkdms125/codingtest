import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sm = Integer.parseInt(st.nextToken());
        int sd = Integer.parseInt(st.nextToken());
        int em = Integer.parseInt(st.nextToken());
        int ed = Integer.parseInt(st.nextToken());
        int elapsedDays = 0;

        int[] num_of_days = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while(true) {
            if(sm==em && sd==ed) break;
            elapsedDays++;
            sd++;
            if(sd>num_of_days[sm]) {
                sm++;
                sd = 1;
            }
        }

        bw.write(String.valueOf(elapsedDays+1));
        bw.flush();
    }
}