import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        if(isTrue(y,m,d).equals("true")) {
            bw.write(weather(y,m,d));
        } else {
            bw.write("-1");
        }
        
        bw.flush();

    }
    private static String isTrue(int y, int m,int d){
        String answer = "false";
        if(isyun(y).equals("true")) {
            if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
                if(d>=1 && d<=31) answer = "true";
            }
            if(m==4 || m==6 || m==9 || m==11) {
                if(d>=1 && d<=30) answer =  "true";
            }
            if(m==2) {
                if(d>=1 && d<=29) answer =  "true";
            }
        } else {
            if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
                if(d>=1 && d<=31) answer = "true";
            }
            if(m==2 || m==4 || m==6 || m==9 || m==11) {
                if(d>=1 && d<=30) answer = "true";
            }
        }
        return answer;
        
    }
    private static String isyun(int y){
        String answer = "false";
        if(y%4==0) answer = "true";
        else if(y%4==0 && y%100==0) answer = "false";
        else if(y%4==0 && y%100==0 && y%400==0) answer = "true";
        else answer = "false";
        return answer;
    }
    private static String weather(int y, int m, int d){
        if(m>=3 && m<=5) return "Spring";
        else if(m>=6 && m<=8) return "Summer";
        else if(m>=9 && m<=11) return "Fall";
        else return "Winter";
    }
}