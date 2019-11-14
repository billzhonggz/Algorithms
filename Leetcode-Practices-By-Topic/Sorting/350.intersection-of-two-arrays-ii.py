#
# @lc app=leetcode id=350 lang=python3
#
# [350] Intersection of Two Arrays II
#
# https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
#
# algorithms
# Easy (49.06%)
# Likes:    825
# Dislikes: 292
# Total Accepted:    238.2K
# Total Submissions: 485.6K
# Testcase Example:  '[1,2,2,1]\n[2,2]'
#
# Given two arrays, write a function to compute their intersection.
# 
# Example 1:
# 
# 
# Input: nums1 = [1,2,2,1], nums2 = [2,2]
# Output: [2,2]
# 
# 
# 
# Example 2:
# 
# 
# Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
# Output: [4,9]
# 
# 
# Note:
# 
# 
# Each element in the result should appear as many times as it shows in both
# arrays.
# The result can be in any order.
# 
# 
# Follow up:
# 
# 
# What if the given array is already sorted? How would you optimize your
# algorithm?
# What if nums1's size is small compared to nums2's size? Which algorithm is
# better?
# What if elements of nums2 are stored on disk, and the memory is limited such
# that you cannot load all elements into the memory at once?
# 
# 
#
class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        # First attempt: brute-force (doesn't work, has duplicates)
        # Second attempt: count items before compare
        import collections
        # Counter function generates a map about the counts of each numbers.
        counts = collections.Counter(nums1)
        output = []
        for item in nums2:
            if counts[item] > 0:
                output += [item]
                counts[item] -= 1
        return output

