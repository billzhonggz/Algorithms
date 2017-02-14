/**
 * Created by ZHONG on 2016/6/18.
 */
public class Solution
{
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        //Exceptions handling.
        if (p == null && q == null)
        {
            return true;
        }
        if (p != null && q != null)
        {
            if (p.val != q.val)
                return false;
            else
            {
                if (isSameTree(p.left, q.left) == false)
                    return false;
                if (isSameTree(p.right,q.right) == false)
                    return false;
            }
            return true;
        }
        return false;
    }
}
