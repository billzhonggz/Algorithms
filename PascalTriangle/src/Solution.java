import java.util.LinkedList;
import java.util.List;

/**
 * Created by ZHONG on 2016/6/22.
 * Calculate Pascal's Triangle by its Math definition.
 * Applying permutation and combination principle.
 */
public class Solution
{
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> pascal = new LinkedList<List<Integer>>();
        for (int i = 0; i < numRows; i++)
        {
            List<Integer> row = new LinkedList<Integer>();
            long current = 1;
            row.add((int)current);
            for (int j = 1; j <= i; ++j)
            {
                current = current * (i - j + 1) / j;
                row.add((int) current);
            }
            pascal.add(row);
        }
        return pascal;
    }
}
