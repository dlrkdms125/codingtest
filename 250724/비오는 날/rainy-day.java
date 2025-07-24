import java.util.*;
import java.io.*;

class Data {
    String date;
    String weekday;
    String weather;

    public Data(String date, String weekday, String weather){
        this.date=date;
        this.weekday=weekday;
        this.weather=weather;
    }   
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Data> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String data = st.nextToken();
            String weekday = st.nextToken();
            String weather = st.nextToken();
            list.add(new Data(data, weekday, weather));
        }
        String answerDate = "";
        String answerWeekDay = "";
        String answerWeather = "";
        boolean found = false;

        for(Data d:list){
            if(d.weather.equals("Rain")) {
                if(!found || d.date.compareTo(answerDate)<0) {
                    answerDate = d.date;
                    answerWeekDay = d.weekday;
                    answerWeather = d.weather;
                    found = true;
                }
            }
        }
        if(found) bw.write(answerDate+" "+answerWeekDay+" "+answerWeather);
        bw.flush();

    }
}