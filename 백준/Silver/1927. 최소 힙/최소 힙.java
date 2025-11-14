import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num>0) pq.add(num);
            else {
                if(pq.isEmpty()) bw.write("0"+"\n");
                else bw.write(String.valueOf(pq.poll())+"\n");
            } 
        }
    
        bw.close();
        br.close();
    }
}