//Stefan Tan
//APCS2 pd1
//HW32 -- Leon Leonwood Stack
//2018-04-11

/*****************************************************
 * class Stckr
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 *****************************************************/

public class Stckr 
{
    public static void main( String[] args )
    {
	//Stack<String> cakes = new ALStack<String>(); 
	Stack<String> cakes = new LLStack<String>();

	//Testing dem stacks!
	System.out.println("Is the stack empty? " + cakes.isEmpty()); //true

        //Fill dem cakes! Alphabet Style!
	cakes.push("A");
	cakes.push("B");
	cakes.push("C");
	cakes.push("D");
	cakes.push("E");
	cakes.push("F");
	cakes.push("G");

	//Testing da isEmpty()!
        System.out.println("Is the stack empty? " + cakes.isEmpty()); //false
	//Testing da peek()!
	System.out.println("Testing Peek: " + cakes.peek()); //G

	//Pop dem cakes!
	System.out.println("Popped: " + cakes.pop()); //G
	System.out.println("Popped: " + cakes.pop()); //F
	System.out.println("Popped: " + cakes.pop()); //E
	System.out.println("Popped: " + cakes.pop()); //D
	
	//Testing da isEmpty() again!
	System.out.println("Is the stack empty? " + cakes.isEmpty()); //false
	//Testing da peek()!
	System.out.println("Testing Peek: " + cakes.peek()); //C
	
        System.out.println("Popped: " + cakes.pop()); //C
	System.out.println("Popped: " + cakes.pop()); //B
	System.out.println("Popped: " + cakes.pop()); //A

	//Testing da isEmpty() because why not?
	System.out.println("Is the stack empty? " + cakes.isEmpty()); //true
    }
}//end class

