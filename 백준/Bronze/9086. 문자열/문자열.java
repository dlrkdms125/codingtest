import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++){
            String str = br.readLine();
            int len = str.length();
            if(len==1) bw.write(str+str+"\n");
            else {
                bw.write(str.charAt(0));
                bw.write(str.charAt(len-1));
                bw.write("\n");
            }
    
        }

        bw.flush();
        bw.close();
        br.close();
    }    
}