package loops;
//Enhanced for loop is useful when scanning the array instead of using for loop. 
//Syntax of enhanced for loop is:
//for (data_type variable: array_name) //Here the variable name & arrayname same data type.
public class EnchancedForLoop 
{
public static void main(String[] args) 
{
String[] names={ "Java","mainframe","PHP","JavaScript"};
System.out.println("Courses Are:");

for(String course:names)//this is enchanced for loop. Here course & names have same data type String print word by word
{
	System.out.println(course);
	}
	}

}
