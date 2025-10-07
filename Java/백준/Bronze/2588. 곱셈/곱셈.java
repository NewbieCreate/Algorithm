import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int n1 = num2 % 10;
        int n2 = (num2 / 10) % 10;
        int n3 = (num2 / 100) % 10;

        bw.write(String.valueOf(num1 * n1));
        bw.newLine();
        bw.write(String.valueOf(num1 * n2));
        bw.newLine();
        bw.write(String.valueOf(num1 * n3));
        bw.newLine();
        bw.write(String.valueOf(num1 * num2));
        bw.newLine();

        bw.flush();
    }
}