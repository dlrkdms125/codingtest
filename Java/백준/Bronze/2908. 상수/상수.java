import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");

        // 문자열 뒤집고 → 숫자로 변환
        int num1 = Integer.parseInt(new StringBuilder(str[0]).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(str[1]).reverse().toString());

        // 큰 수 출력
        bw.write(String.valueOf(Math.max(num1, num2)));
        bw.close();
        br.close();
    }
}