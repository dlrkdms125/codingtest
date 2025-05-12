import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] =-1;
        }
        // 각 알파벳의 처음 등장 위치 저장
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a'; // 아스키코드를 이용해 a~z를 0~25로 매핑
            if (arr[idx] == -1) { // 아직 등장하지 않은 경우에만 저장
                arr[idx] = i;
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            bw.write(arr[i] + (i < 25 ? " " : "\n"));
        }
        bw.flush();
    }
}