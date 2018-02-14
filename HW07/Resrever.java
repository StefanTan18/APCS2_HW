//Team Jake Paulers (Ben Platt, Stefan Tan)
//APCS2 pd1
//HW07 -- A Man, A Plan, A Canal: Panama!
//2018-02-13

public class Resrever{
    public static String reverseLinear(String s){
	String retStr = "";
	for (int i = s.length() - 1; i >= 0; i--)
	    retStr += s.substring(i, i+1);
	return retStr;
    }

    public static String reverseLog(String s){
        if ( s.length() <= 1 )
	    return s;
	String leftHalf = s.substring(0,s.length() / 2);
	String rightHalf = s.substring(s.length() / 2, s.length());
	return (reverseLog(rightHalf)) + (reverseLog(leftHalf));
    }

    public static void main(String[] args){
	String s1 = "stressed";
	String s2 = "racecar";
	String s3 = "deer";

	System.out.println("O(n) of reverse:");
	System.out.println(reverseLinear(s1));
	System.out.println(reverseLinear(s2));
	System.out.println(reverseLinear(s3));

	System.out.println("\nO(logn) of reverse:");
	System.out.println(reverseLog(s1));
	System.out.println(reverseLog(s2));
	System.out.println(reverseLog(s3));
    }
}
      
	    
	
