import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); 
        int dasom = Integer.parseInt(br.readLine());

        if (n == 1) { 
            bw.write("0\n");
            bw.flush();
            bw.close();
            br.close();
            return;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 

        for (int i = 1; i < n; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;

        while (!pq.isEmpty() && pq.peek() >= dasom) { 
            int maxVotes = pq.poll();
            pq.add(maxVotes - 1); 
            ++dasom; 
            ++count; 
        }

        bw.write(String.valueOf(count) + "\n"); 
        bw.flush();
        bw.close();
        br.close();
    }
}