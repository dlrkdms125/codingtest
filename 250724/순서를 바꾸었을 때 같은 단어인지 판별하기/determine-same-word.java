import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input1 = br.readLine();
        String input2 = br.readLine();
        if (input1.length() != input2.length()) {
            bw.write("No");
            bw.flush();
            return;
        }
        char[] charinput1 = input1.toCharArray();
        char[] charinput2 = input2.toCharArray();
        Arrays.sort(charinput1);
        Arrays.sort(charinput2);
         for (int i = 0; i < charinput1.length; i++) {
            if (charinput1[i] != charinput2[i]) {
                bw.write("No");
                bw.flush();
                return;
            }
        }
        bw.write("Yes");
        bw.flush();
    }
}