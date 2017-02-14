/**
 * Created by ZHONG on 2016/6/10.
 */
public class Solution
{
    public String longestCommonPrefix(String[] strs)
    {
        //Determine exceptions.
        if (strs.equals(null) || strs.length == 0)
            return "";
        /**
         *  Set the first string as the standard.
         *  Find common string char by char.
         *  Once one string doesn't have the current char, terminate the loop.
         */
        for (int i = 0; i < strs[0].length(); i++)
        {
            char c = strs[0].charAt(i);
            for (String s:strs)
            {
                if (s.length() == i || s.charAt(i) != c)
                    return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}
