import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> birdMap = new HashMap<>();
        int cnt = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int bird = Integer.parseInt(st.nextToken());
            int where = Integer.parseInt(st.nextToken());
            if(!birdMap.containsKey(bird)) birdMap.put(bird, where);
            else {
                if(birdMap.get(bird)!=where){
                    cnt++;
                    birdMap.put(bird, where);
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}