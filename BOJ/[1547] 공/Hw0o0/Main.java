import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0,goal=1;
        int cnt= Integer.parseInt(String.valueOf(sc.nextInt()));
        while(i<cnt) {
            int x = sc.nextInt(); int y = sc.nextInt();
            if(x==goal){
                goal = y;
            }
            else if(y==goal){
                goal = x;
            }
            i++;
        }
        System.out.println(goal);
    }
}