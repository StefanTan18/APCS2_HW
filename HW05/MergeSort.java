//Stefan Tan
//APCS2 pd1
//HW05 -- Step 1: Split, Step 2: ?, Step 3: Sorted!
//2018-02-06

/*======================================
  class Mergesort
  Implements mergesort on array of ints.

  Summary of Algorithm:
  First it divides the array into arrays that are sorted which is when they have
  one element. It then merges by creating a new array that has a length of the 
  sum of the lengths of the arrays that is merging and compares the elements of
  each array and inserts it into the new array if it less than the element of
  the other array. It repeats this until all the individual arrays have merged 
  into one single array that is sorted. 
  ======================================*/

public class Mergesort
{
    /******************************************************
     * int[] merge(int[],int[])
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b )
    {
	int x = 0;
	int y = 0;
	int[] merged = new int[a.length + b.length];
	for(int i = 0; i < merged.length; i++){
	    if (x == a.length){
		merged[i] = b[y];
		y++;
	    }
	    else if (y == b.length){
		merged[i] = a[x];
		x++;
	    }
	    else if (a[x] <= b[y]){
		merged[i] = a[x];
		x++;
	    }
	    else{
		merged[i] = b[y];
		y++;
	    }
	}
	return merged;
    }//end merge()


    /******************************************************
     * int[] sort(int[])
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr )
    {
	int n = arr.length;
	if (n == 1)
	    return arr;
	else {
	    int[] a = new int[n/2];
	    int[] b = new int[n - n/2];
	    for (int i = 0; i < a.length; i++)
		a[i] = arr[i];
	    for (int i = 0; i < b.length; i++)
		b[i] = arr[i + n/2];
	    return merge(sort(a), sort(b));
	}
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {

	  int[] arr0 = {0};
	  int[] arr1 = {1};
	  int[] arr2 = {1,2};
	  int[] arr3 = {3,4};
	  int[] arr4 = {1,2,3,4};
	  int[] arr5 = {4,3,2,1};
	  int[] arr6 = {9,42,17,63,0,512,23};
	  int[] arr7 = {9,42,17,63,0,9,512,23,9};

	  System.out.println("\nTesting mess-with-array method...");
	  printArray( arr3 );
	  mess(arr3);
	  printArray( arr3 );

	  System.out.println("\nMerging arr1 and arr0: ");
	  printArray( merge(arr1,arr0) );

	  System.out.println("\nMerging arr2 and arr4: ");
	  printArray( merge(arr2,arr4) );

	  System.out.println("\nSorting arr4-7...");
	  printArray( sort( arr4 ) );
	  printArray( sort( arr5 ) );
	  printArray( sort( arr6 ) );
	  printArray( sort( arr7 ) );
	  /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort
