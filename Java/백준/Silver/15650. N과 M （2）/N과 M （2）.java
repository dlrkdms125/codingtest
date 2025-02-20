
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static boolean[] visit;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n];
        backtracking(n, m, 0,0);
        bw.flush();
        bw.close();
        br.close();
    }
    public static void backtracking(int n, int m, int depth, int start) throws IOException {
        if(depth==m){ // 길이가 m인 조합이 완성된 경우
            for(int val: arr){
                bw.write(val+" ");
            }
            bw.newLine();
            return;
        }
        for(int i=start; i<n; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i+1;
                backtracking(n,m,depth+1, i+1);
                visit[i] = false;
            }
        }

    }

}
