import java.util.Scanner;
import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());
        if(isyooun(y)) bw.write("true");
        else bw.write("false");
        bw.flush();
    }
    private static boolean isyooun(int n) {
        boolean answer = false;
        if(n%4==0) answer = true;
        if(n%100==0 && n%400 != 0) answer = false;
        return answer;
    }
}