/**
 * Created by ZHONG on 2016/6/14.
 */
public class Solution
{
    public int[] plusOne (int[] digits)
    {
        int carry = 0;
        int len = digits.length;
        for (int i = 0; i < len; i++)
        {
            if (digits[len - i - 1] + 1 > 9)
            {
                carry = 1;
                digits[len - i - 1] = 0;
            }
            else
            {
                digits[len - i - 1] += 1;
                return digits;
            }
        }
        if (carry == 1)
        {
            digits = new int[len + 1];
            digits[0] = 1;
        }
        return digits;
    }
}
