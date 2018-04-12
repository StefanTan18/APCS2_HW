//Stefan Tan
//APCS2 pd1
//HW32 -- Leon Leonwood Stack
//2018-04-11

import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE>
{
    private LinkedList<PANCAKE> stack = new LinkedList<PANCAKE>();

    public boolean isEmpty()
    {
	return stack.size() == 0;
    }

    public PANCAKE peek()
    {
	return stack.getFirst();
    }

    public PANCAKE pop()
    {
	return stack.removeFirst();
    }

    public void push(PANCAKE x)
    {
	stack.addFirst(x);
    }	
}
