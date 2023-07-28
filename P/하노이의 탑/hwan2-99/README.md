## :pushpin: **Algorithm**

- 하노이의 탑

## :round_pushpin: **Logic**

```java
import java.util.*;
class Solution {
    private List<int[]>arr = new ArrayList<>();

    public List<int[]> solution(int n) {
        hanoi(1,2,3,n);

        return arr;
    }

    public void hanoi(int first, int second, int third,int n){
        int[] move = {first,third};

        if(n == 1){
            arr.add(move);
            return;
        }else{
            hanoi(first,third,second,n-1);
            arr.add(move);
            hanoi(second,first,third,n-1);
        }
    }
}
```

- 자신보다 크기가 큰 원반은 자기 위에 올수 없다.
- 즉, 가운데 완성을 하기 위해선 원반의 개수 즉(n-1)의 횟수만큼 이동이 일어난 후에 한번더 이동해야한다.
- 첫번째 칸에서 세번째로 제일 큰원반을 제외하고 옮겨주고 가운데에 제일 큰원반을 옮겨주고 모든 원반을 다시 옮겨준다.

## :black_nib: **Review**

- 개인적인 생각으로는 재귀의 대표적인 예제라고 생각한다.
- (n-1)의 경우를 생각하는데에는 조금 걸렸지만 그래도 생각을 복잡하게 하지않고 접근하면 금방 해결할 수 있었던 문제