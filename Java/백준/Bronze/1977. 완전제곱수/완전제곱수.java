

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            if (isPerfectSquare(i)) { 
                sum += i; 
                min = Math.min(min, i); 
            }
        }

        if (sum == 0) {
            bw.write("-1\n");
        } else {
            bw.write(sum + "\n" + min + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

  
    public static boolean isPerfectSquare(int n) {
        if (n < 0) return false; 
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}