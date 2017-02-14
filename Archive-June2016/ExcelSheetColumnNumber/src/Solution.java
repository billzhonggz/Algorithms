/**
 * Created by ZHONG on 2016/6/27.
 */
public class Solution
{
    public int titleToNumber(String s)
    {
        //Directly convert char to integer.
        int result = s.charAt(0) - 'A' + 1;
        //Add numbers one by one.
        for (int i = 1; i < s.length(); i++)
        {
            result = result * 26 + s.charAt(i) - 'A' + 1;
        }
        return result;
    }
}
