/**
 * Created by ZHONG on 2016/6/14.
 */
public class Solution
{
    public String addBinary (String a, String b)
    {
        //Initializing variables and get the value of inputted string.
        int i = a.length() - 1;
        int j = b.length() - 1;
        //Initializing a carry.
        int carry = 0;
        //And a stringbuilder.
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0)
        {
            int sum = carry;
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            //Applying Euclidean algorithm.
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
