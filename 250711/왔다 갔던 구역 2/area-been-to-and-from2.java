import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[][] command = new String[n+2][2];
        int[] line = new int[1000];
        for(int i=0; i<line.length; i++){
            line[i] = 0;
        }
        int cnt = 0;
        int now = 500;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            command[i][0] = st.nextToken();
            command[i][1] = st.nextToken();
            int number  = Integer.parseInt(command[i][0]);
            if(command[i][1].equals("R")) {
                for(int j=1; j<=number; j++) {
                    line[now + j]++;
                }
                now = now + number;
            } else {
                for(int j=1; j<=number; j++) {
                    line[now - j]++;
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