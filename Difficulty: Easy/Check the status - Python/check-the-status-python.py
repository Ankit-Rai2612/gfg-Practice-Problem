class Solution:
    def checkStatus(self, a, b, flag):
        # code here
        return ((a >= 0) ^ (b >= 0)) and not flag or (a < 0 and b < 0 and flag)