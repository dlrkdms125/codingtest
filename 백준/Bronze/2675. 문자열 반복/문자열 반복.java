import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++){
            String[] str = br.readLine().split(" ");
            int count = Integer.parseInt(str[0]);
            String word = str[1];
            for(int j=0; j<word.length(); j++){
                for(int k=0; k<count; k++){
                    bw.write(word.charAt(j));
                }
            }
            bw.newLine();
        }
    
        bw.flush();
        bw.close();
        br.close();
    }    
}