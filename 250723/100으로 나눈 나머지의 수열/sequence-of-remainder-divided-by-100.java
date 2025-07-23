import java.util.*;
import java.io.*;

public class Main {
    static int[] arr = new int[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n = Integer.parseInt(br.readLine());
        Arrays.fill(arr,-1);
        int result = print(n)%100;
        bw.write(String.valueOf(result));
        bw.flush();

    }
    private static int print(int n) throws IOException {
        if(arr[n]!=-1) return arr[n];
        if(n==1) return arr[n]=2;
        if(n==2) return arr[n]=4;

        arr[n] = (print(n-1)*print(n-2))%100;
        return arr[n];
    }
}