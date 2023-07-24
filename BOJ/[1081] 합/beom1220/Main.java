import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long l = sc.nextInt();
        long u = sc.nextInt();

        // u까지의 전체 자릿수 합을 구함.
        long wholeResult = getResult(u);
        // l까지의 자릿수 합을 구함.
        long subResult = getResult(l-1);

        // u까지의합 - l까지의합
        long result = wholeResult - subResult;

        System.out.println(result);

    }

    private static long getResult(long num) {
        long unit, remainder, remSum;
        long result = 0;

        for (long i = 0; Math.pow(10, i) <= num; i++) {
            // 0-9가 완성된 조합의 합
            unit = num / (long) Math.pow(10, i+1);
            result += unit * 45 * (long) Math.pow(10, i);

            // 완성되지 않은 조합의 합
            remainder = num % (long) Math.pow(10, i+1);
            remainder /= (long) Math.pow(10, i);

            remSum = 0;
            if (i == 0) {
                for (int j = 1; j <= remainder; j++) {
                    remSum += j;
                }
            } else {
                for (int j = 1; j < remainder; j++) {
                    remSum += j;
                }
                remSum *= (long) Math.pow(10, i);
                remSum += ((num % (long) Math.pow(10, i)) + 1) * remainder;
            }
            result += remSum;
        }

        return result;
    }
}