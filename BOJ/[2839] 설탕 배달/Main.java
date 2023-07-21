import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bag = sc.nextInt();
        int totalBag;
        int bigRest = bag%5;
        int bigShare = bag/5;
        int smallShare = bag%3;
        int smallRest = bag/3;

        if (bigRest == 0){
            System.out.println(bigShare);
            return;
        }
        else if(bigRest !=0 ||smallShare!=0) {
            for (int x = bigShare; 0 <= x; x--) {
                int y = bag - (x * 5);
                if (y % 3 == 0) {
                    totalBag = x + y / 3;
                    System.out.println(totalBag);
                    return;
                }
            }
        }
        else if(smallShare == 0){
            System.out.println(smallRest);
            return;
        }
        System.out.println(-1);
    }
}