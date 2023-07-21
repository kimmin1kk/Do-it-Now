import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        int[] result = new int[count];

        for(int i = 0; i<count; i++){
            String[] strArr = sc.nextLine().split(" ");
            int[] arr = new int[strArr.length];
            for(int j = 0; j< strArr.length; j++){
                arr[j] = Integer.parseInt(strArr[j]);
            }
            int distanceSquare = (arr[3]-arr[0])*(arr[3]-arr[0])+(arr[4]-arr[1])*(arr[4]-arr[1]);
            int radiusSumSquare = (arr[2]+arr[5])*(arr[2]+arr[5]);
            int radiusSubSquare = (arr[2]-arr[5])*(arr[2]-arr[5]);
            if(arr[0]==arr[3] && arr[1]==arr[4] && arr[2]==arr[5]){
                result[i] = -1;
            } else if (distanceSquare > radiusSumSquare || distanceSquare < radiusSubSquare) {
                result[i] = 0;
            } else if (distanceSquare == radiusSumSquare || distanceSquare == radiusSubSquare){
                result[i] = 1;
            } else if (distanceSquare > radiusSubSquare && distanceSquare < radiusSumSquare) {
                result[i] = 2;
            }
        }
        for(int i = 0; i<count; i++){
            System.out.println(result[i]);
        }

    }
}