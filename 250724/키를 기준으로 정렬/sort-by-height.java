import java.util.*;
import java.io.*;

class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    @Override
    public int compareTo(Person person){
        return this.height-person.height;
    }
        
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n = Integer.parseInt(br.readLine());
        Person[] person = new Person[n]; 

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            person[i] = new Person(name, height, weight);
        }
        Arrays.sort(person);
        for(int i=0; i<n; i++){
            bw.write(person[i].name+" "+person[i].height+" "+person[i].weight);
            bw.newLine();
        }
        bw.flush();

    }
}