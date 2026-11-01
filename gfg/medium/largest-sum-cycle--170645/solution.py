class Solution:
    def largestSumCycle(self, edge):
        # code here
        v = [-1] * len(edge)
        def visit(i:int, s:int) -> int:
            if edge[i] <0:
                return -1
            if v[i] >= 0:
                return s+i -v[i]
            v[i] = s+i
            result = visit(edge[i],s+i)
            edge[i] = -1
            return result
        return max(visit(i,0) for i in range(len(edge)))