import java.util.*;
import java.io.*;

class Student {
    String codeName;
    int score;
    public Student(String codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }

};

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Student[] students = new Student[5];
        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String code = st.nextToken();
            int number = Integer.parseInt(st.nextToken());
            students[i] = new Student(code, number);
        }
        int min = 0;
        for(int i=1; i<5; i++){
            if(students[min].score > students[i].score) min = i;
        }
        bw.write(students[min].codeName+" "+students[min].score);
        bw.flush();

    }
}