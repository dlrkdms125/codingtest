import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int min = 10000;
        for(int i=m; i<=n; i++){
            int sum = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0) sum++;
            }
            if(sum==2) {
                result += i;
                if(i<min) min = i;
            }
        }
        if(result!=0){
            bw.write(String.valueOf(result));
            bw.newLine();
            bw.write(String.valueOf(min));
        } else {
            bw.write("-1");
        }
        bw.flush();
    }
}