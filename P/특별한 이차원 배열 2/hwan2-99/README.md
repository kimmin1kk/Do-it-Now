## :pushpin: **Algorithm**

- 특별한 이차원 배열 2

## :round_pushpin: **Logic**

```java
class Solution {
    public int solution(int[][] arr) {

        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr.length; j++){
                if(arr[i][j] != arr[j][i]){
                    return 0;
                }
            }
        }
        return 1;
    }
}
```

- 이차원 배열 인덱스를 뒤집어가면서 비교

## :black_nib: **Review**

- 이차원 배열을 조금 간단하게 접근할 수 있었던 문제
- 특히 인덱스 위치에 대하여 확실하게 접근