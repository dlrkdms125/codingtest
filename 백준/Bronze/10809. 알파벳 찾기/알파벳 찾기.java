import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int[] arr = new int[26];
        for(int i=0; i<26; i++){
            arr[i] =-1;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(arr[ch-'a']==-1) {
                arr[ch-'a'] = i;
            } 
        }
        for(int val:arr){
            bw.write(val+" ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }    
}