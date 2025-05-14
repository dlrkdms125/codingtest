import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            if(number>0) pq.add(number);
            else if(number==0) {
                if(!pq.isEmpty()) bw.write(String.valueOf(pq.poll())+"\n");
                else bw.write(String.valueOf(0)+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}