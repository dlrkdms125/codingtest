import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 만약에 입력값이 숫자인지, 문자인지 어떻게 알고, 타입을 선언해?
        String input = br.readLine();
        char c = input.charAt(0);
        bw.write(String.valueOf((int) c));
    
        bw.flush();
        bw.close();
        br.close();
    }    
}