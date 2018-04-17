//Team What -- Kerwin Chen, Stefan Tan, Tahsin Ali
//APCS2 pd1
//HW35 -- ...Nor Do Aussies
//2018-04-16

import java.util.ArrayList;

public class ALQueue<T> implements Queue<T>
{
    private ArrayList<T> _queue;

    //constructor
    public ALQueue()
    { 
	_queue = new ArrayList<T>();
    }
    
    public void enqueue(T item){
	_queue.add(item);
    }
    public T dequeue(){
	return _queue.remove(0);
    }
    public boolean isEmpty(){
	return (_queue.size() == 0);
    }

    public T peekFront(){
	return _queue.get(0);
    }
    
    public static void main(String[] args){

	Queue<String> aQueue = new ALQueue<String>();

	aQueue.enqueue("aoo");
	aQueue.enqueue("boo");
	aQueue.enqueue("coo");
	aQueue.enqueue("doo");
    
	System.out.println( "isEmpty: " + aQueue.isEmpty() ); //false
	
	//aoo
	System.out.println( "peek: " + aQueue.peekFront() );
	System.out.println( "dequeue: " + aQueue.dequeue() );
	//boo
	System.out.println( "peek: " + aQueue.peekFront() );
	System.out.println( "dequeue: " + aQueue.dequeue() );
	//coo
	System.out.println( "peek: " + aQueue.peekFront() );
	System.out.println( "dequeue: " + aQueue.dequeue() );
	//doo
	System.out.println( "peek: " + aQueue.peekFront() );
	System.out.println( "dequeue: " + aQueue.dequeue() );
	
	System.out.println( "isEmpty: " + aQueue.isEmpty() ); //true
    }//end main
}//end class ALQueue
