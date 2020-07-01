package wrapper;
/*Definition:
 //Wrapper class in java provides the mechanism to convert primitive into object and object into primitive
  * wrapper class is immutable.
  * Java Wrapper classes are supposed to be immutable. This means that once an object is being created,its value cannot be changed. e.g., 
Integer i = new Integer(5);

USE OF Wrapper class:
  
  
Mainly due to the following two reasons:
1. Convert primitive types to Objects. 
Typical application would be in Collections. 
Suppose you have to create an ArrayList of integers, you can't use ArrayList<int>. You have to use ArrayList<Integer> and then add numbers such as 1,2,3 etc. The Integer here wraps the values and converte them to an object.
Secondly, Collection classes only work on Objects so you are bound to use Wrappers there.
2. Convert primitive values to String and vice-versa.
All wrapper classes provide utility methods to convert String values to primitives and vice-versa. 
Suppose you have this:
String number="24";
And you require it as integer value(say, for addition operation), you can easily use Integer.parseInt(number) to get 24 as integer. 
To convert 24 to "24" you can use new Integer(24).toString()


  //Important note: The primitive data type values will be stored in Stack Memory whereas
   //                          wrapper class objects (like any other java objects) are stored in Heap Memory.

  Since J2SE 5.0,
Autoboxing  converts primitive into object and
Unboxing convert object into primitive automatically. The automatic conversion of primitive into object is known and autoboxing and vice-versa unboxing.
You can directly assign the primitive as an object of wrapper class.
  Integer i=10;
  
  
 The list of eight wrapper classes are given below:
All this wrapper classes are available in java.lang package
Below table lists wrapper classes in Java API with constructor details.

Primitive Type                          Wrapper class                                          Constructor Argument

boolean                                        Boolean                                                       boolean or String 
byte                                             Byte                                                              byte or String 
char                                            Character                                                           char 
int                                               Integer                                                            int or String  
float                                            Float                                                            float,double or String  
double                                        Double                                                            double or String  
long                                            Long                                                                 long or String  
short                                          Short                                                                  short or String



The most common methods of the Integer wrapper class are summarized in below table. 
Similar methods for the other wrapper classes are found in the Java API documentation. 


Method                                                                             Purpose

parseInt(s)                                               returns a signed decimal integer value equivalent to string s 
toString(i)                                                returns a new String object representing the integer i 
byteValue()                                               returns the value of this Integer as a byte 
doubleValue()                                           returns the value of this Integer as an double 
floatValue()                                              returns the value of this Integer as a float 
intValue()                                                 returns the value of this Integer as an int 
shortValue()                                             returns the value of this Integer as a short 
longValue()                                               returns the value of this Integer as a long 

int compareTo(int i)                                 Compares the numerical value of the invoking object with that of i. 
                                                                   Returns 0 if the values are equal. 
                                                                   Returns a negative value if the invoking object has a lower value. 
                                                                   Returns a positive value if the invoking object has a greater value. 
                                                                   
static int compare(int num1, int num2)      Compares the values of num1 and num2. 
                                                                    Returns 0 if the values are equal. 
                                                                    Returns a negative value if num1 is less than num2. 
                                                                    Returns a positive value if num1 is greater than num2. 
                                                                    
boolean equals(Object intObj)                       Returns true if the invoking Integer object is equivalent to intObj.
                                                                     Otherwise, it returns false. 

 */

/*Now if you want to store an integer as an object type you can write it as
  Integer i=new Integer(10);
   This is known as Boxing, converting a primitive type into an object.
     Now to get that integer value back,
 int a=i.intValue();
This operation is known as Unboxing converting the value of a wrapper class object into a primitive type.

After java 1.5/5 Boxing and Unboxing became automatic. You can directly assign the primitive as an object of wrapper class.
  Integer i=10;

 */
