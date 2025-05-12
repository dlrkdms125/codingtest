import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int count = 0;

        for(int i=0; i<n; i++){
            arr[i] = br.readLine();
            if(check(arr[i])) count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
    private static boolean check(String str){ // 그룹단어이면 true
        // 26 배열을 만들고, 각각의 아스키코드 값으로 배열에 값을 증가시켜서, 하나라도 2이상이면 false를 반환
        boolean[] vi = new boolean[26];
        char prev = 0;
        for(int i=0; i<str.length(); i++){
            char current = str.charAt(i);

            if(prev != current){
                if(vi[current-'a']) return false;
                vi[current-'a']= true;
                prev = current;

            }
        }
        return true;
    }
}
