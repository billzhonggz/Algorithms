/**
 * Created by ZHONG on 2016/6/22.
 */
public class Solution
{
    public int maxProfit(int[] prices)
    {
        int maxProfit = 0;
        //Initialize the "buyPrice" as the max value of an integer.
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++)
        {
            //Determine overflows.
            //If no, assign buy price as current price.
            //Process to next step.
            if (buyPrice > prices[i])
            {
                buyPrice = prices[i];
            }
            //If current price is larger than current profit(in variable "maxProfit"), assign the latest profit.
            //The current calculated profit should be larger than the variable "maxProfit" contents.
            else if (prices[i] - buyPrice > maxProfit)
            {
                maxProfit = prices[i] - buyPrice;
            }
        }
        //Return the profit when the loop finishes.
        return maxProfit;
    }
}
