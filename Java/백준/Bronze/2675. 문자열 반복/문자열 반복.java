import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] arr = br.readLine().split(" ");
            int n = Integer.valueOf(arr[0]);
            String str = arr[1];

            // arr[1]인 문자열을 arr[0]만큼 돌고 출력한다
            for(int j=0; j<str.length(); j++){
                for (int k = 0; k < n; k++) {
                    bw.write(str.charAt(j));
                }
            }
            bw.newLine();

        }
        bw.flush();
        bw.close();
        br.close();
    }
}