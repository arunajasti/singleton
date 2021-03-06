/*Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. 
 * Abstract class and interface both can't be instantiated. but we can create reference variable for abstract and interface
 
But there are many differences between abstract class and interface that are given below.
Abstract class                                                                                                                                       Interface
1) Abstract class can have abstract and non-abstract methods.                                  Interface can have only abstract methods.
2) Abstract class doesn't support multiple inheritance.                                             Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.                Interface has only static and final variables.
4) Abstract class can have static methods, main method and constructor.                 Interface can't have static methods, main method or constructor.
5) Abstract class can provide the implementation of interface.                                  Interface can't provide the implementation of abstract class.
6) The abstract keyword is used to declare abstract class.                                           The interface keyword is used to declare interface.
7) Example:                                                                                                                  Example:
   public abstract class Shape                                                                                             public interface Drawable
   {                                                                                                                                     {
     public abstract void draw();                                                                                           void draw();                                              
      }                                                                                                                                    }
                                                                                                                                            
                                 
Simply, abstract class achieves partial abstraction (0 to 100%) whereas interface achieves fully abstraction (100%).*/