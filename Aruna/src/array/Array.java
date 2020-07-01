package array;
//http://javarevisited.blogspot.sg/2013/11/java-array-101-for-programmers-and.html
//An array is a container object that holds a fixed number of values of a same data type (single type). all the values in an array must be same type.
//The length of an array is established when the array is created. After creation, its length is fixed
//Each item in an array is called an element, and each element is accessed by its numerical index 
//a[0] a is element  0 is index.The index start with 0
//An int array can contain int values, for example, and a String array can contain strings.
//*arrays are an important structure to hold data. 
//It allows us to hold many objects of the same type, and more importantly, to use a for loop to access the elements by their index. 
public class Array 
{

	public static void main(String[] args ) 
	{
   // int num[]=new int[5];//creating array by specifying size
       int num[]={10,20,30,40,50};//creating and initializing array in same line.array size is 5.store the elements at time of declaration
       System.out.println("Length of array is: " +num.length);
      for(int i=0;i<num.length;i++)//i=0 means zero is index
    	 {
    	    System.out.println("print the values  "+num[i]);
    	//  System.out.println(" index: " + i +":"  +num[i]);//print the index number with value
      }
      
      }

}
