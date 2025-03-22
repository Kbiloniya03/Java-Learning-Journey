//1. Boiler Plate Code of Java

public class JavaBasics {
    public static void main(String args[]) {
      
    }
}

//2. Output in Java

public class JavaBasics {
    public static void main(String args[]) {
      System.out.print("Hello World");
      //or
      System.out.println("Hello World");
    }
}

//3. Varible in Java

public class JavaBasics {
    public static void main(String args[]) {
        
        String name = "Kapil";
        int cgps = 9.9;
        System.out.print(name, "cgpa is ", cgpa);
    }
}

//5. Input in Java

//Import Java's util class all method
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        //Using sccanner class with new keyword and System.in for input
        Scanner sc = new Scanner(System.in);
        //In this line sc is obj with next method that store value in input variable
        String input = sc.next();
        //Printing input variable
        System.out.print(input);
    }
}

//5.1 There are many more method like next in java's util class

// nextLine();

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.print(input);
    }
}

// nextInt();

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.print(input);
    }
}

// nextByte();

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        byte input = sc.nextByte();
        System.out.print(input);
    }
}

// nextFloat();

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();
        System.out.print(input);
    }
}

// nextDouble();

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        System.out.print(input);
    }
}

// nextBoolean();

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean input = sc.nextBoolean();
        System.out.print(input);
    }
}

// nextShort();

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        short input = sc.nextShort();
        System.out.print(input);
    }
}

// nextLong();

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        System.out.print(input);
    }
}

// 6.1 Example

public class JavaBasics {
    public static void main(String args[]) {
        int a = 25;
        long b = a;
        System.out.print(b);
    }
}

// 6.2 Example

public class JavaBasics {
    public static void main(String args[]) {
        long a = 25;
        int b = a;
        System.out.print(b);
    }
}


// 7.1 Example

public class JavaBasics {
    public static void main(String args[]) {
        long a = 25;
        int b = (int) a;
        System.out.print(b);
    }
}

// 8.1 Example

public class JavaBasics {
    public static void main(String args[]) {
        char a = 'a';
        short b = 50;
        int sum = a + b;
        System.out.print(sum);
    }
}

// 8.2 Example


public class JavaBasics {
    public static void main(String args[]) {

        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double sum = a + b + c + d;
        System.out.print(sum);
        
    }
}

// 9. Operators in Java

//Arithmetic Binary Operators

// a. Addition (+)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.print("Addition =" + (a + b));
    }
}

// b. Subtraction (-)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.print("Subtraction =" + (a - b));
    }
}

// c. Multiplication (*)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.print("Multiplication =" + (a * b));
    }
}

// d. Division (/)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.print("Division =" + (a / b));
    }
}

// e. Modulus (%))

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.print("Modulus =" + (a % b));
    }
}

//Arithmetic Unary Operators

// a. Increment (++)
// Post Increment

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        System.out.println("Post Increment = " + (a++));
        System.out.println("Post Increment = " + (a++));
    }
}


// Pre Increment

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        System.out.println("Pre Increment = " + (++a));
        System.out.println("Pre Increment = " + (++a));
    }
}


// b. Decrement (--)
// Post Decrement

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        System.out.println("Post Decrement = " + (a--));
        System.out.println("Post Decrement = " + (a--));
    }
}

// Pre Decrement

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        System.out.println("Pre Decrement = " + (--a));
        System.out.println("Pre Decrement = " + (--a));
    }
}


// Relational Operators (Aka Comparison Operators)

// Equal to (==)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 20;
        int b = 30;
        System.out.print("A is equal to B ? " + (a == b));
    }
}

// Not Equal to (!=)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 20;
        int b = 30;
        System.out.print("A is not equal to B ? " + (a != b));
    }
}

// Greater than (>)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 20;
        int b = 30;
        System.out.print("A is greater than B ? " + (a > b));
    }
}

// Greater than equal to (>=)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 20;
        int b = 30;
        System.out.print("A is greater than equal to B ? " + (a >= b));
    }
}

// Less than (<)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 20;
        int b = 30;
        System.out.print("A is less than B ? " + (a < b));
    }
}

// Less than equal to (<=)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 20;
        int b = 30;
        System.out.print("A is less than equal to B ? " + (a <= b));
    }
}

// Logical Operators

// Logical AND (&&)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 2;
        boolean cond1 = (a > b); //true
        boolean cond2 = (a % b == 0); //true
        System.out.print((cond1) && (cond2));
    }
}

// Logical OR (||)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 8;
        boolean cond1 = (a > b); //true
        boolean cond2 = (a % b == 0); //false
        System.out.print((cond1) || (cond2));
    }
}

// Logical NOT (!)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 2;
        boolean cond1 = (a > b); //true
        boolean cond2 = (a % b == 0); //true
        System.out.print(!(cond1) && (cond2)); 
    }
}

// Assignment Operators

// Simple Assignment (=)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 3;
        System.out.print((a , b));
    }
}

// Add and assign (+=)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 3;
        System.out.print((a += b));
    }
}

// Subtract and assign (-=)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 3;
        System.out.print((a -= b));
    }
}

// Multiply and assign (*=)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 3;
        System.out.print((a *= b));
    }
}

// Divide and assign (/=)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 3;
        System.out.print((a /= b));
    }
}

// Modulus and assign (%=)

public class JavaBasics {
    public static void main(String args[]) {
        int a = 10;
        int b = 3;
        System.out.print((a %= b));
    }
}

