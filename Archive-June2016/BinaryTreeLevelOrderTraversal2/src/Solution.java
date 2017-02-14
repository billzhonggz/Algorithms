import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZHONG on 2016/6/19.
 */
public class Solution
{
    public List<List<Integer>> levelOrderBottom(TreeNode root)
    {
        //Initialize an arraylist.
        List<List<Integer>> result = new ArrayList<>();
        //Handling exceptions.
        if (root == null)
            return result;
        //Create a list to content original input.
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        //Call function to create arrays.
        helper(list,1,0,result);
        return result;
    }
    private void helper(List<TreeNode> list, int last, int cur, List<List<Integer>> res)
    {
        //Terminate condition.
        if(cur >= last)
            return;
        //Assign variables.
        int start = cur;
        int end = last;
        //Add elements to arraylist.
        while(cur < last)
        {
            if(list.get(cur).left != null)
                list.add(list.get(cur).left);
            if(list.get(cur).right != null)
                list.add((list.get(cur).right));
            cur++;
        }
        //Recursive call. Calculate the next row.
        helper(list, list.size(), cur, res);
        //Initialize a list to store the result of calctulation.
        List<Integer> values = new ArrayList<>();
        while(start < end)
        {
            values.add(list.get(start).val);
            start++;
        }

        //Add this list behind result list.
        res.add(values);
        return;
    }
}
