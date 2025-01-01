import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter 생성
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); 
        }
        
        int target = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int result = 0;
        int lt = 0, rt = N - 1;

        while (lt < rt) {
            int sum = arr[lt] + arr[rt];
            
            if (sum == target) {
                result++;
                lt++;
                rt--;
            } else if (sum < target) {
                lt++;
            } else {
                rt--;
            }
        }

        bw.write(String.valueOf(result)); 
        bw.newLine();
        bw.flush(); 
        bw.close(); 
    }
}

