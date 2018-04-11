//Stefan Tan
//APCS2 pd1
//HW31 -- Stack: What Is It Good For?
//2018-04-10

/*****************************************************
 * skeleton for class LatKtS
 * Driver class for Latkes.
 * Uses a stack to reverse a text string, check for sets of matching parens.
 *****************************************************/


public class LatKtS
{

  /**********************************************************
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **********************************************************/
  public static String flip( String s )
  {
      String retVal = "";
      Latkes reversal = new Latkes(s.length());
      for (int i = 0; i < s.length(); i++)
	  reversal.push(s.substring(i,i+1));
      for (int i = s.length(); i > 0; i--)
	  retVal += reversal.pop();
      return retVal;
  }//end flip()


  /**********************************************************
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **********************************************************/
    public static boolean allMatched( String s )
    {
	Latkes matcher = new Latkes(s.length());
	if (s.equals(""))
	    return true;
	for (int i = 0; i < s.length(); i++){
	    if (s.substring(i,i+1).equals("{")||s.substring(i,i+1).equals("(")||s.substring(i,i+1).equals("["))
		matcher.push(s.substring(i,i+1));
	    else if (s.substring(i,i+1).equals("}")){
		if (matcher.isEmpty() || !matcher.pop().equals("{"))
		    return false;
	    }
	    else if (s.substring(i,i+1).equals(")")){
		if (matcher.isEmpty() || !matcher.pop().equals("("))
		    return false;
	    }
	    else if (s.substring(i,i+1).equals("]")){
		if (matcher.isEmpty() || !matcher.pop().equals("["))
		    return false;
	    }
	}
	return matcher.isEmpty();
    }//end allMatched()
    
	
  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }
    
}//end class LatKtS
