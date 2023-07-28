## :pushpin: **Algorithm**

- 멀쩡한 사각형

## :round_pushpin: **Logic**

```java
class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        long x = (long)w;
        long y = (long)h;

        for(int i=1;i<w;i++){
            answer += y*i/x ;
        }

        return answer*2;
    }
}
```

- 사각형 개수를 구하는 공식을 구한다
- 우선 y = ax 
- x좌표는 1부터 w까지 이고 여기서부터 x좌표별 사각형 개수를 구해야한다
- 최종 공식은 멀쩡한 사각형의 개수를 구하고 대칭으므로 2배를 해준다

## :black_nib: **Review**

- 간단할 줄 알았지만 대칭이란 점을 뺏고 최대공약수 개념을 쓰려다 포기했음
- 다른 분들 풀이를 보니 수학 공식을 대입하면 더욱 쉽게 풀수 있을 것 같은 문제.. 

