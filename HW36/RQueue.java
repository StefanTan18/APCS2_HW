//Team NeverStopThinking - Richard Wong and Stefan Tan
//APCS2 pd1
//HW36 -- Now Let's Consider You Lot at Fake Terry's
//2018-04-17

/*****************************************************
 * class RQueue
 * A linked-list-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 ******************************************************/

public class RQueue<T> implements Queue<T>
{
    //instance variables
    private LLNode<T> _front, _end;
    private int _size;


    // default constructor creates an empty queue
    public RQueue() 
    {
	_front = null;
	_end = null;
	_size = 0;
    }//end default constructor


    public void enqueue( T enQVal ) 
    {
    	//enQNode is set to the _end and it's next node is the former end
	LLNode<T> enQNode = new LLNode<T>(enQVal, _end);
	if (isEmpty()){
	    _front = enQNode;
	}
	_end = enQNode;
	_size++;
    }//end enqueue()


    // remove and return thing at front of queue
    // assume _queue ! empty
    public T dequeue() 
    {
	if(isEmpty()) {
	    return null;
	}
    	//shuffle
	sample();
      
	T retVal = _front.getValue();
	LLNode<T> _temp = _end;
	if(_end == _front) {
	    _end = _end.getNext();
	}
	else {
	    while (_temp.getNext() != null) {
		if(_temp.getNext() == _front) {
		    _temp.setNext(_front.getNext());
		    break;
		}
		_temp = _temp.getNext();
	    }
	}
	_size--; 
	return retVal;
    }//end dequeue()


    public T peekFront() 
    {
	return _front.getValue();
    }


    /******************************************
     * void sample() -- a means of "shuffling" the queue
     * Algo:
     * ...
     * 
     ******************************************/
    public void sample () 
    {
	int rand = (int)(Math.random() * _size); // random number from 0 to _size
	_front = _end;
	for(int i = 0; i < rand; i++)
	    {
		if (_front.getNext() != null)
		    {
			_front = _front.getNext();
		    }
	    }
    }//end sample()

    //returns true if the radomized queue is empty, false otherwise
    public boolean isEmpty() 
    {
	return _size == 0;
    } //O(1)


    // print each node, separated by spaces
    //end -> N -> N ... -> front
    public String toString() 
    { 
	String retStr = "end |";
	LLNode temp = _end;
	while(temp != null){
	    retStr += temp.getValue() + " - > ";
	    temp = temp.getNext();
	}
	retStr += "| front";
	return retStr;
    }//end toString()



    //main method for testing
    public static void main( String[] args )
    {

	Queue<String> PirateQueue = new RQueue<String>();

	System.out.println("\nnow enqueuing..."); 
	PirateQueue.enqueue("Dread");
	PirateQueue.enqueue("Pirate");
	PirateQueue.enqueue("Robert");
	PirateQueue.enqueue("Blackbeard");
	PirateQueue.enqueue("Peter");
	PirateQueue.enqueue("Stuyvesant");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( PirateQueue ); //for testing toString()...

	System.out.println("\nnow dequeuing..."); 
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );

	System.out.println("\nnow dequeuing fr empty queue..."); 
	System.out.println( PirateQueue.dequeue() );
	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	  ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

    }//end main

}//end class RQueue
