#
# @lc app=leetcode id=242 lang=python3
#
# [242] Valid Anagram
#
# https://leetcode.com/problems/valid-anagram/description/
#
# algorithms
# Easy (53.36%)
# Likes:    826
# Dislikes: 116
# Total Accepted:    387.6K
# Total Submissions: 726.3K
# Testcase Example:  '"anagram"\n"nagaram"'
#
# Given two strings s and t , write a function to determine if t is an anagram
# of s.
# 
# Example 1:
# 
# 
# Input: s = "anagram", t = "nagaram"
# Output: true
# 
# 
# Example 2:
# 
# 
# Input: s = "rat", t = "car"
# Output: false
# 
# 
# Note:
# You may assume the string contains only lowercase alphabets.
# 
# Follow up:
# What if the inputs contain unicode characters? How would you adapt your
# solution to such case?
# 
#
class Solution:
    """
    # First attempt: sort two strings in alphabetical order,
    # then compare them. If they are the same, return true,
    # otherwise, return false.
    # √ Accepted
    # √ 34/34 cases passed (68 ms)
    # √ Your runtime beats 38.45 % of python3 submissions
    # √ Your memory usage beats 6.25 % of python3 submissions (14.4 MB)
    # View https://github.com/python/cpython/blob/master/Python/bltinmodule.c#L2185 for implementation of `sorted()` function.
    def isAnagram(self, s: str, t: str) -> bool:
        s = ''.join(sorted(s))
        t = ''.join(sorted(t))
        if s == t:
            return True
        else:
            return False
    """       
    # Second attempt: dictionary-based (hashmap) solution
    # For `sorted()` function in Python, it handles sorting in a list level.
    # In this kind of cases, switching to hashmap worth to try.
    # Assigning the strings to two dictionaries as their keys,
    # and keep the value as 1.
    # Compare two dictionaries can be finished in O(1).
    def isAnagram(self, s: str, t: str) -> bool:
        dict1 = {}
        dict2 = {}
        for item in s:
            dict1[item] = dict1.get(item, 0) + 1
        for item in t:
            dict2[item] = dict2.get(item, 0) + 1
        return dict1 == dict2

if __name__ == '__main__':
    sol = Solution
    sol.isAnagram(sol, 'hello','olleh')
