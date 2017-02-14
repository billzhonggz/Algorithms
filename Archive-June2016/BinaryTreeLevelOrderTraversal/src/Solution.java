import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZHONG on 2016/6/18.
 */
public class Solution
{
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> mainList = new ArrayList<>();
        handleTree(root,mainList,0);
        return mainList;
    }
    private void handleTree(TreeNode root,List<List<Integer>> mainList, int level)
    {
        //Exceptions handling.
        if (root == null)
            return;
        List<Integer> ls;
        if (mainList.size() == level)
        {
            ls = new ArrayList<Integer>();
            mainList.add(ls);
        }
        else
        {
            ls = mainList.get(level);
        }
        ls.add(root.val);
        handleTree(root.left, mainList, level + 1);
        handleTree(root.right, mainList, level + 1);
    }
}
