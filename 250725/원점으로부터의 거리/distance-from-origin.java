import java.util.*;
import java.io.*;

class Spot {
    int x,y;
    public Spot(int x, int y){
        this.x=x;
        this.y=y;
    }
}



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n = Integer.parseInt(br.readLine());
        Spot[] spot = new Spot[n];
        int[] d = new int[n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            spot[i] = new Spot(x,y);
            d[i] = Math.abs(x)+Math.abs(y); 
        }
        Integer[] order = new Integer[n];
        for(int i=0; i<n; i++){
            order[i] = i;
        }
        Arrays.sort(order, (a,b) -> {
            if(d[a]!= d[b]) return Integer.compare(d[a], d[b]); // 거리 오름차순
            return Integer.compare(a,b); // 거리가 같으면 번호 오름차순
        });
        for(int idx: order){
            bw.write((idx+1)+"\n");
        }
        bw.flush();
    }
}