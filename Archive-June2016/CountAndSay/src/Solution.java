/**
 * Created by ZHONG on 2016/6/12.
 */
public class Solution
{
    public String countAndSay(int n)
    {
        //Handing exception.
        if (n < 1)
            return "";
        //Initialize some variables.
        String str = "1";
        //Call method "genNext" to generate the string.
        String result = genNext(str,n);
        return result;
    }
    private String genNext(String s, int n)
    {
        if (n == 1)
            //Return default value: "1".
            return s;
        //Get length of incoming string.
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++)
        {
            int j = i;
            while (i + 1 < length && s.charAt(i) == s.charAt(i + 1))
                i++;
            //Add characters to StringBuilder sb.
            sb.append(i - j + 1);
            sb.append(s.charAt(i));
        }
        //Recursive call. Change the added StringBuilder back to string.
        return genNext(sb.toString(),n - 1);
    }
}
