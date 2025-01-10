import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int last = 0;
        while (N-- > 0) {
            String[] input = br.readLine().split(" ");
            String command = input[0];

            switch (command) {
                case "push":
                    last = Integer.parseInt(input[1]);
                    queue.offer(last);
                    break;

                case "pop":
                    bw.write(queue.isEmpty() ? "-1\n" : queue.poll() + "\n");
                    break;

                case "size":
                    bw.write(queue.size() + "\n");
                    break;

                case "empty":
                    bw.write(queue.isEmpty() ? "1\n" : "0\n");
                    break;

                case "front":
                    bw.write(queue.isEmpty() ? "-1\n" : queue.peek() + "\n");
                    break;

                case "back":
                    bw.write(queue.isEmpty() ? "-1\n" : last + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
