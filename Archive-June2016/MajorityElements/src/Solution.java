/**
 * Created by ZHONG on 2016/6/25.
 */
public class Solution
{
    public int majorityElement(int[] nums)
    {
        //Handling exception.
        if (nums == null || nums.length == 0)
            return 0;
        int count = 1;
        //Initialize initial value of result as the first element of inputted array.
        int result = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != result)
                count--;
            else
                count++;
            if (count == 0)
            {
                result = nums[i];
                count = 1;
            }
        }
        return result;
    }
}
