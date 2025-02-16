import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='S') str.append("*S");
            else {
                str.append("*LL");
                i++;
            }
        }
        str.append("*");
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='*') count++;
        }
        count = Math.min(count, n);
        
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
