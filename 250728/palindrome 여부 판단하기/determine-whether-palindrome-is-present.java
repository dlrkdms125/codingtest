import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        String input = br.readLine();
        if(isTrue(input)) bw.write("Yes");
        else bw.write("No");
        bw.flush();


    }
    private static boolean isTrue(String input){
        return new StringBuilder(input).reverse().toString().equals(input);
    }
}