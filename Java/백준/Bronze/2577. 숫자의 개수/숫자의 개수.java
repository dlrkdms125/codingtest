import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= Integer.parseInt(br.readLine());
        }
        String str = String.valueOf(result);
        int[] arr = new int[10];
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) -'0'; // 문자 -> 숫자
            arr[num]++;
        }
       
        for (int i = 0; i < arr.length; i++) {
            bw.write(String.valueOf(arr[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}