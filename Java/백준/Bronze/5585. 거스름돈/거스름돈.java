import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cost = Integer.parseInt(br.readLine());
        cost = 1000-cost;
        int[] costarr = {500,100,50,10,5,1};
        
        int num = 0;
        for (int i = 0; i < 6; i++) {
            if(cost/costarr[i]>0) {
                num += cost/costarr[i];
                cost = cost%costarr[i];
            }
        }
        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
        br.close();
    }
}