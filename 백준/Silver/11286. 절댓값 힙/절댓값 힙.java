import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 절대값이 가장 작은 값을 출력, 제거
        // 작은 값이 여러 개 일때는 가장 작은 수를 poll()

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if(absA == absB) return a- b;
            return absA-absB;
        });
        for(int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            if(number == 0) {
                if(pq.isEmpty()) sb.append(0).append('\n');
                else sb.append(pq.poll()).append('\n');
            } else {
                pq.add(number);
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();
    }
}