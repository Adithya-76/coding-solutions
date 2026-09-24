class Solution:
    def checkPermutation(self, a: list[int], b: list[int]) -> bool:
        # code here
        a = sorted(a)
        b = sorted(b)
        if len(a) != len(b):
            return False
        return a == b