import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Long[] arr = new Long[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        long cnt = 0;
        long sum = 0;
        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);
    
        for(int i=1; i<=n; i++){
            sum += arr[i];
            if(map.containsKey(sum-k)) cnt+= map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0L)+1);
        }
    
        bw.write(String.valueOf(cnt));
        bw.flush();
    
    }
}