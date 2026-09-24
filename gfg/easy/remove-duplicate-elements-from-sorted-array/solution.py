class Solution:
    def removeDuplicates(self, arr):
        # code here 
        arr = set(arr)
        arr = list(arr)
        return sorted(arr)