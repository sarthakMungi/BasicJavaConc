// the Thread class 
class MultithreadingDemo extends Thread 
{ 
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  
// Main Class 
public class Multithread 
{ 
    public static void main(String[] args) 
    { 
        int n = 8; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
            MultithreadingDemo object = new MultithreadingDemo(); 
            object.start(); 
        } 
    } 
} 


// the Runnable Interface 
class MultithreadingDemo implements Runnable 
{ 
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + 
                                Thread.currentThread().getId() + 
                                " is running"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  
// Main Class 
class Multithread 
{ 
    public static void main(String[] args) 
    { 
        int n = 8; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
            Thread object = new Thread(new MultithreadingDemo()); 
            object.start(); 
        } 
    } 
} 



import java.util.ArrayList; 
class Autoboxing 
{ 
    public static void main(String[] args) 
    { 
        char ch = 'a'; 
  
        // Autoboxing- primitive to Character object conversion 
        Character a = ch; 
  
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
  
        // Autoboxing because ArrayList stores only objects 
        arrayList.add(25); 
  
        // printing the values from object 
        System.out.println(arrayList.get(0)); 
    } 
} 



// Java program to demonstrate Unboxing 
import java.util.ArrayList; 
  
class Unboxing 
{ 
    public static void main(String[] args) 
    { 
        Character ch = 'a'; 
  
        // unboxing - Character object to primitive conversion 
        char a = ch; 
  
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
        arrayList.add(24); 
  
        // unboxing because get method returns an Integer object 
        int num = arrayList.get(0); 
  
        // printing the values from primitive data types 
        System.out.println(num); 
    } 
} 

// Java program to demonstrate Wrapping and UnWrapping 
// in Java Classes 
class WrappingUnwrapping 
{ 
    public static void main(String args[]) 
    { 
        //  byte data type 
        byte a = 1; 
  
        // wrapping around Byte object 
        Byte byteobj = new Byte(a); 
  
        // int data type 
        int b = 10; 
  
        //wrapping around Integer object 
        Integer intobj = new Integer(b); 
  
        // float data type 
        float c = 18.6f; 
  
        // wrapping around Float object 
        Float floatobj = new Float(c); 
  
        // double data type 
        double d = 250.5; 
  
        // Wrapping around Double object 
        Double doubleobj = new Double(d); 
  
        // char data type 
        char e='a'; 
  
        // wrapping around Character object 
        Character charobj=e; 
  
        //  printing the values from objects 
        System.out.println("Values of Wrapper objects (printing as objects)"); 
        System.out.println("Byte object byteobj:  " + byteobj); 
        System.out.println("Integer object intobj:  " + intobj); 
        System.out.println("Float object floatobj:  " + floatobj); 
        System.out.println("Double object doubleobj:  " + doubleobj); 
        System.out.println("Character object charobj:  " + charobj); 
  
        // objects to data types (retrieving data types from objects) 
        // unwrapping objects to primitive data types 
        byte bv = byteobj; 
        int iv = intobj; 
        float fv = floatobj; 
        double dv = doubleobj; 
        char cv = charobj; 
  
        // printing the values from data types 
        System.out.println("Unwrapped values (printing as data types)"); 
        System.out.println("byte value, bv: " + bv); 
        System.out.println("int value, iv: " + iv); 
        System.out.println("float value, fv: " + fv); 
        System.out.println("double value, dv: " + dv); 
        System.out.println("char value, cv: " + cv); 
    } 
} 