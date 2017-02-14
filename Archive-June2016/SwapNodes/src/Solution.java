/**
 * Created by ZHONG on 2016/6/12.
 */
public class Solution
{
    public ListNode swapPairs(ListNode head)
    {
        //Handling exceptions.
        if (head == null)
            return null;
        //Create a fake head.
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        //Initialize pointers.
        ListNode p0 = fakeHead;
        ListNode p1 = head;
        ListNode p2 = head;
        //Traverse the list.
        while (p1 != null && p1.next != null)
        {
            p1 = p0.next;
            p2 = p1.next;
            //Begin swap.
            if (p2 != null)
            {
                p1.next = p2.next;
                p2.next = p1;
                p0.next = p2;
                p0 = p1;
            }
        }
        return fakeHead.next;
    }
}
