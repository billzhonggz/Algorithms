/**
 * Created by ZHONG on 2016/6/12.
 */
public class Solution2
{
    public int strStr(String haystack, String needle)
    {
        //Handling exceptions.
        if (haystack.length() == 0 && needle.length() == 0)
        {
            return 0;
        }
        if (needle.length() == 0)
            return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++)
        {
            if (haystack.charAt(i) == needle.charAt(0))
            {
                String subString = haystack.substring(i, i + needle.length());
                if (subString.equals(needle))
                    return i;
                else
                    continue;
            }
        }
        return -1;
    }
}
