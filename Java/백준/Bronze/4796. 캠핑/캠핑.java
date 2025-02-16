import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNumber = 1;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if(L==0 && P==0 && V==0) break;
            int a = V / P;
            int b = V % P;
            int result = a * L + Math.min(b, L);
            bw.write("Case " + caseNumber + ": " + result + "\n");
            caseNumber++;  
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
