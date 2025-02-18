import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int ss = Integer.parseInt(st.nextToken());

        int total = ss+s+60*m+3600*h;
        int newh = (total / 3600) % 24;
        int newm = (total%3600)/60;
        int news =  (total%3600)%60;
        
        bw.write(newh+" "+newm+" "+news);
        bw.flush();
        bw.close();
        br.close();
    }
}