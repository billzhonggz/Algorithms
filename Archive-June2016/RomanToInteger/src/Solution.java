/**
 * Created by ZHONG on 2016/6/10.
 */
public class Solution
{
    public int romanToInt(String s)
    {
        //Determine exceptions.
        //Empty strings and strings only content whitespaces.
        if (s.equals(null) || s.trim().length() == 0)
            return 0;
        //Copy inputted string and throw whitespaces.
        s = s.trim();
        //Convert it to char array.
        char[] tempArray = s.toCharArray();
        //Initialize return variable.
        int sum = 0;
        //Traverse the array and add integer according to the map.
        for (int i = 0; i < tempArray.length - 1; i++)
        {
            int current = valueOfRoman(tempArray[i]);
            int next = valueOfRoman(tempArray[i+1]);
            if (current >= next)
                sum = sum + current;
            else
                sum = sum - current;
        }
        sum = sum + valueOfRoman(tempArray[tempArray.length - 1]);
        return sum;
    }
    private int valueOfRoman(char c)
    {
        //A value map of Roman digit.
        switch (c)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
