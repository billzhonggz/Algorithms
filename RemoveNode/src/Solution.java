/**
 * Created by ZHONG on 2016/6/10.
 */
public class Solution
{
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        //Check exception.
        if (head == null)
            return null;
        //Initialize two pointers to indicate positions.
        //Set their start point as head.
        ListNode p = head;
        ListNode q = head;
        //The second pointer: Traverse the list.
        for (int i = 0; i < n; i++)
        {
            q = q.next;
        }
        //If nth node is null, delete the fist node.
        //Return the next node behind original head node.
        if (q == null)
        {
            head = head.next;
            p = null;
            return head;
        }
        //If (n+1)th node is not null, continue traverse the list till the last node.
        while (q.next != null)
        {
            p = p.next;
            q = q.next;
        }
        //Assign the pointer's value to delete the nth node.
        ListNode tmp = p.next.next;
        p.next = tmp;
        return head;
    }
}
