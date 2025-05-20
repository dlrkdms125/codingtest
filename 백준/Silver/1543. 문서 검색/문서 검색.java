import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String find = br.readLine();
        int count = 0;
        int i=0;
        while(i<= str.length() - find.length()){
            if(str.substring(i, i+find.length()).equals(find)) {
                count++;
                i += find.length();
            } else {
                i++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }
}