import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(recur(n)));
        bw.flush();
        bw.close();
        br.close();
    }
    private static int recur(int n){
        if(n==0) return 1;
        return n * recur(n - 1);
    }
}