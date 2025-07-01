import java.util.Scanner;
import java.io.*;


public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(determin(n)) bw.write("Yes");
        else bw.write("No");
        bw.flush();


    }
    private static boolean determin(int n) {
        int sum = n/10 + n%10;
        return (sum %5==0 && n%2==0) ? true: false;
    }

}