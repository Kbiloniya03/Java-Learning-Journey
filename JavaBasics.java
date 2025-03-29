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

// 10. Conditional Statements

// a. if-else

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age >= 18) {
            System.out.print("You can vote");
        } else {
            System.out.print("You can't vote");
        }

    }
}

// b. else-if 

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age < 18) {
            System.out.print("You are Teenager");
        } 
        else if (age >= 18 && age <= 60){
            System.out.print("You are Adult");
        } 
        else {
            System.out.print("You are Senior Citizen");
        }

    }
}

// c. Ternary Operators

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = (marks >= 33) ? "Pass in this subject" : "Fail in this subject";
        System.out.print(result);

    }
}

// d. switch statement
/*
A switch statement is used to excecute one block of code out of many options, based on the value of variable
*/

public class JavaBasics {
    public static void main(String[] args) {
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}


//Practice Problem for Switch
//Create calculator using Binary operators

//Solution

import java.util.*;

public class JavaPractice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' :
                System.out.println("Sum of a + b is " + (a+b));
                break;
            case '-' :
                System.out.println("Sub of a - b is " + (a-b));
                break;
            case '*' :
                System.out.println("Mul of a * b is " + (a*b));
                break;
            case '/' :
                System.out.println("Div of a / b is " + (a/b));
                break;
            case '%' :
                System.out.println("Mod of a % b is " + (a%b));
                break;
            default :
                System.out.println("Use only Binary Arithmetic Operators");
        }
    }
}

// 11. Loops (Flow Control)
// a. While Loop

public class JavaBasics {
    public static void main(String args[]) {
        int counter = 0;
        while(counter < 10){
            System.out.println("Hello World");
            counter++;
        }

        System.out.println("Printed Hello World 10 Times");
    }
}

// b. For Loop

public class JavaBasics {
    public static void main(String args[]) {
       for(int i = 0; i < 10; i++){
        System.out.println("Hello World");
       }
    }
}

// Print a reverse no
// Using while loop

public class JavaBasics {
    public static void main(String args[]) {
       
       int n = 99801;
       while(n > 0){
        int lastDigit = n%10;
        System.out.print(lastDigit);
        n = n / 10;
        
       }
    }
}

// Using for loop

public class JavaBasics {
    public static void main(String args[]) {
       
      for(int n = 99801; n > 0; n/=10){
        int lastDigit = n%10;
        System.out.print(lastDigit);
      }

    }
}

// Now create new varible with reverse number

public class JavaBasics {
    public static void main(String args[]) {
       
        int n = 10899;
        int reverse = 0;
        while(n > 0){
            int lastDigit = n%10;
            reverse = (reverse * 10) + lastDigit;
            n/=10;
        }

        System.out.print(reverse);
        
    }
}

// c. Do While Loop

public class JavaBasics {
    public static void main(String args[]) {
       
    int counter = 0;
    do{
        System.out.println("Hello World");
        counter++;
    } while(counter < 10);

    }
}

// d. Break statement

public class JavaBasics {
    public static void main(String args[]) {
       
    for(int i = 0; i < 5; i++){
        if(i == 3){
            break;
        }
        System.out.println(i);
    }

        System.out.print("Exit loop when condition met");

    }
}

// e. Continue statement

    public class JavaBasics {
        public static void main(String args[]) {  

        for(int i=1; i<=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);

        }
        }
    }

// Check if number is prime or not

// 1. if i <= Math.sqrt(n)

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
            System.out.print("Prime Number");
        } 
        else{
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.print("Is Prime Number");
            }
            else{
                System.out.print("Is Not Prime Number");
            }
        }
        

    }
}

// 2. if i <= n-1

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
            System.out.print("Prime Number");
        } 
        else{
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n%i == 0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.print("Is Prime Number");
            }
            else{
                System.out.print("Is Not Prime Number");
            }
        }
        

    }
}

// PRACTICE PROBLEMS NESTED LOOPS
// PRINT STAR PATTERNS
/*

*
**
***
****

*/

public class JavaBasics {
    public static void main(String args[]) {

        for(int lines = 1; lines <= 4; lines++){
            for(int star = 1; star <= lines; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


// INVERTED STAR PATTERNS
/*

****
***
**
*

*/

public class JavaBasics {
    public static void main(String args[]) {

        int n = 4;
        for(int lines = 1; lines <= n; lines++){
            for(int star = n; star >= lines; star--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// PRINT HALF-PYRAMID PATTERN

/*
1
1 2
1 2 3 
1 2 3 4
*/

public class JavaBasics {
    public static void main(String args[]) {

    int n = 4;
    for(int line = 1; line <= n; line++){
        for(int num = 1; num <= line; num++){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    }
}

/*
1 2 3 4
1 2 3
1 2 
1
*/

public class JavaBasics{
    public static void main(String args[]) {
        int n = 4;
        for(int line = n; line >= 1; line--){
            for(int num = 1; num <= line; num++){
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}



// PRINT CHARACTER PATTERN

/*
A
B C
D E F
G H I J
*/ 

public class JavaBasics {
    public static void main(String args[]) {
       
       int n = 4;
       char ch = 'A';
       for(int line = 1; line <= n; line++){
            for(int chars = 1; chars <= line; chars++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
       }

    }
}

// PRACTICE PROBLEMS
// 1. FLOYD'S TRIANGEL PATTERN

public class JavaBasics {
    public static void main(String args[]) {
        int n = 5;
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

// 2. PYRAMID PATTERN

public class JavaBasics{
    public static void main(String args[]){
       
       int rows = 8;
       for(int line = 1; line <= rows; line++){
            for(int space = 1; space <= rows - line; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= (2*line - 1); star++){
                System.out.print("*");
            }
            System.out.println();
       }

    }
}

//OR ANOTHER PYRAMID

public class JavaBasics{
    public static void main(String args[]){
       
        int rows = 5;
        for(int line = 1; line <= rows; line++){
            for(int space = 1; space <= rows - line; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= line; star++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

// 3. INVERTED & ROTATED HALF-PYRAMID PATTERN

public class JavaBasics{
    public static void main(String args[]){
       
       int rows = 4;
       for(int line = 1; line <= rows; line++){
            for(int space = 1; space <= rows - line; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= line; star++){
                System.out.print("*");
            }
            System.out.println();
       }
       

    }
}

// 4. INVERTED HALF-PYRAMID WITH NUMBER PATTERN

public class JavaBasics{
    public static void main(String args[]){
       
        int rows = 5;
        for(int line = 1; line <= rows; line++){
            for(int num = 1; num <= rows - line + 1; num++){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}

// 5. NUMBER PYRAMID PATTERN

public class JavaBasics{
    public static void main(String args[]){
       
        int rows = 5;
        int num = 1;
        for(int line = 1; line <= rows; line++){
            for(int space = 1; space <= rows - line; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= line; star++){
                System.out.print(line + " ");
            }
            System.out.println();
        }

    }
}

// 6. SOLID ROMBUS PATTERN

public class JavaBasics{
    public static void main(String args[]){
       
        int rows = 5;
        for(int line = 1; line <= rows; line++){
            for(int space = 1; space <= rows - line; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= rows; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// 7. HOLLOW RECTANGLE PATTERN

public class JavaBasics{
    public static void main(String args[]){
       
        int n = 4;      
        int m = 5;      
        for(int l = 1; l <= n; l++){
            for(int s = 1; s <= m; s++){
                if(l == 1 || s == 1 || l == n || s == m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}

// 8. HOLLOW ROMBUS PATTERN

