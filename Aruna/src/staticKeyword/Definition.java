/*Static keyword is  mainly used for MEMORY MANAGEMENT
 * static means that it is associated with the CLASS and not with the instances.(Object)
 * i.e., there will be only one copy for each class and not one copy for each object of the class 
 * we can directly access through CLASSNAME no need to cretae an object for static fields,methods,blocks,nested classes.
 * Static keyword can be:
 * Variables
 * Methods
 *Block:Static block is Executed the main method
 *            adv:
 *            It's executed when the class is loaded and a good place to put initialization of static variables. 
 *              A class can have any number of static initialization blocks, and they can appear anywhere in the class body.
 * Nestedclasses
 * 
 * Note that Static Methods cannot access instance variables. They can access only static variables. 
 * 
 * Advantage of static variable
It makes your program memory efficient (i.e it saves memory).

The advantage of 
private static methods is that they can be reused later if you need to reinitialize the class variable.
 So, you kind of get more flexibility with a private static method in comparison to the corresponding static initialization block. 
 This should not mislead that a 'public' static method can't do the same.
 But, we are talking about a way of initializing a class variable and there is hardly any reason to make such a method 'public'. 

Restrictions for static method

There are 2  main restrictions for the static method. They are:

The static method can not use non static data member or call non-static method directly.
this and super cannot be used in static context.

class A{  
 int a=40;//non static  
   
 public static void main(String args[]){  
  System.out.println(a);  //non-static members cannot call directly it givescompile time error
 }  
}        
 * */
