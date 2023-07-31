## :pushpin: **Algorithm**

- 최댓값과 최솟값

## :round_pushpin: **Logic**

```java
import java.util.*;
class Solution {
    public String solution(String s) {
        String[] numStr = s.split(" ");
        int[] nums = new int[numStr.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(numStr[i]);
        }

        Arrays.sort(nums);

        return nums[0] + " " + nums[nums.length-1];
    }
}
```

- 우선 문자열 배열에서 각각 하나씩 잘라서 저장하고 반복문으로 제일 큰 값과 제일 작은 값 저장
- 그 후 정수형으로 바꾸어서 Arrays에 있는 sort 사용

## :black_nib: **Review**

- 간단한 문제였음