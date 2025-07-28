import java.util.*;
import java.io.*;

class Pair {
    int value;
    int index;
    public Pair(int value, int index){
        this.value=value;
        this.index=index;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n = Integer.parseInt(br.readLine().trim());
        Pair[] pairs = new Pair[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
           int val = Integer.parseInt(st.nextToken());
           pairs[i] = new Pair(val, i);
        }
        Arrays.sort(pairs, (a,b) -> Integer.compare(a.value, b.value));

        int[] result = new int[n];
        for(int i=0; i<n; i++){
            result[pairs[i].index] = i+1;
        }
        for(int i=0; i<n; i++){
            bw.write(result[i]+" ");
        }
        bw.flush();
    }
}