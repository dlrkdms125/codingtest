import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] parts = br.readLine().split("-");
        int sum = 0;
        sum += sum(parts[0]);
        // 나머지는 괄호 안에 있다고 생각하고 모두 빼줌
        for (int i = 1; i < parts.length; i++) {
            sum -= sum(parts[i]);
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
        
    }
    private static int sum(String s) {
        String[] tokens = s.split("\\+");
        int result = 0;
        for (String token : tokens) {
            result += Integer.parseInt(token);
        }
        return result;
    }
}
