/*
Starts at the element at the bottom left and compare it to the number that is 
being searched for, x.
If x is greater than that element then compare it to the element to the right. 
If x is less than that element then compare it to the element one row above.
For every element you compare x - if x is greater than the elemnt, compare x to
the element on the right. If x is less than the element to the right, then 
compare x to to the element above.
Repeat that step until the element equals x.
*/

public class MatrixFinder{
    public static String alg(int[][] matrix, int n){
	int dims = matrix.length;
	int track = 0;
	for (int r = dims - 1; r >= 0; r--){
	    for (int x = track; x < dims; x++){
		if (n > matrix[r][x]){
		    
