import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch(cmd){
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    q.add(num);
                    break;
                case "pop":
                    bw.write((q.isEmpty() ? -1:q.poll())+"\n");
                    break;
                case "size":
                    bw.write(q.size()+"\n");
                    break;
                case "empty":
                    bw.write((q.isEmpty() ? 1:0)+"\n");
                    break;
                case "front":
                    bw.write((q.isEmpty() ? 1:q.peek())+"\n");
                    break;
            }

        }
        bw.flush();
    }
}
