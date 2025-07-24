import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;
    public Student(String name, int kor, int eng, int math){
        this.name=name;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
    @Override
    public int compareTo(Student student){
        if(this.kor==student.kor) {
            if(this.eng==student.eng){
                return student.math- this.math;
            }
            return student.eng-this.eng;
        }
        return student.kor-this.kor;
    }
 
}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, kor, eng, math);
        }
        Arrays.sort(students);
        for(int i=0; i<n; i++){
            bw.write(students[i].name+" "+students[i].kor+" "+students[i].eng+" "+students[i].math);
            bw.newLine();
        }
        bw.flush();
    }
}