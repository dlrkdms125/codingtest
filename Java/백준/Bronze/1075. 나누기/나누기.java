
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        n /= 100;
        n *= 100;
        int ans = 0;

        while(n%f!=0){
            n++;
            ans++;
        }
        if(ans<10) bw.write("0"+ans);
        else bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}