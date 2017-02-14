/**
 * Created by ZHONG on 2016/6/14.
 */
public class Solution
{
    public int lengthOfLastWord(String s)
    {
        //Handling exceptions.
        if (s.equals(null) || s.trim().equals(""))
            return 0;
        //Initializing variables.
        int result = 0;
        //Set traverse from the very end of the string.
        int i = s.length() - 1;
        //Identifying a space.
        boolean space = s.charAt(i) == ' ' ? true : false;
        //Traverse the string.
        for ( ; i >= 0; i--)
        {
            char c = s.charAt(i);
            //Determine whether the character is a whitespace or not.
            if (c == ' ')
            {
                //Begin counting.
                result++;
                //Mark the space to be "false".
                space = false;
            }
            else
            {
                if (!space)
                    return result;
                space = true;
            }
        }
        return result;
    }
}
