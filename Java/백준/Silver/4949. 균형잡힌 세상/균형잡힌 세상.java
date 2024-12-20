import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break; 

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (char ch : str.toCharArray()) {
                if (ch == '(' || ch == '[') {
                    stack.push(ch); 
                } else if (ch == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        isBalanced = false; 
                        break;
                    }
                } else if (ch == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop(); 
                    } else {
                        isBalanced = false; 
                        break;
                    }
                }
            }

            if (isBalanced && stack.isEmpty()) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.flush(); 
    }
}
