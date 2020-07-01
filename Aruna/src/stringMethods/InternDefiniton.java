/*It returns the canonical representation of string.
 * The most common methods for String comparison are the equals() and equalsIgnoreCase() methods. 
 * However, these methods may need large amount of memory for large sequence of characters.
 *  The Java String intern() method helps us to improve the performance of the comparison between two Strings.
 * 
 * String.intern() method can be used to to deal with String duplication problem in Java. 
 * By carefully using the intern() method you can save a lot of memories consumed by duplicate String instances.

Keep in mind, that Java automatically interns String literals. 
String s1="java code";// here we don't use intern() for string literals

This means that the intern() method is to be used on Strings that are constructed with new String().
String s1=new String("Java code").intern();//weuse intern() method for creating the string with new keyword
 * 
 * 
 * */
 