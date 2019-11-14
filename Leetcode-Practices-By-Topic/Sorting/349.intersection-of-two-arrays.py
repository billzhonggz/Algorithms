#
# @lc app=leetcode id=349 lang=python3
#
# [349] Intersection of Two Arrays
#
# https://leetcode.com/problems/intersection-of-two-arrays/description/
#
# algorithms
# Easy (56.46%)
# Likes:    464
# Dislikes: 874
# Total Accepted:    248.1K
# Total Submissions: 439.4K
# Testcase Example:  '[1,2,2,1]\n[2,2]'
#
# Given two arrays, write a function to compute their intersection.
# 
# Example 1:
# 
# 
# Input: nums1 = [1,2,2,1], nums2 = [2,2]
# Output: [2]
# 
# 
# 
# Example 2:
# 
# 
# Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
# Output: [9,4]
# 
# 
# Note:
# 
# 
# Each element in the result must be unique.
# The result can be in any order.
# 
# 
# 
# 
#
class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        """
        # First attempt: brute-force method.
        dictionary = {}
        for item1 in nums1:
            for item2 in nums2:
                if item1 == item2:
                    if item2 not in dictionary.keys():
                        dictionary[item2] = 1
                    else:
                        continue
                else:
                    continue
        return list(dictionary.keys())
        """
        # Second attempt: 

