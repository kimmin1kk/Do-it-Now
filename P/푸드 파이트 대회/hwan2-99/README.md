## :pushpin: **Algorithm**

- 푸드 파이트 대회

## :round_pushpin: **Logic**

```java
class Solution {
    public String solution(int[] food) {
        String answer = "0";

        for(int i = food.length - 1; i > 0; i--){
            for(int j = 0; j < food[i]/2; j++){
                answer = i + answer + i;
            }
        }
        return answer;
    }
}
```

- 주어진 숫자를 절반으로 나누어야 두 선수가 나누어 먹을 수 있다. 가운데는 항상 물이 있어야하기에 '0'을 더해줘야한다.

## :black_nib: **Review**

- 복잡할 줄 알았지만 너무나도 쉽게 접근한 문제