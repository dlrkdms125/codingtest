import java.util.Scanner;
import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = add(n);
        bw.write(String.valueOf(result/10));
        bw.flush();
    }
    private static int add(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
       return sum;
    }
}