import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch=='(') stack.push(ch);
            else if (ch==')') {
                stack.pop();
            }
        }
        if(stack.isEmpty()) bw.write("Yes");
        else bw.write("No");
        bw.flush();
    }
}