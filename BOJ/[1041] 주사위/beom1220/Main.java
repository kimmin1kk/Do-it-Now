import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static long result, one, doub, trip;
    static List<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
        n = sc.nextInt();
        for (int i = 0; i < 6; i++) {
            nums.add(sc.nextInt());
        }

        getResult();
    }

    private static void getResult() {
        //주사위가 하나일 때는 가장 높은 면 제외한 5개 면의 합.
        if (n == 1) {
            for (int num : nums) {
                result += num;
            }
            result -= getMax(nums);
            System.out.println(result);
        } else { // 외에는 규칙에 따름.
            one = getMin(nums);
            doub = getDoubleMin();
            trip = getTripleMin();
            result = ((4 * trip) + ((8*n-12) * doub) + ((((long) Math.pow(n, 2)) * 5 - 16*n + 12) * one));
            System.out.println(result);
        }
    }

    public static int getMax(List<Integer> list) {
        int max = list.get(0);
        for (int num : list) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    public static int getMin(List<Integer> list) {
        int min = list.get(0);
        for (int num: list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 접하는 2개의 면의 합 중 최솟값 구하기
    public static int getDoubleMin() {
        int sum;
        List<Integer> list = new ArrayList<>();
        sum = nums.get(0) + nums.get(1);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i != j) && (i + j != 5)) {
                    sum = nums.get(i) + nums.get(j);
                    list.add(sum);
                }
            }
        }
        return getMin(list);
    }

    // 접하는 3개의 면의 합 중 최솟값 구하기
    public static int getTripleMin() {
        int sum;
        List<Integer> list = new ArrayList<>();
        sum = nums.get(0) + nums.get(1) + nums.get(2);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if ((i != j) && (j != k) && (i != k) && (i + j != 5) && (j + k != 5) && (i + k != 5)) {
                        sum = nums.get(i) + nums.get(j) + nums.get(k);
                        list.add(sum);
                    }
                }
            }
        }
        return getMin(list);
    }
}