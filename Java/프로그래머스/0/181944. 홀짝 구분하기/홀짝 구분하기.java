import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if(n%2==0){
            bw.write(n+" is even");
        } else {
            bw.write(n+" is odd");
        }
        bw.flush();
        bw.close();
        
    }
}