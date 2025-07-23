import java.util.*;
import java.io.*;

public class Main {
    static int[] arr = new int[100];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n = Integer.parseInt(br.readLine());
        int result = print(n)%100;
        bw.write(String.valueOf(result));
        bw.flush();

    }
    private static int print(int n) throws IOException {
        int answer = 0;
        if(n==1) answer = 2;
        if(n==2) answer =  4;
        if(n>=3) answer = print(n-1)*print(n-2);
        return answer;
    }
}