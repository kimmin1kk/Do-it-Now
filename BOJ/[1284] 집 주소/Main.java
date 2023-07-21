import java.util.*;

public class Main {
    public static int calculate(int num) {
        if (num == 1) {
            num = 2;
            return num;
        } else if (num == 0) {
            num = 4;
            return num;
        }
        num = 3;
        return num;
    }
    public static int classification(int input){
        int x;
        if (input / 1000 != 0) {
            x=1;
            return x;
        } else if (input / 100 != 0) {
            x=2;
            return x;
        }else if (input / 10 != 0) {
            x=3;
            return x;
        }else if (input / 1 != 0) {
            x=4;
            return x;
        }else if (input == 0){
            x=5;
            return x;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int input = sc.nextInt();
            int a = input / 1000;  //1000의 자리
            int b = input % 1000 / 100;//100의 자리
            int c = input % 1000 % 100 / 10;       //10의 자리
            int d = input % 1000 % 100 % 10;       //1의자리
            int total;

            switch (classification(input)){
                case 1:
                    total = calculate(a) + calculate(b) + calculate(c) + calculate(d)+5;
                    System.out.println(total);
                    break;
                case 2:
                    total = calculate(b) + calculate(c) + calculate(d)+4;
                    System.out.println(total);
                    break;
                case 3:
                    total = calculate(c) + calculate(d)+3;
                    System.out.println(total);
                    break;
                case 4:
                    total = calculate(d)+2;
                    System.out.println(total);
                    break;
                case 5:
                    return;
            }
        }
    }
}