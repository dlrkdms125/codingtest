import java.io.*;
import java.util.*;

public class Main {

    static int[][] danji;
    static boolean[][] vi;
    static int[] dx = {0, 0, -1, 1}; // 상하좌우 이동 x축 변화
    static int[] dy = {-1, 1, 0, 0}; // 상하좌우 이동 y축 변화
    static List<Integer> result; // 각 단지의 집 개수를 저장할 리스트
    static int cnt, N; // cnt: 현재 단지의 집 개수, N: 지도 크기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력용 StringBuilder
        result = new ArrayList<>(); // 결과 저장 리스트 초기화
        N = Integer.parseInt(br.readLine()); // 지도 크기 입력
        danji = new int[N][N]; // 지도 배열 초기화
        vi = new boolean[N][N]; // 방문 여부 배열 초기화

        // 지도 데이터 입력 처리
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                danji[i][j] = str.charAt(j) - '0'; // 문자형 데이터를 숫자로 변환하여 저장
            }
        }

        // 모든 좌표를 순회하며 DFS 수행
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (danji[x][y] == 1 && !vi[x][y]) { // 집이 있고 방문하지 않았다면
                    cnt = 0; // 현재 단지의 집 개수 초기화
                    dfs(x, y); // DFS 탐색 시작
                    result.add(cnt); // 탐색 완료 후 단지의 집 개수 저장
                }
            }
        }

        Collections.sort(result); // 단지별 집 개수를 오름차순으로 정렬

        sb.append(result.size()).append("\n"); // 첫 번째 줄: 총 단지 수 추가
        for (int num : result) {
            sb.append(num).append("\n"); // 각 단지의 집 개수를 추가 (한 줄씩)
        }

        System.out.print(sb.toString()); // 최종 출력
    }

    public static void dfs(int x, int y) {
        vi[x][y] = true; // 현재 위치 방문 처리
        cnt++; // 현재 단지에 속한 집 개수 증가

        for (int i = 0; i < 4; i++) { // 상하좌우로 이동하며 탐색
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !vi[nx][ny] && danji[nx][ny] == 1) {
                dfs(nx, ny); // 연결된 집 발견 시 재귀적으로 탐색 진행
            }
        }
    }
}