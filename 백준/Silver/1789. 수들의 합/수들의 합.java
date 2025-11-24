import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        long num = 0;
        while(true){
            num++;
            if((num+1)*num > n*2) {
                bw.write(String.valueOf(num-1));
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}