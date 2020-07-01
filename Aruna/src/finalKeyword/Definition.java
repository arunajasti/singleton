/*Final can be:
 * Variable
 * Method
 * Class
 * 
 * 1)Final Variable -->final  x=100;
 * if Variable declared as Final you cannot the change the value of final variable.(It will be constant)
 * 
 * Final Variable is not initialized at the time of declaration it is called Blank Final Variable (or) Uninitialized Final Variable
 * It can be initialized in the Constructor only.
 * 
 * The Blank Final Variable can be static also which will be initialized in the Static Block Only.
 * 
 * static fields can only belong to a Class,
 * A static variable or a final static variable can never be declared inside a method neither inside a static method nor inside an instance method. Why?
The following segment of code accordingly, will not be compiled and an compile-time error will be issued by the compiler, if an attempt is made to compile it.
public static void main(String args[])
{
    final int a=0;  //ok

    int b=1;  //ok

    static int c=2;  //wrong

    final static int x=0;  //wrong
}
 * 
 * */
