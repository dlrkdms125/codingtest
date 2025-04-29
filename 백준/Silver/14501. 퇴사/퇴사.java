import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[][] schedule;
    static int result;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        schedule = new int[n][2];
        
        int maxHeight = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            schedule[i][0] = Integer.parseInt(st.nextToken());
            schedule[i][1] = Integer.parseInt(st.nextToken());
        }
        result = 0;
        dfs(0,0);
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
        
     
    }
    public static void dfs(int idx, int pay){ // 날짜와 이익을 입력받아서
       if(idx>=n){ // 날짜가 n이상이면 result 중 최대값을 구하며 끝낸다.
           result = Math.max(pay,result);
           return;
       }
        // 상담을 끝난 날이 n 이하면, dfs에 상담이 끝난 날짜와 합친 상담비를 넣는다.
        if(idx+schedule[idx][0]<=n){ 
            dfs(idx+schedule[idx][0], pay+schedule[idx][1]);
        } else { // 상담을 끝낸 날이 n을 넘어가면, dfs에 상담이 끝난 날짜만 넘겨준다. 합친 상담비는 그대로고, 넘겨준 날짜는 탈출조건에서 사용한다/
            dfs(idx+schedule[idx][0], pay);
        }
        // dfs(idx+1, pay)를 dfs 끝에 넣어주어 이어서 상담하지 않고 날짜를 띄어서 새로운 날짜를 탐색할 수 있도록 해준다. 마지막 날짜까지 모두 탐색할 수 있음.
        dfs(idx+1, pay);
    }
}