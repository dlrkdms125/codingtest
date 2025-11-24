import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] sche = new int[n][2];
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            sche[i][0] = Integer.parseInt(st.nextToken());
            sche[i][1] = Integer.parseInt(st.nextToken());
        }
        // 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
        Arrays.sort(sche, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) return o1[0]-o2[0];
                return o1[1]-o2[1];
            }
        });
        
        int cnt = 0;
        int prev_end_time = 0;
        for(int i=0; i<n; i++){
            if(prev_end_time<=sche[i][0]) {
                prev_end_time = sche[i][1];
                cnt++;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}