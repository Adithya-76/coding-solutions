class Solution:
    def minComputation(self, files):
        # code here
        from heapq import heappop, heapreplace, heapify
        heapify(files)
        cost = 0
        while len(files) > 1:
            f = heappop(files) + files[0]
            cost += f
            heapreplace(files ,f)
        return cost