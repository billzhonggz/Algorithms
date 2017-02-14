/**
 * Created by ZHONG on 2016/6/12.
 */
public class Solution
{
    public int strStr(String haystack, String needle)
    {
        //Handling exceptions.
        if (haystack.equals(null))
            return -1;
        if (needle.length() > haystack.length())
            return -1;
        if (needle.equals(null) || needle.equals(""))
            return 0;
        //Traverse haystack string.
        int compareFailCount = 0;
        for (int i = 0; i < haystack.length(); i++)
        {
            //Compare the first char in string needle.
            char c0 = haystack.charAt(i);
            if (c0 == needle.charAt(0) && haystack.length() - i >= needle.length())
            {
                //Traverse string needle.
                for (int j = 0; j < needle.length(); j++)
                {
                    char c1 = haystack.charAt(i + j);
                    char c2 = needle.charAt(j);
                    if (c1 != c2)
                        compareFailCount++;
                }
                if (compareFailCount == 0)
                    return i;
                else
                    return -1;
            }
            else
                return -1;
        }
        return -1;
    }
}
