import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<k; i++){
            int number = Integer.parseInt(br.readLine());
            if(number==0) stack.pop();
            else stack.push(number);
        }

        int cnt = 0;
        while(!stack.isEmpty()) {
            cnt += stack.pop();
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}