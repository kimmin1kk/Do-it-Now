import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] A = new int[cnt];
        int[] B = new int[cnt];
        int[] C = new int[cnt];
        int sum = 0;
        int idx = 0;
        for (int i = 0; i < cnt; i++) {
            A[i] = sc.nextInt();
        }
        for (int j = 0; j < cnt; j++) {
            B[j] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        for (int j = cnt - 1; j >= 0; j--) {
            C[idx] = B[j];
            idx++;
        }
        for (int k = 0; k < cnt; k++) {
            sum += (A[k] * C[k]);
        }
        System.out.println(sum);
    }
}

