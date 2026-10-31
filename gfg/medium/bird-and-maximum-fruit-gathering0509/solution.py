class Solution:
    def maxPackages(self, arr: list[int], totalTime: int) -> int:
        # code here
        n = len(arr)
        if totalTime >=n:
            return sum(arr)
        current_sum = sum(arr[:totalTime])
        max_packages = current_sum
        for i in range(totalTime ,n):
            current_sum += arr[i] - arr[i-totalTime]
            if current_sum > max_packages:
                max_packages = current_sum
        return max_packages