import java.util.*;
import java.io.*;

public class Main {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int len = stack.size();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            
            switch(input) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case "pop":
                    bw.write((stack.isEmpty() ? -1 :stack.pop())+"\n");
                    break;
                case "size":
                    bw.write(stack.size()+"\n");
                    break;
                case "empty":
                    bw.write((stack.isEmpty() ? 1:0)+"\n");
                    break;
                case "top":
                    bw.write((stack.isEmpty() ? -1: stack.peek())+"\n");
                    break;
            }
        }
        bw.flush();
    
    }
    
}