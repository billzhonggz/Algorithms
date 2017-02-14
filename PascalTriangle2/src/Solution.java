import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZHONG on 2016/6/22.
 */
public class Solution
{
    public List<Integer> getRow(int rowIndex)
    {
        List<Integer> result = new ArrayList<Integer>();
        //Add the first row.
        result.add(1);
        //Calculate required row according to math definition.
        for (int i = 1; i <= rowIndex; i++)
        {
            result.add(
                    (int) ((long)result.get(i - 1) * (rowIndex + 1 - i) / i)
            );
        }
        return result;
    }
}
