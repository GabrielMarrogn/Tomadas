import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String[] arr = a.split(" ");

        int um = Integer.parseInt(arr[0]);
        int dois = Integer.parseInt(arr[1]);
        int tres = Integer.parseInt(arr[2]);
        int quatro = Integer.parseInt(arr[3]);

        int soma = (um + dois + tres + quatro) - 3;

        System.out.println(soma);
    }
}
