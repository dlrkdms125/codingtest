import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
    
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Stack<String> stack = new Stack<>();
            while(st.hasMoreTokens()){
                stack.push(st.nextToken());
            }
            bw.write("Case #"+(i+1)+": ");
            while(!stack.isEmpty()) {
                bw.write(stack.pop());
                if(!stack.isEmpty()) bw.write(" ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
           
    }
}