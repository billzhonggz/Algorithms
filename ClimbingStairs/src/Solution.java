/**
 * Created by ZHONG on 2016/6/15.
 */
public class Solution
{
    public int climbStairs(int n)
    {
        //Array solution.
        //Initializing a array contents possible steps (ps).
        //As initial situation.
        int[] ps = {0,1,2};
        //Loop from 3.
        for (int i = 3; i <= n; i++)
        {
            //Set the value of the array at the position of remainder
            ps[i % 3] = ps[(i - 1) % 3] + ps[(i - 2) % 3];
        }
        return ps[n % 3];
    }
}
