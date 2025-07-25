import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=1; i<=n; i++){
            dq.addLast(i);
        }
        while(dq.size()>1){
            dq.pollFirst();
            int number = dq.pollFirst();
            dq.addLast(number);
        }
        bw.write(String.valueOf(dq.peekFirst()));
        bw.flush();
        
    }
}