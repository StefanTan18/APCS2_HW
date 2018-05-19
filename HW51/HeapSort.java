//Stefan Tan
//APCS2 pd1
//HW51 -- Heaping Piles of Sordidness
//2018-05-18

public class HeapSort
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }
    
    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }

    //heapify method to restore heap property 
    public static void heapify(int[] d, int i, int size) {
	int left = i*2 + 1;
	int right = i*2 + 2;
	int max;
	if (left <= size && d[left] > d[i])
	    max = left;
	else {
	    max = i;
		}
	if (right <= size && d[right] > d[max])
	    max = right;
	if (max != i){
	    swap (i, max, d);
	    heapify(d, max, size);
	}
    }
	    
    /*****************************************************
     * void hsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void hsort( int[] d ){
	for (int i = (d.length - 1)/2; i >= 0; i--)
	    heapify(d, i, d.length - 1);
	int len = d.length - 1;
	for (int i = len; i > 0; i--){
	    swap(0, i, d);
	    len -= 1;
	    heapify(d,0,len);
	}
    }
    
    //main method for testing
    public static void main( String[] args )
    {
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);
   
	hsort( arr1 );	
	System.out.println("arr1 after hsort: " );
	printArr(arr1);

	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

	shuffle(arrN);
	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	hsort( arrN );
	System.out.println("arrN after hsort: " );
	printArr(arrN);
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	hsort( arr2 );	
	System.out.println("arr2 after hsort: " );
	printArr(arr2);
 

	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);

	shuffle(arrMatey);
	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);

	hsort( arrMatey );
	System.out.println("arrMatey after hsort: " );
	printArr(arrMatey);
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}// end class HeapSort
