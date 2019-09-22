#
# @lc app=leetcode id=922 lang=python3
#
# [922] Sort Array By Parity II
#
# https://leetcode.com/problems/sort-array-by-parity-ii/description/
#
# algorithms
# Easy (67.16%)
# Likes:    353
# Dislikes: 35
# Total Accepted:    58.2K
# Total Submissions: 86.6K
# Testcase Example:  '[4,2,5,7]'
#
# Given an array A of non-negative integers, half of the integers in A are odd,
# and half of the integers are even.
# 
# Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is
# even, i is even.
# 
# You may return any answer array that satisfies this condition.
# 
# 
# 
# Example 1:
# 
# 
# Input: [4,2,5,7]
# Output: [4,5,2,7]
# Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been
# accepted.
# 
# 
# 
# 
# Note:
# 
# 
# 2 <= A.length <= 20000
# A.length % 2 == 0
# 0 <= A[i] <= 1000
# 
# 
# 
# 
# 
#
class Solution:
    def sortArrayByParityII(self, A):
        # First attempt: brute-force
        output = [0] * len(A)
        for i in range(0, len(A)):
            if i % 2 == 0:
                for item in A:
                    if item % 2 == 0:
                        output[i] = item
                        A.remove(item)
                    else:
                        continue
            elif i % 2 != 0:
                for item in A:
                    if item % 2 != 0:
                        output[i] = item
                        A.remove(item)
                    else:
                        continue
            else:
                continue
        return output

if __name__ == '__main__':
    a = Solution
    print(a.sortArrayByParityII(a, [4,1,2,1]))

