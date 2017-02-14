/**
 * Created by ZHONG on 2016/6/25.
 */
public class Solution
{
    public int compareVersion(String version1, String version2)
    {
        //Transfer strings to arrays.
        char[] c1 = version1.toCharArray();
        char[] c2 = version2.toCharArray();
        //Calculate their length.
        int l1 = c1.length;
        int l2 = c2.length;
        //Initialize counters.
        int i = 0;
        int j = 0;
        //Initialize converted version number containers.
        int num1 = 0;
        int num2 = 0;
        //Traverse two arrays.
        while (i < l1 || j < l2)
        {
            //Reach the dividing point. Convert string to integer.
            while (i < l1 && c1[i] != '.')
            {
                num1 = 10 * num1 + c1[i] - '0';
                ++i;
            }
            //Reach the dividing point. Convert string to integer.
            while (j < l2 && c2[j] != '.')
            {
                num2 = 10 * num2 + c2[j] - '0';
                ++j;
            }
            //Compare integers.
            if (num1 > num2)
                return 1;
            if (num1 < num2)
                return -1;
            num1 = 0;
            num2 = 0;
            ++i;
            ++j;
        }
        return 0;
    }
}
