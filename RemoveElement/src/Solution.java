/**
 * Created by ZHONG on 2016/6/12.
 */
public class Solution
{
    public int removeElement(int[] nums, int val)
    {
        //Initialize two pointers.
        int left = 0;
        int right = nums.length - 1;
        //Keep left pointer always at the left of the right pointer.
        while (left <= right)
        {
            //Left pointer reaches required value.
            if(nums[left] == val)
                //Assign the second last value to the position where required value is found.
                nums[left] = nums[right--];
            else
                //Keep finding.
                left++;
        }
        //Return the last index of left pointer.
        return left;
    }
}
