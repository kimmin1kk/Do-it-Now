# [1992] 쿼드트리
 
 ## :pushpin: **Algorithm**
 
- 분할정복
- 재귀
 
 ## :round_pushpin: **Logic**
 
 ```java
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        //입력 및 배열 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[][] arr = new int[size][size];
        for(int i=0;i<size;i++){
            String str = br.readLine();
            for(int j=0;j<size;j++){
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }
        //압축 및 결과 출력
        StringBuilder sb = new StringBuilder();
        compress(arr, sb);
        System.out.println(sb);
    }

    public static void compress(int[][] arr, StringBuilder sb){
        int num = 2;    //압축 여부 및 압축된 값 저장 (2 => 초기값, -1 => 압축불가)
        for(int i=0;i<arr.length;i++){  //압축 여부 검사
            for (int j=0;j<arr.length;j++){
                if(num==2){num = arr[i][j];}    //num 변수에 첫번재 인덱스의 값 저장
                if(num!=arr[i][j]){num=-1;}     //num 값과 다르면 압축불가, num 에 -1 저장
            }
        }
        if(num==-1){    //압축불가일때 재귀를 통해 나뉜 사분면 마다 다시 압축 여부 검사
            sb.append("(");
            compress(divide(arr, 1), sb);
            compress(divide(arr, 2), sb);
            compress(divide(arr, 3), sb);
            compress(divide(arr, 4), sb);
            sb.append(")");
        }else {
            sb.append(num);
        }
    }

    //2차원 배열을 받아서 선택한 사분면의 2차원 배열을 리턴해주는 메서드
    public static int[][] divide(int[][] arr, int quadrant){    //quadrant 로 1,2,3,4 분면 중 하나 선택
        int length = arr.length/2;
        int[][] newArr = new int[length][length];   // 1/4 크기의 새로운 2차원 배열 생성
        int x=0, y=0;
        switch (quadrant){  //선택한 사분면의 인덱스 범위만큼의 배수 설정
            case 1:
                x=1;
                y=1;
                break;
            case 2:
                x=1;
                y=2;
                break;
            case 3:
                x=2;
                y=1;
                break;
            case 4:
                x=2;
                y=2;
                break;
        }
        for (int i = 0; i<length; i++){ //새로 생성한 배열에 값 저장
            for (int j = 0; j<length; j++){
                newArr[i][j] = arr[i+length*(x-1)][j+length*(y-1)];
            }
        }
        return newArr;
    }
}
 ```
 
 - 입력받은 값을 이차원 배열에 저장한 후 compress() 매서드를 통해 StringBuilder에 문자열 생성 후 압축 결과값 출력
 - compress() 메서드: 배열의 첫번째 인덱스의 값을 저장해 놓은 후 for 문을 통해 배열을 돌면서 다른값이 있는지 검사, 다른 값이 없으면 압축가능 상태이며 저장해 놓은 값을 StringBuilder에 추가한다. 다른 값이 있으면 압축 불가능 상태이며 배열을 divide() 메서드를 통해 4개의 하위 2차원 배열로 분할 한 뒤 각 사분면 마다 compress() 메서드를 재귀호출한 뒤 ()로 묶어서 결과값 완성
 - divide() 메서드: 매개변수로 원본 배열과 리턴할 배열이 속한 사분면을 받는다. 원본의 1/4 크기의 새로운 2차원 배열을 생성한 후 선택한 사분면의 인덱스 범위만큼의 값을 저장한 후 새로운 배열을 리턴한다.
 
 ## :black_nib: **Review**
 
 - 오랜만에 재귀함수를 써보아서 재밌었던것 같다. 처음엔 값들을 2차원 배열이 아닌 1차원 배열에 넣고, 각 행마다의 인덱스 번호 규칙을 구한 뒤 for문 하나로 저장 및 탐색을 하려 했지만 규칙을 계산하는 과정이 어려워서 그냥 2차원 배열에 넣고 문제를 풀었다. 문제를 다 해결한 뒤 다른사람들이 푼 코드를 봤는데 다들 비슷한듯 다른 로직들이여서 신기했다.
 ---