import java.util.Scanner;

public class Main {
    static int[] cables;
    static int num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cables = new int[sc.nextInt()];
        num = sc.nextInt();
        for(int i = 0; i< cables.length; i++){
            cables[i] = sc.nextInt();
        }
        long start = 0;
        long end = (long)(Math.pow(2, 31)-1);
        long result=0;
        while (start<=end){
            long mid = (start+end)/2;
            if(check(mid)){
                result = mid;
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        System.out.println(result);
    }

    public static boolean check(long length){
        int count = 0;
        for(int cable:cables){
            count += cable/length;
        }
        return count >= num;
    }
}