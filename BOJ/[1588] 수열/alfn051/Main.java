import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static int n;
    static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        int left = Integer.parseInt(br.readLine());
        int right = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        divide(first, 0);
        int count1=0, count2=0, count3=0;
        for(int i = left; i<=right; i++){
            switch (list.get(i)){
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
            }
        }
        System.out.println(count1 + " " + count2 + " " + count3);
    }

    public static void divide(int num, int count){
        count++;
        if(count <= n){
            switch (num) {
                case 1 :
                    divide(1, count);
                    divide(3, count);
                    divide(2, count);
                    break;
                case 2 :
                    divide(2, count);
                    divide(1, count);
                    divide(1, count);
                    break;
                case 3 :
                    divide(2, count);
                    divide(3, count);
                    divide(2, count);
                    break;
            }
        }else {
            list.add(num);
        }
    }
}