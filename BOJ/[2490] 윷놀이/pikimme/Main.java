import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        for(int i = 0; i <= 2; i++) {
            String input = sc.nextLine();
            String[] scan = input.split(" ");
            for(int j = 0; j <= 3; j++) {
                arr[i][j] = Integer.parseInt(scan[j]);
            }
        }
        for(int[] n : arr) {
            int zero = 0;
            for(int m : n) {
                if (m == 0) {
                    zero = zero + 1;
                }
            }
            switch (zero) {
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
                case 0:
                    System.out.println("E");
                    break;
            }
        }
    }
}