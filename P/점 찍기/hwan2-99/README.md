## :pushpin: **Algorithm**

- 점 찍기

## :round_pushpin: **Logic**

```java
class Solution {
    public long solution(int k, int d) {
        long answer = 0;

for (long i = 0; i <= d/k; i++) {
            long x = i * k;
            long y = (long) Math.sqrt((long) Math.pow(d, 2) - (long) Math.pow(x, 2)) / k;

            answer += y + 1;
}
        return answer;
}
}
```

- x가 원점과의 거리 d 를 안넘어야한다 즉 거리를 구하는 공식 d^2 >= x^2 + y ^2 를 만족해야한다
- x,y 를 기준으로 좌표를 증가 시키며 최대값을 만족하는 좌표를 구하고 k로 나누어주면 짝 좌표값 개수를 구한다
- (0,0) 은 무조건 들어가야한다 즉 위 공식을 만족하는 개수 + 1 을 해주어야 한다.

## :black_nib: **Review**

- 원점과의 거리 d 를 구한다는 생각을 좀 오래했다.
- 그냥 점 짝을 구한다는 생각으로 무지성으로 for문 2번을 돌리다보니 long의 최댓값에 접근할 수록 시간오류가 발생
- 결국 제곱근을 구하는 Math.sqrt 함수와 공식을 생각해내니 금방풀렸다.. 생각해내는 것이 결국 알고리즘의 핵심이긴 하지만...
