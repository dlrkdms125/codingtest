import java.util.*;
import java.io.*;

public class Main {
    static class Move {
        char dir;
        int t;
        Move(char dir, int t){
            this.dir = dir;
            this.t = t;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 이동 계획 입력
        List<Move> amoves = new ArrayList<>();
        List<Move> bmoves = new ArrayList<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            char ch = st.nextToken().charAt(0);
            int number = Integer.parseInt(st.nextToken());
            amoves.add(new Move(ch, number));
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            char ch = st.nextToken().charAt(0);
            int number = Integer.parseInt(st.nextToken());
            bmoves.add(new Move(ch, number));
        }
        // 최대 이동 시간 계산
        int asec = 0, bsec = 0;
        for(Move mv: amoves) asec += mv.t;
        for(Move mv: bmoves) bsec += mv.t;
        int maxSec = Math.max(asec, bsec);
        // 각 사람의 매초 위치 기록
        int[] aposarr = new int[maxSec];
        int[] bposarr = new int[maxSec];

        // a 위치 기록
        int apos = 0, aidx = 0;
        for(Move mv : amoves){
            int ch = (mv.dir=='L') ?  -1: 1;
            for(int i=0; i<mv.t; i++){
                apos += ch;
                aposarr[aidx++] = apos;
            }
        }
        int bpos = 0, bidx = 0;
        for(Move mv: bmoves){
            int ch = (mv.dir=='L') ? -1: 1;
            for(int i=0; i<mv.t; i++){
                bpos += ch;
                bposarr[bidx++] = bpos;
            }
        }
        // 만나는 최초 시점 찾기
        int minLen = Math.min(asec, bsec);
        int meetTime = -1;
        for(int t=0; t<minLen; t++){
            if(aposarr[t]==bposarr[t]) {
                meetTime = t+1;
                break;
            }
        }

        bw.write(String.valueOf(meetTime));
        bw.flush();

    }
}