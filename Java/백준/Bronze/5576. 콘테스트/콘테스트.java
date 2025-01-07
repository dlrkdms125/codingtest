import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] wArr = new int[10];
        int[] kArr = new int[10];
        for(int i=0; i<10; i++){
            wArr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<10; i++){
            kArr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(wArr);
        Arrays.sort(kArr);
        int wSum = wArr[7]+wArr[8]+wArr[9];
        int kSum = kArr[7]+kArr[8]+kArr[9];

        bw.write(wSum+" "+kSum);
        bw.close();
        br.close();

    }
}