import java.util.*;
import java.io.*;

public class Main {
    String secretCode;
    char meetingPoint;
    int time;

    public Main(String secretCode, char meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String code = st.nextToken();
        char point = st.nextToken().charAt(0);
        int Time = Integer.parseInt(st.nextToken());

        Main main = new Main(code, point, Time);
        bw.write("secret code : "+code);
        bw.newLine();
        bw.write("meeting point : "+point);
        bw.newLine();
        bw.write("time : "+Time);
        bw.flush();

    }
}