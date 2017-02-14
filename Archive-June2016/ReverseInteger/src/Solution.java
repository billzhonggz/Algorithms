/**
 * Created by ZHONG on 2016/6/9.
 */
public class Solution
{
    public int reverse(int x)
    {
        //Initialize variables.
        long result = 0;
        //Inverse integer.
        while (x != 0)
        {
            result = result * 10 + x % 10;
            //Determine whether input is out of range.
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
            x = x / 10;
        }
        return  (int)result;
    }
}
