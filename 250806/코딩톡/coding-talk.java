import java.util.*;
import java.io.*;

public class Main {
    static char[] ch = new char[100];
    static int[] u = new int[100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            ch[i] = st.nextToken().charAt(0);
            u[i] = Integer.parseInt(st.nextToken());
        }
        
        if(u[p-1]==0) bw.write("0");

        for(int i=0; i<n; i++){
            char person = (char)((int)'A'+i);
            boolean read = false;
            for(int j=0; j<m; j++){
                if(u[j]>=u[p-1] && ch[j]==person) read = true;
            }
            if(read==false) bw.write(person+" ");
        }

        bw.flush();
        
    }
}
