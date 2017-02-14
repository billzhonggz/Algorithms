import java.util.LinkedList;

/**
 * Created by ZHONG on 2016/6/24.
 */
public class MinStack
{
    //Initialize a list.
    private LinkedList<Integer> list = new LinkedList<>();
    //Set min value as the largest value available in integer.
    int min = Integer.MAX_VALUE;

    public MinStack()
    {
    }

    public void push(int x)
    {
        //Insert the first element at the front of the list.
        if (x <= min)
        {
            list.offerFirst(min);
            min = x;
        }
        list.offerFirst(x);
    }

    public void pop()
    {
        //Remove element at the front of the list.
        int x = list.removeFirst();
        if (x == min)
            min = list.removeFirst();
    }

    public int top()
    {
        return list.peekFirst();
    }

    public int getMin()
    {
        return min;
    }
}
