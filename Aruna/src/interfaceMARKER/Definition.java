/*What is marker or tagged interface?
//An interface that have no member(no methods & fields)(Empty interface) is known as marker or tagged interface. 
For example: Serializable, Cloneable, Remote etc.(BUILT-IN MARKERS) , there are few other tag interfaces as well
They are used to provide some essential information to the JVM so that JVM may perform some useful operation.

Marker interfaces give instructions to JVM that classes implementing them will have special behavior and must be handled with care

//How Serializable interface is written?  
 
public interface Serializable//this serializable interface(Empty interface)
{  
}  */
/*                                 User Defined Marker Interfaces :
 
 * You can define your own marker interfaces to indicate about any special behavior*/
 

/*Java’s built-in Marker Interfaces :
These are some built-in marker interfaces in java which are used to mark some special behavior of a class.
1) java.lang.Cloneable Interface :
This interface is used to mark the cloning operation.
 An object of a class which implements Cloneable interface is eligible for field-by-field copying of an object.
 
2) java.io.Serializable Interface :
This interface is used to mark serialization and deserialization of an object.
     Serialization is a process in which an object state is read from memory and written into a file or a database.
 Deserialization is a process in which an object state is read from a file or a database and written back into memory. 
 Any class which wants it’s object to be eligible for serialization and deserialization must implement Serializable interface.
 
 3) java.util.EventListener :
This is also a marker interface which must be extended by all event listener interfaces.
 * 
 This is also a marker interface which is used to mark the invocation of a method remotely. 
 Only methods of those classes which implement Remote interface are eligible for invocation by non-local virtual machine. 
 * 
 * */
