package scanner;

/*There are various ways to read input from the keyboard, the java.util.Scanner class is one of them.

Java Scanner class extends Object class and implements Iterator and Closeable interfaces.
Class declaration

Following is the declaration for java.util.Scanner class:  java.util is package abd scanner is class.
public final class Scanner
   extends Object
   implements Iterator<String>
   
   
   Class Constructors

There are two constructors that are particularly useful: one takes an InputStream object as a parameter and the other 
takes a FileReader object as a parameter.

 

Scanner in = new Scanner(System.in);  // System.in is an InputStream

Scanner inFile = new Scanner(new FileReader("myFile"));

 

If the file myFile is not found, a FileNotFoundException is thrown. This is a checked exception, so it must be caught or forwarded by putting 
the phrase throws FileNotFoundException on the header of the method 
in which the instantiation occurs and the header of any method that calls the method in which the instantiation occurs.

Token: A unit of user input, as read by the Scanner.

Tokens are separated by whitespace(spaces, tabs, newlines).

How many tokens appear on the following line of input? 
23  John Smith   42.0 "Hello world"   $2.50   " 19"

The Scanner class uses various methods to read different data types of input from the keyboard

public String nextLine():Moves the scanner to the next line and returns the skipped input.
•public String next(): Returns the token before delimiter
•public byte nextByte(): Scans next token as byte value
•public short nextShort(): Scans next token as short value
•public int nextInt(): Scans next token as integer value
•public long nextLong(): Scans next token as long value
•public float nextFloat(): Scans next token as float value
•public double nextDouble(): Scans next token as double value
•void close: Scanner is closed

*/
