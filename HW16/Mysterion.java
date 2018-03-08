//Stefan Tan
//APCS2 pd1
//HW16 -- About Face
//2018-03-07

/*
It makes an reversed array of ints into an ordered array of ints
arr is the array of integers that is reversed
a is the min index which is always 0
b is the max index which is arr.length - 1
c is the middle number
*/

public class Mysterion{

    public static int mysterion(int[] arr, int a, int b, int c){
	int v = arr[c];
	arr[c] = arr[b];
	arr[b] = v;
	int s = a;
	for (int i = a; i < b; i++){
	    if (arr[i] < v){
		int temp = arr[s];
		arr[s] = arr[i];
		arr[i] = temp;
		s++;
	    }
	}
	int temp = arr[b];
	arr[b] = arr[s];
	arr[s] = temp;
	return s;
    }
    
    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    
    public static void main(String[] args){
	int[] arr0 = {7,1,5,12,3};
	int[] arr1 = {9,42,17,63,0,23};
	int[] arr2 = {1,2,3,4};
	int[] arr3 = {4,3,2,1};

	printArray(arr0);
	mysterion(arr0,0,4,2);
	printArray(arr0);

	printArray(arr1);
	mysterion(arr1,0,5,3);
	printArray(arr1);

	printArray(arr2);
	mysterion(arr2,0,3,1);
	printArray(arr2);

	printArray(arr3);
	mysterion(arr3,0,3,1);
	printArray(arr3);
	
    }
}
