import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        String[][] arr = new String[r][c];
        for(int i=0; i<r; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j=0; j<c; j++){
                arr[i][j] = st1.nextToken();
            }
        }
        int count = 0;

        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                for(int k=i+1; k<r-1; k++){
                    for(int l=j+1; l<c-1; l++){
                        if(arr[0][0]!=arr[i][j] && arr[i][j]!=arr[k][l] && arr[k][l]!=arr[r-1][c-1]) count++;
                    }
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
