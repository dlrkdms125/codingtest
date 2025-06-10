import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        n = (n/100)*100;
        for(int i=0; i<99; i++){
            if(n%f==0) break;
            else n++;
        }
        if(n%100<10) bw.write("0"+n%100);
        else bw.write(String.valueOf(n%100));
        bw.flush();
        bw.close();
        br.close();
    }
}