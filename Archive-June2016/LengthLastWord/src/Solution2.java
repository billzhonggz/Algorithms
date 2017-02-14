/**
 * Created by ZHONG on 2016/6/14.
 */
public class Solution2
{
    public int lengthOfLastWord (String s)
    {
        //Initializing variables and get the length of the inputted string.
        int result = 0;
        int len = s.length();
        //Use while loop to skip counting all spaces.
        while (len > 0 && s.charAt(len - 1) == ' ')
            len = len - 1;
        //Traverse the string.
        for (int i = len - 1; i >= 0; i--)
        {
            //Return current counting number once reaches a space.
            if (s.charAt(i) == ' ')
                return result;
            //OR keep counting.
            else
                result++;
        }
        return result;
    }
}
