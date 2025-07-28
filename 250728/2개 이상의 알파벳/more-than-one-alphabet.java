import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        String a = br.readLine();
        if(istrue(a).equals("true")) bw.write("Yes");
        else bw.write("No");
        bw.flush();

    }
    private static String istrue(String input){
        String answer = "false";
        for(int i=0; i<input.length()-1; i++){
            if(input.charAt(i) != input.charAt(i+1)) {
                answer = "true";
                break;
            }
        }
        return answer;
    }
}