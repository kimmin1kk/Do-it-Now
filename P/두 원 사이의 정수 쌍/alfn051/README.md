 # [181187] 두 원 사이의 정수 쌍
 
 ## :pushpin: **Algorithm**
 
 - 수학
 
 ## :round_pushpin: **Logic**
 
 ```java
import java.lang.Math;
class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;

        answer = answer + r2 - r1 + 1;

        for(int i=1; i<r2; i++){
            answer = answer + (long)Math.floor(Math.sqrt(Math.pow(r2, 2)-Math.pow(i, 2)));
        }
        for(int i=1; i<r1; i++){
            double y2 = Math.sqrt(Math.pow(r1, 2)-Math.pow(i, 2));
            if(y2%1.0==0.0)answer++;
            answer = answer - (long)Math.floor(y2);
        }

        answer=answer*4;

        return answer;
    }
}

 ```
 
 - 원의방정식(피타고라스 정리)를 이용하여 y^2 = r^2 - x^2 식에 반지름값과 인덱스를 대입하여 y값을 구한다 => 원 안의 각 x좌표마다 y가 정수인 점의 개수
 - 밖의 원의 y값에서 안의 원의 y값의 차를 구하여 두 원 사이의 정수쌍 좌표를 구한다. 이때 안의 원 위에 있는 점도 포함해야 함으로 점이 원 위에 있다면 차를 구할 때 빼지 않아야 한다.
 
 ## :black_nib: **Review**
 
 - 처음에는 Math 클래스의 메서드를 사용하지 않고 for문만을 이용해 풀려고 했는데, 로직은 맞지만 이중 for문을 사용하였기에 시간초과가 났다. 이것을 해결하려고 여러 시도를 해보았지만 잘 되지 않아 어려웠고, Math 클래스를 기억해내어서 사용하니깐 풀 수 있었다.
 ---