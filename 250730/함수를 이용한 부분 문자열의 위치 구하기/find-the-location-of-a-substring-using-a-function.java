import java.util.*;
import java.io.*;


public class Main {
    static int n,m;
    static int index;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        String input = br.readLine();
        String goal = br.readLine();
        bw.write(String.valueOf(cal(input, goal)));
        bw.flush();

    }
    private static int cal(String input, String goal){
        int totallen = input.length();
        int goallen = goal.length();
        for(int i=0; i<=totallen-goallen; i++){
            boolean match = true;
            for(int j=0; j<goallen; j++){
                if(input.charAt(i+j) != goal.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if(match) return i;
        }
        return -1;
    }
}