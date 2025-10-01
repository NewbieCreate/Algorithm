import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        //입출력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        
        double sum = a / b;
        bw.write(String.format("%.9f", sum));
        bw.flush();
    }
}