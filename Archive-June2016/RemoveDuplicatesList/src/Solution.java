/**
 * Created by ZHONG on 2016/6/15.
 */
public class Solution
{
    public ListNode deleteDuplicates(ListNode head)
    {
        //Handling exception.
        if (head == null || head.next == null)
            return head;
        //Initialize a pointer.
        ListNode p = head;
        //Begin traverse.
        while (p.next != null)
        {
            if (p.val == p.next.val)
                p.next = p.next.next;
            else
                p = p.next;
        }
        return head;
    }
}
