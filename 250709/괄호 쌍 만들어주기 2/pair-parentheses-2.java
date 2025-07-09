import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int n = input.length();
        int cnt = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n-1; j++){
                if(input.charAt(i)=='(' && input.charAt(i+1)=='(' && input.charAt(j)==')' && input.charAt(j+1)==')') cnt++;
            }
        }


        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}
