import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arra = new int[a];
        int[] arrb = new int[b];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            arra[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<b; i++){
            arrb[i] = Integer.parseInt(st.nextToken());
        }

        if(isTrue(arra, arrb)) bw.write("Yes");
        else bw.write("No");
        bw.flush();

    }
    private static boolean isTrue(int[] arra, int[] arrb){
        for(int i=0; i<=arra.length-arrb.length; i++){
            boolean match = true;
            for(int j=0; j<arrb.length; j++){
                if(arra[i+j]!=arrb[j]) {
                    match = false;
                    break;
                }
            }
            if(match) return true;
        }
        return false;
    }
}