import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1)>Math.abs(o2)){
                    return Math.abs(o1) - Math.abs(o2);
                } else if(Math.abs(o1) == Math.abs(o2)) {
                    return o1-o2;
                } else {
                    return -1;
                }
            }
        });
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num==0) bw.write((q.size()==0 ? 0 : q.poll())+"\n");
            else q.add(num);
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
