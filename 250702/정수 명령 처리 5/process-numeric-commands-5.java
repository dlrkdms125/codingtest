import java.util.*;
import java.io.*;

public class Main {
    // ArrayList는 static으로 선언하여 모든 메소드에서 접근 가능하게 합니다.
    static ArrayList<Integer> arr = new ArrayList<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // bw를 static으로 선언

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String input = br.readLine();
            String[] cmd = input.split(" ");
            
            switch(cmd[0]) {
                case "push_back":
                    pushBack(Integer.parseInt(cmd[1]));
                    break;
                case "pop_back":
                    popBack();
                    break;
                case "get":
                    get(Integer.parseInt(cmd[1]));
                    break;
                case "size":
                    size();
                    break;
            }
        }
        bw.flush(); // 모든 출력을 한 번에 flush
        bw.close(); // BufferedWriter 닫기
        br.close(); // BufferedReader 닫기
    }
    
    // push_back 연산을 수행하는 함수
    private static void pushBack(int n){
        arr.add(n);
    }
    
    // pop_back 연산을 수행하는 함수
    private static void popBack(){
        if (!arr.isEmpty()) {
            arr.remove(arr.size() - 1);
        }
    }
    
    // get 연산을 수행하는 함수 (출력 포함)
    private static void get(int n) throws IOException {
        // 인덱스는 0부터 시작하므로, 입력받은 n에서 1을 뺍니다.
        int idx = n - 1; 
        if (idx >= 0 && idx < arr.size()) {
            bw.write(arr.get(idx) + "\n");
        } else {
            bw.write("Error\n"); // 인덱스 범위를 벗어날 경우 Error 출력
        }
    }
    
    // size 연산을 수행하는 함수 (출력 포함)
    private static void size() throws IOException {
        bw.write(arr.size() + "\n");
    }
}
