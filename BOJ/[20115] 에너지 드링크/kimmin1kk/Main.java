import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        double[] arr = new double[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        double sum = arr[num-1];

        for (int i = 0; i < num - 1; i++) {
            sum += arr[i] / 2;
        }

        System.out.println(sum);
    }
}