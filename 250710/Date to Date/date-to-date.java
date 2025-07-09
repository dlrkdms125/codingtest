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
        int[] sche = {0, 31,30,31,30,31,30,31,31,30,31,30,31};

        int start = getDay(sm, sd, sche);
        int end = getDay(em, ed, sche);

        int answer = end - start;
        if(answer<0) answer += 365;

        bw.write(String.valueOf(answer));
        bw.flush();
    
    }

    static int getDay(int month, int day, int[] sche){
        int sum = 0;
        for(int i=1; i<=month; i++) sum += sche[i];
        return sum + day;
    }
}