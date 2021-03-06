//Stefan Tan
//APCS2 pd1
//HW34 -- The English Do Not Wait In Line
//2018-04-13

public class NodeQueue<Quasar> implements Queue<Quasar>{
    private LLNode _head;
    private int _size;

    public NodeQueue(){
	_head = null;
	_size = 0;
    }

    public Quasar dequeue(){
	_size--;
	return (Quasar)_head.setValue(_head.getNext());
    }

    public void enqueue(Quasar x){
	LLNode tmp = _head;
	for (int i = 0; i < _size - 1; i++)
	    tmp = tmp.getNext();
	LLNode temp = new LLNode(x, null);
	tmp.setNext(temp);
	_size++;
    }

    public boolean isEmpty(){
	return _size == 0;
    }

    public Quasar peekFront(){
	return (Quasar)_head.getValue();
    }
}
	
