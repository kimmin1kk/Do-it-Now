# 소수 만들기

## :pushpin: **Algorithm**

+ 수학
+ 완전 탐색

## :round_pushpin: **Logic**

 ```kotlin
class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0

        for (i in 0 .. nums.size - 3) {
            for (j in (i + 1) .. nums.size - 2) {
                for (k in (j + 1) until nums.size) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++
                    }
                }
            }
        }

        return answer
    }

    fun isPrime(num: Int): Boolean {
        if (num == 1) {
            return false
        }

        for (i in 2 .. (num / 2)) {
            if (num % i == 0) {
                return false
            }
        }

        return true
    }
} 
```

- for 문을 돌며 배열의 서로다른 3 요소의 합을 구한다.
- 그 합이 소수인지 판단하여 소수일 경우 `answer`에 1을 더한다


## :black_nib: **Review**

- 모든 케이스를 시도해본다는게 좀 비효율적인 것 같다.
- (3중 for 문) + (소수 구할 때 사용하는 for 문)으로 인해 시간도 오래 걸린것 같다.
