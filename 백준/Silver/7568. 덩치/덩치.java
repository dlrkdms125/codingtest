import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] people = new int[n][2];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            people[i][0] = weight;
            people[i][1] = height;
        }
        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(people[i][0]<people[j][0] && people[i][1]<people[j][1]) cnt++;
            }
            bw.write(String.valueOf(1+cnt)+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}