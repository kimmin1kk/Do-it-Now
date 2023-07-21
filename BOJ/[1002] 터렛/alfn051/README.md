# [1002] 터렛

## :pushpin: **Algorithm**

- 수학
- 기하학
- 많은 조건 분기

## :round_pushpin: **Logic**

 ```java
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
 ```

- 사람1과 사람2의 좌표와 목표물까지의 거리를 반지름으로 하여 각각 원을 그리고, 두 원이 교차하는 점의 개수를 구하면 목표물이 있을 수 있는 좌표의 수를 구할 수 있다.
- 두 원이 완전히 같을 때 => 무수히 많은 점에서 만난다 => -1
- 두 원이 내접, 외접 할 때 => 한 점에서 만난다 => 1
- 두 원이 교차할 때 => 두 점에서 만난다 => 2
- 두 원이 만나지 않는다 => 0

## :black_nib: **Review**

- 처음에는 두 원이 교차하는 점을 구하는 방정식을 세워 풀어보려 해서 조금 어려울 것 같았지만, 두 원의 반지름 길이의 합이나 차를 구하고 이를 중심사이의 거리와 비교하면 두 원이 어떻게 만나게 되는지 구할 수 있다는 것을 떠올려 더 쉬운 방법으로 풀 수 있었다.
 ---