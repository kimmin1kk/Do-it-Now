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
            return false;
        }

        for (i in 2 .. (num / 2)) {
            if (num % i == 0) {
                return false
            }
        }

        return true
    }
}