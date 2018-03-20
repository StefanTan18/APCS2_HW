//Stefan Tan
//APCS2 pd1
//HW21c -- Rockin' Through the Night
//2018-03-19

public class LList implements List{
    private LLNode head;

    public boolean add(String x){
	head.setCargo(x);
	return true;
    }

    public String get(int i){
	LLNode temp = head;
	if(i == 0){
	    return temp.getCargo();
	}
	else{
	    i--;
	    temp = temp.getNext();
	    return get(i);
	}
    }

    public String set(int i, String x){
	LLNode temp = head;
	while(i > 0){
	    temp.getNext();
	    i--;
	}
	return temp.setCargo(x);
    }

    public int size(){
	LLNode temp = head;
	int i = 0;
	while(temp.getCargo() != null){
	    i++;
	    temp = temp.getNext();
	}
	return i;
    }
}
	       
	    
	
	    
			      
