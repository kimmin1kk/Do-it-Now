import java.util.Scanner;

public class IntelligentTrain2460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0,repo = 0;
        for(int cnt =0;cnt<10;cnt++){
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
