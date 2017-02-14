/**
 * Created by ZHONG on 2016/6/12.
 */
public class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int i = 0;
        for (int n : nums)
        {
            if (i < 1 || n > nums[i - 1])
                nums[i++] = n;
        }
        return i;
    }
}
