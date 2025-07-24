import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(st.nextToken()));
            if((i+1)%2==1) {
                List<Integer> copy = new ArrayList<>(list);
                Collections.sort(copy);
                bw.write(String.valueOf(copy.get(copy.size()/2)+" "));
            }
        }
        bw.flush();
    }
}