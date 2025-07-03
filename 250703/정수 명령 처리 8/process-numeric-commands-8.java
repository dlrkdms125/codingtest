import java.util.*;
import java.io.*;

public class Main {
    static LinkedList<Integer> list = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String input = br.readLine();
            String[] arr = input.split(" ");
            String command = arr[0];

            switch (command) {
                case "push_front":
                    list.addFirst(Integer.parseInt(arr[1]));
                    break;
                case "push_back":
                    list.addLast(Integer.parseInt(arr[1]));
                    break;
                case "pop_front":
                    if(list.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write(list.removeFirst() + "\n");
                    }
                    break;
                case "pop_back":
                    if(list.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(list.removeLast() + "\n");
                    }
                    break;
                case "size":
                    bw.write(list.size() + "\n");
                    break;
                case "empty":
                    bw.write((list.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "front":
                    if(list.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(list.getFirst() + "\n");
                    }
                    break;
                case "back":
                    if(list.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(list.getLast() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
