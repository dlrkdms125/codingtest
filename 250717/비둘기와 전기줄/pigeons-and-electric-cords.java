import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> bridMap = new HashMap<>();
        int count = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int bird = Integer.parseInt(st.nextToken());
            int where = Integer.parseInt(st.nextToken());
            if(!bridMap.containsKey(bird)) bridMap.put(bird, where);
            else {
                if(bridMap.get(bird) != where){
                    count++;
                    bridMap.put(bird, where);
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}