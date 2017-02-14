/**
 * Created by ZHONG on 2016/6/18.
 */
public class Solution
{
    public int maxDepth(TreeNode root)
    {
        if (root == null)
            return 0;
        return 1 + (Math.max(maxDepth(root.left), maxDepth(root.right)));
    }
}
