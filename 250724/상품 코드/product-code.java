import java.util.*;
import java.io.*;

class Product {
    String name;
    int code;
    public Product(String name, int code){
        this.name=name;
        this.code=code;
    }
    public Product(){
        this.name="codetree";
        this.code=50;
    }
};


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        int code = Integer.parseInt(st.nextToken());
        Product product = new Product();
        bw.write("product "+product.code+" is "+product.name);
        bw.newLine();
        product = new Product(name, code);
        bw.write("product "+product.code+" is "+product.name);
        bw.flush();
    }
}