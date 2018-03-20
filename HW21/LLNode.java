//Stefan Tan
//APCS2 pd1
//HW21c -- Rockin' Through the Night
//2018-03-19

/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class LLNode
{
    //instance vars
    private LLNode nextNode;
    private String cargoString;
    
    // constructor 
    public LLNode(String cargoString, LLNode nextNode)
    {
	this.nextNode = nextNode;
	this.cargoString = cargoString;
    }

    //--------------v  ACCESSORS  v--------------
    public String getCargo()
    {
	return cargoString;
    }

    public LLNode getNext()
    {
	return nextNode;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo(String c)
    {
	this.cargoString = c;
	return cargoString;
    }

    public LLNode setNext(LLNode n)
    {
	this.nextNode = n;
	return nextNode;
    }
    //--------------^  MUTATORS  ^--------------

    
    // override inherited toString
    public String toString()
    {
	LLNode temp = nextNode;
	String result = "";
	while (getCargo() != null){
	    result += getCargo();
	}
	return result;
    }
    
    
    //main method for testing
    public static void main( String[] args )
    {
	//PROTIP: try creating a few nodes: traversible, connected...
	//note anything notable as you develop and test...
   
    }//end main

}//end class LLNode
