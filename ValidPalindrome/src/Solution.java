/**
 * Created by ZHONG on 2016/6/22.
 */
public class Solution
{
    public boolean isPalindrome(String s)
    {
        //Handling exceptions.
        if (s.equals(null))
            return false;
        if (s.length() <= 1)
            return true;
        //Traverse the string.
        int i = 0;
        int j = s.length() - 1;
        while (i < j)
        {
            //Case 1: Ignore non-alphanumeric characters.
            if (ignoreChar(s.charAt(i)))
            {
                i++;
                continue;
            }
            if (ignoreChar(s.charAt(j)))
            {
                j--;
                continue;
            }
            //Determine same letter or not.
            if (!isSameLetter(s.charAt(i),s.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }
    //Determine whether inputted character is ignorable.
    private boolean ignoreChar(char c)
    {
        //CANNOT ignore numbers.
        if (c >= 48 && c <= 57)
            return false;
        //CHECK is letter or not when it isn't numbers.
        return !isLetter(c);
    }
    //Check the inputted character is a letter or not.
    private boolean isLetter(char c)
    {
        //Check uppercase letters.
        if (c >= 65 && c <= 90)
            return true;
        //Check lowercase letters.
        else if (c >= 97 && c <= 122)
            return true;
        else
            return false;
    }
    private boolean isSameLetter(char a, char b)
    {
        //Check same or different by ASCII code when inputted characters are letters.
        //Ignore cases.
        if (isLetter(a) && isLetter(b))
        {
            if (a == b || a == b + 32 || a + 32 == b)
                return true;
        }
        else
            //Check non-alphanumeric characters.
            if (a == b)
                return true;
        return false;
    }
}
