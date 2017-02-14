/**
 * Created by ZHONG on 2016/6/10.
 */
public class Solution
{
    public boolean isPalindrome(int x)
    {
        //Determine whether it is negative.
        //If input is negative, directly return.
        if (x < 0)
            return false;
        //Initialize variables.
        int reverse = 0;
        int tmp = x;
        //Reverse input number and assign to reverse variable.
        while (tmp > 0)
        {
            //Reverse inputted integer digit by digit.
            reverse = reverse * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        //Determine whether reversed number equals to original number.
        if (reverse != x)
            return false;
        else
            return true;
    }
}
