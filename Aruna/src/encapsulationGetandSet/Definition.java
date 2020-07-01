/*Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
 * wrapping the code and data together 
 
In encapsulation, the(private) variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. 
Therefore, it is also known as data hiding.
To achieve encapsulation in Java 
Declare the variables of a class as private.
Provide public setter and getter methods to modify and view the variables values.

*all the 4 data members (or data fields) are private which cannot be accessed directly.
* These fields can be accessed via public methods only.
*  Fields rollno, firstname,lastname and address are made hidden data fields using encapsulation technique of OOPs.
*
*Getters, or accessors, are methods that provide access to an object's instance variables
*
*Setters, or mutators, are methods that provider the caller with an opportunity to Update the value of a particular instance variable.
*
*The fields can be made read-only (If we don’t define setter methods in the class) or 
*write-only (If we don’t define the getter methods in the class). For e.g.
* 
*If we have a field(or variable) which doesn’t need to change at any cost then we simply define the variable as private and
* instead of set and get both we just need to define the get method for that variable. 
*Since the set method is not present there is no way an outside class can modify the value of that field.*/