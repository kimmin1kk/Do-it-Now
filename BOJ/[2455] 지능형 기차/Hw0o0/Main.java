import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0,repo = 0;
        for(int cnt =0;cnt<4;cnt++){
            int output = sc.nextInt(); int input = sc.nextInt();
            total-=output;
            total+=input;
            if(repo < total){
                repo = total;
            }
        }
        System.out.println(repo);
    }
}