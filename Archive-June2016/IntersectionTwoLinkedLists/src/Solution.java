/**
 * Created by ZHONG on 2016/6/24.
 */
public class Solution
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        //Initializing.
        int lA = 0;
        int lB = 0;
        ListNode pA = headA;
        ListNode pB = headB;

        //Handling exceptions.
        if(headA == null || headB == null)
            return null;

        //Traverse two lists to calculate their lengths.
        while (pA != null)
        {
            lA++;
            pA = pA.next;
        }
        while (pB != null)
        {
            lB++;
            pB = pB.next;
        }

        //Determine and set start point.
        for (int i = 0; i < Math.abs(lA - lB); i++)
        {
            if (lA < lB)
                headB = headB.next;
            else
                headA = headA.next;
        }

        //Find the common node and return result.
        while (headA != null && headB != null)
        {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
