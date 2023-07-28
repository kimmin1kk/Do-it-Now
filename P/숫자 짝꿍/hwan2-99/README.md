## :pushpin: **Algorithm**

- 숫자 짝꿍

## :round_pushpin: **Logic**

```java
class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = new int[10];
        int[] y = new int[10];

        for(int i=0; i<X.length(); i++) {
            x[X.charAt(i) - '0']++;
        }
        for(int i=0; i<Y.length(); i++) {
            y[Y.charAt(i) - '0']++;
        }

        for(int i=9; i>=0; i--) {
            for(int j=0; j<Math.min(x[i], y[i]); j++) {
                answer.append(i);
            }
        }

        if(answer.length() == 0) return "-1";

        if(answer.charAt(0) == '0') return "0";

        return answer.toString();
    }
}
```

- 배열에 담긴 문자열들을 더할 때 생기는 문제를 해결하기 위한 문제 반복문을 각각 지정해주는 X,Y 로 초기화해주는 문자열들을 배열에 문자로 잘라서 담아주고
- X,Y배열에 담긴 중복되는 짝들을 찾아 문자열을 붙여준다
- 여기서 중요한점은 문자열을 더하기가 아니라 StringBuilder를 써줘야 오류가 안생긴다

## :black_nib: **Review**

- StringBuilder를 사용하지 않고 문자열 더하기로 하다가 계속 오류나서 찾던 중  StringBuilder를 처음 접해서 많이 당황한 문제였다. 
- Map을 사용했더라면 더욱 쉽게 작성할 수 있었을 것 같은 문제이지만 아직 Collection에 접근을 많이 해보지 않아 추후에 Collection을 사용하여 다시 한번더 풀어볼만한 문제
