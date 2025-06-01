import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            q.add(Integer.parseInt(br.readLine()));
        }
        int total = 0;

        while(q.size()>=2){
            int a = q.poll();
            int b = q.poll();
            int sum = a+b;
            total += sum;
            q.add(sum);
        }
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();

    }
}