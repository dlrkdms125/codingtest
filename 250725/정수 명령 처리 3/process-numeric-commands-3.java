import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            
            switch(cmd) {
                case "push_back":
                    int number = Integer.parseInt(st.nextToken());
                    dq.addLast(number);
                    break;
                case "push_front":
                    int number1 = Integer.parseInt(st.nextToken());
                    dq.addFirst(number1);
                    break;
                case "pop_front":
                    bw.write((dq.isEmpty() ? 1 : dq.pollFirst())+"\n");
                    break;
                case "pop_back":
                    bw.write((dq.isEmpty() ? 1 : dq.pollLast())+"\n");
                    break;
                case "size":
                    bw.write(dq.size()+"\n");
                    break;
                case "empty":
                    bw.write((dq.isEmpty() ? 1: 0)+"\n");
                    break;
                case "front":
                    bw.write(dq.peekFirst()+"\n");
                    break;
                case "back":
                    bw.write(dq.peekLast()+"\n");
                    break;
            }
        }
        bw.flush();
    }
}