/**
* Created by ZHONG on 2016/6/11.
        */
public class Solution
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        //Identify exceptions.
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        //Check value. Large to right, small to left.
        if (l1.val < l2.val)
        {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
        else
        {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
