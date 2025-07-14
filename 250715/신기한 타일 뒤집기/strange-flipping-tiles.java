import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] tile = new String[200001];
        for(int i=0; i<tile.length; i++){
            tile[i] = "G";
        }
        int offset = 100000;
        int pos = offset;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            char ch = st.nextToken().charAt(0);
            if(ch=='R'){
                for(int j=0; j<number; j++){
                    tile[pos+j] = "B";
                }
                pos += number-1;
            } else if(ch=='L'){
                for(int j=0; j<number; j++){
                    tile[pos-j] = "W";
                }
                pos -= number-1;
            }
        }
        int wCount = 0;
        int bCount = 0;
        for(int i=0; i<tile.length; i++){
            if(tile[i].equals("W")) wCount++;
            else if(tile[i].equals("B")) bCount++;
        }

        bw.write(wCount+" "+bCount);
        bw.flush();

    }
}