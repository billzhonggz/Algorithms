/**
 * Created by ZHONG on 2016/6/15.
 */
public class Solution
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        //Using merge sort algorithm.
        //Initializing variables (pointers).
        int i = m - 1;//For array nums1.
        int j = n - 1;//For array nums2.
        int k = m + n - 1;//For moving elements from nums2.
        //Begin moving elements
        while (i > -1 && j > -1)
        {
            if (nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        while (j > -1)
            nums1[k--] = nums2[j--];
    }
}
