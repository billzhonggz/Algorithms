/**
 * Created by ZHONG on 2016/6/27.
 */
public class Solution
{
    public int trailingZeros(int n)
    {
        //Initialize a counter.
        int count = 0;
        /** Applying math rules in factorials.
         * Find out how many times 10 is in the factor in the expansion of n.
         * Because 5 * 2 = 10, so the program should find out all products of 5 and 2.
         * Because the products of 5 in an expansion are far less than products of 2, so the program can take all
         * numbers with 5 as a factor.
         * Than the number of trailing zeros can be calculated.
         */
        while (n > 0)
        {
            n = n / 5;
            count = count + n;
        }
        return count;
    }
}
