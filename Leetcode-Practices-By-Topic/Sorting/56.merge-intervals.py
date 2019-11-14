#
# @lc app=leetcode id=56 lang=python3
#
# [56] Merge Intervals
#

# @lc code=start
class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        """Attempt 1
        1. Sort the intervals by the first element in increasing order.
        2. Two intervals are overlapping if the first element of the larger one is in the area of the smaller one.
        3. Merge these intervals.
        """
        # Sort
        from operator import itemgetter
        intervals = sorted(intervals, key=itemgetter(0))
        # Determine overlap
        for i in range(len(intervals)):
            for j in range(i, len(intervals)):
                # The first (small) number of the intervial
                if j[0] > i[0] and j[0] < i[1]:
                    # Determine the second element, to see which is wider.
                    if j[1] >= i[1]:
                        # The later one is wider
                        new_interval = [i[0], j[1]]
                        # TODO: delete the original intervals.
                    elif j[1] < i[1]:
                        # The former one is wider
                        new_interval = [i[0], i[1]]
                        # TODO: delete the original intervals.

# @lc code=end

