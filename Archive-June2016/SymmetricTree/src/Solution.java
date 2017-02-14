/**
 * Created by ZHONG on 2016/6/18.
 */
public class Solution
{
    public boolean isSymmetric(TreeNode root)
    {
        //Exceptions handling.
        if (root == null)
            return true;
        if (root.left != null && root.right != null)
        {
            if (root.left.val != root.right.val)
                return false;
        }
        return isSymmetric(root.left,root.right);
    }
    //A method to judge whether left side and right is equal or not.
    private boolean isSymmetric(TreeNode t1, TreeNode t2)
    {
        //Exception handling.
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        boolean isOuterSymmetric = isSymmetric(t1.left, t2.right);
        boolean isInnerSymmetric = isSymmetric(t1.right, t2.left);
        return (t1.val == t2.val) && isOuterSymmetric && isInnerSymmetric;
    }
}
