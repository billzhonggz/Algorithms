/**
 * Created by ZHONG on 2016/6/25.
 */
public class Solution
{
    public String convertToTitle(int n)
    {
        String result = "";
        while (n != 0)
        {
            result = (char)('A' + (--n) % 26) + result;
            n /= 26;
        }
        return result;
    }
}
