/**
 * Created by ZHONG on 2016/6/9.
 */
public class Solution
{
    public int myAtoi(String str)
    {
        //Check input is null?
        if (str.equals(null))
            return 0;
        int i = 0;
        //Initialize a variable to count negative sign.
        int negCount = 0;
        boolean isNeg = false;
        //Count negative sign in input string.
        while (i < str.length())
        {
            //If the char is a space, do nothing.
            if (negCount == 0 && str.charAt(i) == ' ')
            {

            }
            //If there is a sign, determine whether is positive or negative. Count one if it is negative.
            else if (negCount == 0 && (str.charAt(i) == '+' || str.charAt(i) == '-'))
            {
                isNeg = str.charAt(i) == '-' ? true : false;
                negCount++;
            }
            //If the char isn't number, return 0.
            //Once a non-number char appear, return immediately.
            else if (str.charAt(i) < '0' || str.charAt(i) > '9')
                return 0;
            else
                break;
            i++;
        }

        //Output the result.
        int result = 0;
        while (i < str.length())
        {
            if  (str.charAt(i) < '0' || str.charAt(i) > '9')
                break;
            //Convert string to integer.
            int dig = str.charAt(i) - '0';
            //Check overflow.
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && dig > Integer.MAX_VALUE % 10))
            {
                if(isNeg)
                    return Integer.MIN_VALUE;
                else
                    return Integer.MAX_VALUE;
            }
            result = result * 10 + dig;
            i++;
        }
        return isNeg ? -result : result;
    }
}
