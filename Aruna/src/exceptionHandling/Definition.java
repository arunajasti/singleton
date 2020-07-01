/*Exception is a problem that arises during execution of program and
 *  interrupts the normal flow of program/Application terminates abnormally, 
    which is not recommended, therefore, these exceptions are to be handled.
 *
 * Types of exceptions
There are 2 types of exceptions
1)Checked exceptions: compiler checks during compilation
2)Unchecked exceptions:Runtime exceptions
 * 
 * 
 *  Checked exceptions :
 compiler checks them during compilation to see whether the programmer has handled them or not. 
 If these exceptions are not handled/declared in the program, it will give compilation error.
Examples of Checked Exceptions :-
ClassNotFoundException:file is to be opened,but the file cannot be found,an class not found/file not found exception occurs
IllegalAccessException
NoSuchFieldException
 EOFException (End of File)etc. * 
 
 Unchecked Exceptions
Runtime Exceptions are also known as Unchecked Exceptions as the 
compiler do not check whether the programmer has handled them or not but it’s the duty of the programmer to handle these exceptions and provide a safe exit.
These exceptions need not be included in any method’s throws list because compiler does not check to see if a method handles or throws these exceptions.
Examples of Unchecked Exceptions:-
ArithmeticException
ArrayIndexOutOfBoundsException
NullPointerException
NegativeArraySizeException etc.
 * */
 