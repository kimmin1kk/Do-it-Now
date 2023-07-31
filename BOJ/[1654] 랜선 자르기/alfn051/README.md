# [1654] 랜선 자르기
 
 ## :pushpin: **Algorithm**
 
- 이분 탐색(이진 탐색)
- 매개 변수 탐색
 
 ## :round_pushpin: **Logic**
 
 ```java
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
        while (start<=end){ //최소값과 최대값이 일치할 때까지 반복 => 찾는 값
            long mid = (start+end)/2;   //현재 최소값과 최대값의 중간값
            if(check(mid)){ //개수가 더 많으면 최소값을 현재 중간값으로 변경
                result = mid;
                start = mid+1;
            }else { //개수가 더 적으면 최대값을 현재 중간값으로 변경
                end = mid -1;
            }
        }
        System.out.println(result);
    }

    public static boolean check(long length){
        int count = 0;
        //length만큼의 길이를 가지도록 랜선을 잘라서 나온 랜선의 개수를 구한다
        for(int cable:cables){
            count += cable/length;
        }
        return count >= num; //만들어야할 개수와 비교
    }
}
 ```
 
 - 자른 랜선의 길이의 최소값과 최대값을 이용하여 중간값을 구한다
 - 중간값만큼의 길이 나오도록 모든 랜선을 잘랐을 때 나오는 개수를 만들어야 하는 개수와 비교한다.
 - 비교한 결과에 따라 최소값이나 최대값을 현재의 중간값으로 바꾼 뒤 다시 중간값을 구하여(=이진탐색) 정답을 찾을때 까지 반복한다.
 
 ## :black_nib: **Review**
 
 - 처음에 문제를 보고 직관적으로 구하는 방법은 알겠는데 막상 코드로 하려니깐 처음부터 끝까지의 모든 경우의 수를 다 대입해보는것 말고는 방법을 찾을수가 없어보였는데 **이진탐색**과 **매개변수탐색**의 개념을 이해하고 나니깐 재밌게 풀 수 있었다.
 ---