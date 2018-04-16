//Stefan Tan
//APCS2 pd1
//HW32 -- Leon Leonwood Stack
//2018-04-11

import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE>
{
    private ArrayList<PANCAKE> stack = new ArrayList<PANCAKE>();

    public boolean isEmpty()
    {
	return stack.size() == 0;
    }

    public PANCAKE peek()
    {
	return stack.get(stack.size() - 1);
    }

    public PANCAKE pop()
    {
	return stack.remove(stack.size() - 1);
    }

    public void push(PANCAKE x)
    {
	stack.add(x);
    }
}
