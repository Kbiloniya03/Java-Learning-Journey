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

public class JavaPractice {
    public static void main(String args[]) {
       
        int rows = 5;      // number of rows
        int columns = 5;   // number of columns
        for (int currentRow = 1; currentRow <= rows; currentRow++) {
            for (int space = 1; space <= rows - currentRow; space++) {
                System.out.print(" ");
            }
            for (int currentColumn = 1; currentColumn <= columns; currentColumn++) {
                if (currentRow == 1 || currentColumn == 1 || currentRow == rows || currentColumn == columns) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
        
    }
}

// 9. PALINDROME PATTERN WITH NUMBER

public class JavaBasics{
    public static void main(String args[]){
        int rows = 5;

        for(int line = 1; line <= rows; line++){

            for(int space = 1; space <= rows - line; space++){
                System.out.print("  ");
            }

            for(int num = line; num >= 1; num--){
                System.out.print(num + " ");
            }

             for(int num = 2; num <= line; num++){
                System.out.print(num + " ");                
            }
            
            System.out.println();
        }
    }
}

// 10. 0-1 TRIANGLE PATTERN

public class JavaBasics{
    public static void main(String args[]){
        
       int rows = 5;
       for(int line = 1; line <= rows; line++){
        for(int star = 1; star <= line; star++){
            if((line + star)%2 == 0){
            System.out.print("1");
            }
            else{
            System.out.print("0");
            }
        }
        System.out.println();
       }

    }
}

// 11. BUTTERFLY PATTERN

public class JavaBasics{
    public static void main(String args[]){
        int rows = 4;

        for(int line = 1; line <= rows; line++){

            for(int star = 1; star <= line; star++){
                System.out.print("* ");
            }

            for(int space = 1; space <= 2*(rows-line); space++){
                System.out.print("  ");
            }

            for(int star = 1; star <= line; star++){
                System.out.print("* ");
            }

            System.out.println();
        }

            for(int line = rows; line >= 1; line--){

            for(int star = 1; star <= line; star++){
                System.out.print("* ");
            }

            for(int space = 1; space <= 2*(rows-line); space++){
                System.out.print("  ");
            }

            for(int star = 1; star <= line; star++){
                System.out.print("* ");
            }

            System.out.println();
        }
        
    }
}

// 12. DIAMOND PATTERN
// a.

public class JavaBasics{
    public static void main(String args[]){
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

         for(int i = rows - 1; i >= 1; i--){
            for(int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// b.

public class JavaBasics{
    public static void main(String args[]){
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows - i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }

         for(int i = rows - 1; i >= 1; i--){
            for(int j = 1; j <= rows - i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// FUNCTION & METHODS
// a. Basic Function syntax how its work

public class JavaBasics{
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void main(String args[]){
        printHelloWorld();
    }
}

// b. Syntax with parameter and sum of a & b

import java.util.*;

public class JavaBasics{
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:- ");
        int a = sc.nextInt();
        System.out.print("Enter second number:- ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.print("Sum is " + sum);
    }
}

// c. Call by value

public class JavaBasics{
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        
        swap(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

// d. Product of a & b

import java.util.*;

public class JavaBasics{
    public static int product(int a, int b){
        int pro = a * b;
        return pro;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int a = sc.nextInt();
        System.out.print("Enter second number:- ");
        int b = sc.nextInt();

        int pro = product(a, b);
        System.out.print("Product is " + pro);

    }
}

// e. Factorial of n number

import java.util.*;

public class JavaBasics{
    public static int factorial(int n){

        if(n < 0){
            System.out.print("For factorial enter postive no !");
            return -1;
        }

        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int a = sc.nextInt();
        int fact = factorial(a);

        if(fact != -1){
            System.out.println("Factorial of " + a + " is " + fact);
        }
    }
}

// f. Find Binomial Cofficient


public class JavaBasics{
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static int binoCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binoCoeff = fact_n/(fact_r*fact_nmr);

        return binoCoeff;
    }

    public static void main(String args[]){
        System.out.print(binoCoeff(10, 5));
    }
}

// Function Overloading Using Parameters

public class JavaBasics{
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String args[]){
        System.out.println("Sum of 2 No:- " + sum(5, 3));
        System.out.println("Sum of 3 No:- " + sum(5, 2, 1));
    }
}

// Function Overloading Using Datatypes

public class JavaBasics{
    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String args[]){
        System.out.println(sum(5, 3));
        System.out.println(sum(3.2f, 4.8f));
    }
}

// Create a function to check if it is prime no or not

import java.util.*;

public class JavaBasics {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        if (n == 2) return true; // 2 is prime
        if (n % 2 == 0) return false; // Even numbers > 2 are not prime

        // Loop from 2 to √n for efficiency
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }

        return true; // No divisors found, it's prime
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}

// Prime number in range

import java.util.*;

public class JavaPractice{
    public static boolean isPrime(int n){
        if(n == 2) return true;
        if(n <= 1) return false;
        if(n % 2 == 0) return false;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void primeInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number:- ");
        int n = sc.nextInt();
        primeInRange(n);
    }
}

// Binary to Decimal

import java.util.*;

public class JavaBasics{
    public static void binToDec(int n){
        int power = 0;
        int decimal = 0;

        for(int i = n; i > 0; i /= 10){
            int lastDigit = i % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, power));
            power++;
        }

        System.out.print(n + " Binary Num Decimal is " + decimal);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Binary Number:- ");
        int n = sc.nextInt();
        binToDec(n);
    }
}

// Decimal to Binary

import java.util.*;

public class JavaBasics{
    public static void decToBin(int n){
        int power = 0;
        int binary = 0;

        for(int i = n; i > 0; i/=2){
            int lastDigit = i % 2;
            binary = binary + (lastDigit * (int) Math.pow(10, power));
            power++;
        }

        System.out.print("Binary no of " + n + " is " + binary);

    }
    public static void main(String args[]){
      int decimalNo = 11;
      decToBin(decimalNo);

    }
}

// PRACTICE QUESTIONS
// 1. WRITE A JAVA METHOD TO COMPUTE THE AVERAGE OF THREE NUMBERS.

import java.util.*;

public class JavaBasics{
    public static void average(double a, double b, double c){
        double avg = (a + b + c)/3;
        System.out.println("Average of " + a + " " + b + " " + c + " = " + avg);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        double a = sc.nextDouble();
        System.out.print("Enter second number:- ");
        double b = sc.nextDouble();
        System.out.print("Enter third number:- ");
        double c = sc.nextDouble();

        average(a, b, c);
    }
}

// 2. Write a method named isEven that accepts an int argument.The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

import java.util.*;

public class JavaBasics{
    public static boolean isEven(int n){
      if(n % 2 == 0){
        return true;
      }
      else{
        return false;
      }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int n = sc.nextInt();

        if(isEven(n)){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
}

// 3. Write a program to check if number is Palindrome or not.

import java.util.*;

public class JavaBasics{
    public static void isPalindrome(int n){
        int num = n;
        int rev = 0;

        for(int i = n; i > 0; i/=10){
            int lastDigit = i % 10;
            rev = (rev * 10) + lastDigit;
        }

        if(num == rev){
            System.out.print(n + " is Palindorme Number.");
        }
        else{
            System.out.print(n + " is Not Palindorme Number.");
        }
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int n = sc.nextInt();

        isPalindrome(n);
    }
}

// More Patterns Inside Functions

public class JavaPractice{
    public static void hollow_square_with_cross(int n){
        //1st Half
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=n; j++){
                if((i == j)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            for(int j = n-1; j >= 1; j--){
                 if((i == j)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println();
        }

        //2nd Half
        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <=n; j++){
                if((i == j)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            for(int j = n-1; j >= 1; j--){
                 if((i == j)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
    }

    public static void hour_glass(int n, int m){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                
                if(i == j || i == 1 || i+j == m+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <= m; j++){
                
                if(i == j || i == 1 || i+j == m+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        int n = 5;
        int m = 9;
        // hollow_square_with_cross(n);
        // hour_glass(n, m);
    }
}


// ARRAYS IN JAVA

import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Creating Array
        int marks[] = new int[3];

        // Taking Input 
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // Output
        System.out.println("Marks before updation");
        System.out.print(marks[0] + " ");
        System.out.print(marks[1] + " ");
        System.out.println(marks[2] + " ");

        //Updation of Array
        marks[0] = marks[0] + 5;
        marks[1] = marks[1] + 5;
        marks[2] = marks[2] + 5;

        System.out.println("Marks after updation");
        System.out.print(marks[0] + " ");
        System.out.print(marks[1] + " ");
        System.out.println(marks[2] + " ");

        // Length of Array
        System.out.println("Lenght of Marks Array = " + marks.length);
    }
}

// ARRAY AS ARGUMENT IN FUNCTION

public class JavaBasics{
    public static void update(int marks[], int notChangeable){
        notChangeable = 50;
        for(int i = 0; i < marks.length; i++){
            marks[i] =  marks[i] + 5;
        }
    }

    public static void main(String args[]){
        int marks[] = {50, 60, 70, 80, 90, 100};
        int notChangeable = 10;
        update(marks, notChangeable);

        System.out.println("Not Changeable = " + notChangeable);
        System.out.print("Marks Array = ");
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
    }
}

// LINEAR SEARCH

public class JavaBasics{
    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = linearSearch(numbers, key);

        if(index == -1){
            System.out.print("Not Founded!");
        }
        else{
            System.out.print("Key is at index = " + index);
        }

    }
}

// FIND LARGEST & SMALLEST NUMBER IN ARRAY
// {1, 2, 6, 3, 5}

import java.util.*;

public class JavaBasics{
    public static int largestNumber(int numbers[]){
        // - Infinity = Integer.MIN_VALUE
        int largest = Integer.MIN_VALUE; 

        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int smallestNumber(int numbers[]){
        // + Infinity = Integer.MAX_VALUE
        int smallest = Integer.MAX_VALUE; 

        for(int i = 0; i < numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]){
        int numbers[] = {1, 2, 6, 3, 5};
        int largest = largestNumber(numbers);
        int smallest = smallestNumber(numbers);
        
        System.out.println("Smallest Number in Array = " + smallest);
        System.out.println("Largest Number in Array = " + largest);
    }
}


// BINARY SEARCH 
// FIND 10 IN THIS ARRAY USING BINARY SEARCH
//{2, 4, 6, 8, 10, 12, 14}

public class JavaBasics{
    public static int binarySearch(int numbers[], int key){
            int start = 0;
            int end = numbers.length - 1;

            while(start <= end){
            int mid = (start + end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int index = binarySearch(numbers, key);
        if(index == -1){
            System.out.print("Key Not Founded!");
        }
        else{
            System.out.print("Key is at index = " + index);
        }

    }
}

// REVERSE AN ARRAY
// {2, 4, 6, 8, 10}

public class JavaBasics{
    public static void reverse(int numbers[]){
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }

    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        reverse(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}

// PAIRS IN ARRAY

public class JavaBasics{
    public static void printPairs(int numbers[]){
       for(int i = 0; i < numbers.length; i++){
        int curr =  numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                System.out.print("(" + curr + ", " + numbers[j] + ") ");
            }
            System.out.println();
       }

    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}

// PRINT SUBARRAYS 
// {2, 4, 6, 8, 10}

public class JavaBasics{
    public static void printSubArray(int numbers[]){

        for(int i = 0; i < numbers.length; i++){
            int start = i;

            for(int j = i; j < numbers.length; j++){
                int end = j;
                
                for(int k = start; k <= end; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
       printSubArray(numbers);
    }
}

// SORTED ARRAY IN ASCENDING ORDER

public class JavaBasics{
    public static void sort(int array[]){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

    }

    public static void main(String args[]){
        int array[] = {5, 2, 4, 1, 6, 3};
        sort(array);
        
        System.out.print("Sorted Array = ");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

// SORTED ARRAY IN DESCENDING ORDER

public class JavaBasics{
    public static void sort(int array[]){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] < array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

    }

    public static void main(String args[]){
        int array[] = {5, 2, 4, 1, 6, 3};
        sort(array);
        
        System.out.print("Sorted Array = ");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

// MAX SUBARRAY SUM I (BRUTE FORCE)

import java.util.*;

public class JavaBasics{
    public static void maxSumSubArray(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < numbers.length; i++){
            int start = i;

            for(int j = i + 1; j <= numbers.length; j++){
                int end = j;
                currSum = 0;

                for(int k = start; k < end; k++){
                    currSum = currSum + numbers[k];
                }

                System.out.println(currSum);

                if(currSum > largest){
                    largest = currSum;
                }
            }
        }
            System.out.println("Maximum of Subarray = " + largest);
    }       

    public static void main(String args[]){
        int numbers[] = {1, -2, 6, -1, 3};
        maxSumSubArray(numbers);
    }
}

// PREFLIX ARRAY

public class JavaBasics{
    public static void preflixSum(int numbers[]){
        int preflix[] = new int[numbers.length];
        preflix[0] = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            preflix[i] = preflix[i - 1] + numbers[i];
        }

        System.out.print("Preflix Array = ");
        for(int i = 0; i < preflix.length; i++){
            System.out.print(preflix[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]){
        int numbers[] = {1, -2, 6, -1, 3};

        System.out.print("Original Array = ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println();

        preflixSum(numbers);
    }
}

// MAX SUBARRAY SUM II (PREFLIX SUM)

import java.util.*;

public class JavaBasics{
    public static void maxSumSubArray2(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int currSum = 0;
        int preflix[] = new int[numbers.length];

        preflix[0] = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            preflix[i] = preflix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++){
            int start = i;

            for(int j = i + 1; j < numbers.length; j++){
                int end = j;

                currSum = start == 0 ? preflix[end] : preflix[end] - preflix[start - 1];

                if(currSum > largest){
                    largest = currSum;
                }
            }
        }
            System.out.println("Maximum of Subarray = " + largest);
    } 

    public static void main(String args[]){
        int numbers[] = {1, -2, 6, -1, 3};
        maxSumSubArray2(numbers);
    }
}

// MAX SUBARRAY SUM III (KADANE ALGORITHUM)

import java.util.*;

public class JavaBasics{
    public static void kadane(int numbers[]){
        int maxSum = Integer.MIN_VALUE; 
        int currSum = 0;

        for(int i = 0; i < numbers.length; i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }  
        System.out.print(maxSum);
    }

    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(numbers);
        
    }
}

// TRAPPED RAIN WATER (DSA MEDIAN LEVEL QUESTION)

import java.util.*;

public class JavaBasics{
    public static int trappedRainWater(int height[]){

        //Calculation Left Max Boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        //Calculation Right Max Boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];

        for(int i = height.length - 2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;

        //loop
        for(int i = 0; i < height.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterLevel - height[i];
        }

        return trappedWater;

    }

    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.print("Trappped Water = " + trappedRainWater(height));
    }
}

// BEST TIME TO BUY AND SELL STOCK

import java.util.*;

public class JavaBasics{
    public static int stock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }
            else{
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit is = " + stock(prices));
    }
}

// PRACTICE QUESTIONS

// 1. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// CASE I [1,2,3,1] = TRUE
// CASE II [1,2,3,4] = FALSE
// CASE III [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] = TRUE

public class JavaBasics{
    public static boolean isNumRepeat(int nums[]){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        int nums[] ={1, 2, 3, 4};
        System.out.println(isNumRepeat(nums));
    }
}

// 2. There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.

// CASE I   Input: nums = [4,  5, 6, 7, 0, 1, 2], target = 0 Output:   4
// CASE II  Input: nums = [4,  5, 6, 7, 0, 1, 2], target = 3 Output:   -1
// CASE III Input: nums = [1], target = 0 Output:   -1 

public class JavaBasics{
    public static int target(int nums[], int key){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int key = 0;
        int index = target(nums, key);
        System.out.print(index);

    }
}

// 5. Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.

// CASE I   Input: nums = [-1, 0,  1, 2, -1, -4]   Output:   [ [-1, -1, 2] , [-1, 0, 1] ]
// CASE II  Input: nums = [ ]  Output:   [ ] 
// CASE III Input: nums = [ 0 ]  Output:   [ ]


// BASIC SORTING ALGORITHUMS
// 1. BUBBLE SORT

public class JavaBasics {
    public static void bubbleSort(int nums[]) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < (n - i - 1); j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int nums[] = {5, 4, 1, 3, 2};
        bubbleSort(nums);
        System.out.print("Bubble Sorted Array = ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

// Bubble Sort Optimized

public class JavaBasics{
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void modifiedBubbleSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            boolean swap = false;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }

            if(swap == false){
                break;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {5, 4, 3, 2, 1};

        modifiedBubbleSort(arr);
        printArray(arr);
    }
}

// 2. SELECTION SORT

public class JavaBasics{
    public static void selectionSort(int nums[]) {
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            int minPos = i;
            for(int j = i + 1; j <= n-1; j++){
                if(nums[minPos] > nums[j]){
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp; 
        }
    }

    public static void main(String args[]) {
        int nums[] = {5, 4, 1, 3, 2};
        selectionSort(nums);
        System.out.print("Selection Sorted Array = ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

// 3. INSERTION SORT

public class JavaBasics{
    public static void insertionSort(int nums[]) {
        int n = nums.length;
        for(int i = 1; i < n; i++){
            int curr = nums[i];
            int prev = i-1;

            while(prev >= 0 && nums[prev] > curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }
        
    }

    public static void main(String args[]) {
        int nums[] = {5, 4, 1, 3, 2};
        insertionSort(nums);
        System.out.print("Insertion Sorted Array = ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

// INBUILT SORT METHOD OF ARRAY

// ASCENDING ORDER
import java.util.Arrays;

public class JavaBasics {
    public static void main(String args[]) {
        int nums[] = {5, 4, 1, 3, 2, 6, 9, 8, 7};
        Arrays.sort(nums, 0, 5);

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}

// DESCENDING ORDER

import java.util.Arrays;
import java.util.Collections;

public class JavaBasics{
    public static void main(String args[]) {
        Integer nums[] = {5, 4, 1, 3, 2, 6, 9, 8, 7};
        Arrays.sort(nums, Collections.reverseOrder());

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}

// 4. COUNTING SORT (ADVANCED)

import java.util.*;

public class JavaBasics{
    public static void countingSort(int nums[]){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maximum){
                maximum = nums[i];
            }
        }

        int count[] = new int[maximum + 1];

        for(int i = 0; i < nums.length; i++){
            count[nums[i]] = count[nums[i]] + 1;
        }

        int index = 0;

        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                nums[index] = i;
                index++;
                count[i]--;
            }
        }

    }

    public static void main(String args[]) {
       int nums[] = {1, 4, 1, 3, 2, 4, 3, 7};
       countingSort(nums);

       for(int i = 0; i < nums.length; i++){
        System.out.print(nums[i] + " ");
       }
    }
}

// PRACTICE QUESTION
// 1. USE ALL SORT ALGORITHMS IN THIS ARRAY IN DESCENDING ORDER
// {3, 6, 2, 1, 8, 7, 4, 5, 3, 1}

import java.util.*;

public class JavaBasics{
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < (n - i - 1); j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int index = i;
            for(int j = i + 1; j < n; j++){
                if(arr[index] < arr[j]){
                 index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }   
    }

    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int j = i - 1;
            while(j >= 0 && curr > arr[j]){
                arr[j + 1] =  arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
    }

    public static void countingSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int count[] = new int[max + 1];

        for(int i = 0; i < arr.length; i++){
            count[arr[i]] = count[arr[i]] + 1;
        }

        int index = arr.length - 1;

        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[index] = i;
                index--;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int nums[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // bubbleSort(nums);
        // selectionSort(nums);
        // insertionSort(nums);
        // countingSort(nums);
        printArray(nums);
    }

}

// 2D ARRAYS
// TAKES USER INPUT AND GIVE OUTPUT

import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        int arr[][] = new int[4][4];
        int rows = arr.length;
        int columns = arr[0].length; 
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// NOW CREATE SEARCH, LARGEST, SMALLEST METHOD IN THIS

import java.util.*;

public class JavaBasics{
    public static boolean search(int arr[][], int key){
        int rows = arr.length;
        int columns = arr[0]. length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(arr[i][j] == key){
                    System.out.print("Key is found at cell = " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.print("Key is not avaiable");
        return false;
    }

    public static int largest(int arr[][]){
        int rows = arr.length;
        int columns = arr[0].length;
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(arr[i][j] > largest){
                    largest = arr[i][j];
                }
            }
        }

        return largest;
    }

    public static int smallest(int arr[][]){
        int rows = arr.length;
        int columns = arr[0].length;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(arr[i][j] < smallest){
                    smallest = arr[i][j];
                }
            }
        }

        return smallest;
    }

    public static void main(String args[]){
        int arr[][] = new int[3][3];
        int rows = arr.length;
        int columns = arr[0].length; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2D Arrays Numbers(3x3) :- ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Seacrh Method
        System.out.print("Enter Key number :- ");
        int key = sc.nextInt();
        search(arr, key);

        System.out.println();

        // Largest Method
        System.out.print("Largest Numbers in 2D Arrays is = " + largest(arr));

        System.out.println();

        // Smallest Method
        System.out.print("Smallest Numbers in 2D Arrays is = " + smallest(arr));

    }
}

// SPIRAL MATRIX
public class JavaBasics{
    public static void spiral(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){
            //1st
            for(int i = startRow; i <= endRow; i++){
                System.out.print(arr[startRow][i] + " ");
            }

            //2nd 
            for(int j = startCol + 1; j <= endCol; j++){
                System.out.print(arr[j][endCol] + " ");
            }

            //3rd 
            for(int i = endRow - 1; i >= startRow; i--){
                System.out.print(arr[endRow][i] + " ");
            }

            //4th 
            for(int j = endCol - 1; j > startCol; j--){
                System.out.print(arr[j][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String args[]){
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };

        spiral(arr);
    }
}

// DIAGONAL SUMS
//1. NORMAL WAY

public class JavaBasics{
    public static void diagonalSum(int arr[][]){
        int rows = arr.length;
        int columns = arr[0].length;
        int left = 0;
        int right = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(i == j){
                    left += arr[i][j];
                }
                if(i + j == rows-1){
                    right += arr[i][j];
                }
            }
        }

        System.out.println("Diganol Sum Left to Rigth = " + left);
        System.out.println("Diganol Sum Rigth to Left = " + right);
        System.out.println("Sum of Left & Rigth Diagonal = " + (left + right));
    }

    public static void main(String args[]){
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };

        diagonalSum(arr);
    }
}

// 2. FAST WAY
public class JavaBasics{
    public static void diagonalSum(int arr[][]){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum+= arr[i][i];
            if(i != arr.length - i -1){
                sum += arr[i][arr.length - i -1];
            }
        }

        System.out.print("Diagonal Sum = " + sum);
    }

    public static void main(String args[]){
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };

        diagonalSum(arr);
    }
}

// SEARCH IN SORTED MATRIX
// BRUTE FORCE && STAIRCASE

public class JavaBasics{
    public static boolean bruteForce(int arr[][], int key){
        int rows = arr.length;
        int columns = arr[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(arr[i][j] == key){
                    System.out.print(key + " Key is found at cell = " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.print("Key is not found");
        return false;
    }

    public static boolean binarySearch(int arr[][], int key){
        int row = 0;
        int columns = arr[0].length - 1;

        while(row < arr.length && columns >= 0){
            if(arr[row][columns] == key){
                System.out.println("Key is at cell = " + "(" + row + "," + columns + ")");
                return true;
            }
            else if(arr[row][columns] < key){
                row++;
            }
            else if(arr[row][columns] > key){
                columns--;
            }
        }

        System.out.println("Key is not found");
        return false;
    }

    public static void main(String args[]){
        int arr[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50},
        };

        int key = 33;

        // bruteForce(arr, key);
        binarySearch(arr,key);
    }
}

// Practice Question

// 1.

public class JavaBasics{
    public static void count(int arr[][], int key){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == key){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String args[]){
        int arr[][] = {
            {4, 7, 8},
            {8, 8, 7},
        };

        int key = 7;

        count(arr, key);
    }
}

// 2.

public class JavaBasics{
    public static void sum(int arr[][]){
        int sum = 0;
        for(int i = 1; i > 0; i--){
            for(int j = 0; j < arr[0].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Sum is = " + sum);
    }

    public static void main(String args[]){
        int arr[][] = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3},
        };

        sum(arr);
    }
}

// 3. 

public class JavaBasics{
    public static void swapArray(int arr[][]){
        int row = arr.length;
        int column = arr[0].length;
        int[][] transpose = new int [column][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                transpose[j][i] =arr[i][j];
             }
        }

        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[][] = {
            {11, 12, 13},
            {21, 22, 23},
        };

        swapArray(arr);
    }
}

// STRINGS

// INPUT AND OUTPUT

// next();

import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.print("Name = " + name);
    }
}

// nextLine();

import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();

        System.out.print("Full Name = " + fullName);
    }
}

// STRINGS LENGTH METHOD

public class JavaBasics{
    public static void main(String args[]){
        String fullName = "Kapil Biloniya";

        System.out.print("Length of Strings is = " + fullName + " = " + fullName.length());
    }
}

// STRINGS CONCETENATE

public class JavaBasics{
    public static void main(String args[]){
        String firstName = "Kapil";
        String lastName = "Biloniya";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
    }
}

// STRINGS CHARAT() METHOD

public class JavaBasics{
    public static void main(String args[]){
        String name = "Kapil Biloniya";
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i));
        }
    }
}

// CHECK IF STRINGS IS PALINDROME OR NOT

public class JavaBasics{
    public static boolean isPalindrome(String word){
       int n = word.length();

        for(int i = 0; i < n/2; i++){
            if(word.charAt(i) != word.charAt(n - i -1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String word = "racecar";
        System.out.print(isPalindrome(word));
    }
}

// SHORTEST PATH 

import java.util.*;

public class JavaBasics{
    public static float shortestPath(String path){
        int x = 0;
        int y = 0;
       
       for(int i = 0; i < path.length(); i++){
        //North
        if(path.charAt(i) == 'N'){
            y++;
        }
        //East
        else if(path.charAt(i) == 'E'){
            x++;
        }
        //South
        else if(path.charAt(i) == 'S'){
            y--;
        }
        //West
        else{
            x--;
        }
       }

       int x2 = x*x;
       int y2 = y*y;

       return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.print("Shortest Path = " + shortestPath(path));
        
    }
}

// STRINGS FUNCTION COMPARE

public class JavaBasics{
    public static void main(String args[]){
        String s1 = "Kapil";
        String s2 = "Kapil";
        String s3 = new String("Kapil");

        // 1st case (Equal to)
        if(s1 == s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        // 2nd case (Not Equal to)
        if(s1 == s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        // 3rd case (Equal to)
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}

// STRING FUNCTION SUBSTRING

public class JavaBasics{
    public static String subString(String str, int si, int ei){
        String subStr = "";
        for(int i = si; i < ei; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String args[]){
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 5));

    }
}

// PRINT LARGEST STRING
// str1.compareTo(str2);
// str1.compareToIgnoreCase(str2);

public class JavaPractice{
    public static void main(String args[]){
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        
        for(int i = 1; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}

// STRING BUILDER
// METHODS

public class JavaBasics{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");            
        System.out.println(sb.toString());
        //Output = "Hello World"

        sb.insert(5, ",");             
        System.out.println(sb.toString());
        //Output = "Hello, World"

        sb.replace(7, 12, "Java");     
        System.out.println(sb.toString());
        //Output = "Hello, Java  "

        sb.reverse();                  
        System.out.println(sb.toString());
        //Output = "avaJ ,oellH"

        sb.delete(0, 5);                
        System.out.println(sb.toString());
        //Output = ",oellH"

        sb.reverse();                   
        System.out.println(sb.toString());
        //Output = "Hello,"
    }
}

// CONVERT LETTER TO UPPERCASE

public class JavaPractice {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello world";
        String result = toUpperCase(str);
        System.out.println(result);  // Output: HELLO WORLD
    }
}

// CONVERT LETTER TO LOWERCASE

public class JavaBasics {
    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "HELLO WORLD";
        String result = toLowerCase(str);
        System.out.println(result);  // Output: hello world
    }
}

// CREATE A CAPITAL CASE METHOD 
// INPUT = hello world, i am learning java TO,
// OUTPUR = Hello World, I Am Learing Java 

public class JavaBasics {
    public static String toCapitalCase(String str) {
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
       return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello world, i am learning java";
        String result = toCapitalCase(str);
        System.out.println(result);  // Output: Hi. I Am Kapil
    }
}

// STRING COMPRESSION

public class JavaBasics{
    public static String compress(String str){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }
            if(count > 1){
                sb.append(str.charAt(i));
                sb.append(count.toString());
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.length() > str.length() ? str : sb.toString();
    }
    public static void main(String args[]){
       String str = "aaabbcccdd";
       System.out.println(compress(str));
    }
}

// PRACTICE QUESTIONS
// Question1: Count how many times lowercase vowels occurred in a String entered by the user

import java.util.*;

public class JavaBasics{
    public static int countSmallCaseVowels(String str){
        int n = str.length();
        int count = 0;

        for(int i = 0; i < n; i++){
            if(
                str.charAt(i) == 'a' ||
                str.charAt(i) == 'e' ||
                str.charAt(i) == 'i' ||
                str.charAt(i) == 'o' ||
                str.charAt(i) == 'u' 
            ){
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Word or Sentence:- ");
        String str = sc.nextLine();
        System.out.println(countSmallCaseVowels(str));
        sc.close();
    }
}

// Question 4 : Determine if 2 Strings are anagrams of each other. What are anagrams?

import java.util.Arrays;

public class JavaBasics{
    public static void isAnagram(String str1, String str2){
       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();

       if(str1.length() == str2.length()){
        //Convert string to char array
        char[] str1charArray = str1.toCharArray();
        char[] str2charArray = str2.toCharArray();

        //Sort the char array
        Arrays.sort(str1charArray);
        Arrays.sort(str2charArray);

        //Checking if both are equal or not
        boolean result = Arrays.equals(str1charArray, str2charArray);
        if(result){
            System.out.println(str1 + " and " + str2 + " are anagrams of each other");
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
       }


    }
    public static void main(String args[]){
        String str1 = "race";
        String str2 = "care";

        isAnagram(str1, str2);
    }
}

//I BUILD THIS SAME CODE FROM SCRATCH

import java.util.*;

public class JavaBasics{

    // Convert all characters of a string to lowercase
    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            sb.append(ch);
        }

        return sb.toString();
    }

    // Convert a string to a character array manually
    public static char[] stringToCharArray(String str) {
        char[] charArray = new char[str.length()];

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = str.charAt(i);
        }

        return charArray;
    }

    // Sort a character array using Bubble Sort (good for learning)
    public static void sortArray(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Compare two character arrays for equality
    public static boolean areArraysEqual(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }

        return true;
    }

    // Check if two strings are anagrams
    public static void isAnagram(String str1, String str2) {
        // Convert both strings to lowercase for case-insensitive comparison
        str1 = toLowerCase(str1);
        str2 = toLowerCase(str2);

        if (str1.length() == str2.length()) {
            // Convert strings to char arrays
            char[] arr1 = stringToCharArray(str1);
            char[] arr2 = stringToCharArray(str2);

            // Sort both arrays
            sortArray(arr1);
            sortArray(arr2);

            // Check if sorted arrays are equal
            boolean result = areArraysEqual(arr1, arr2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings from user
        System.out.print("Enter 1st String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter 2nd String: ");
        String str2 = sc.nextLine();

        sc.close();  // Close scanner after input

        // Check if input strings are anagrams
        isAnagram(str1, str2);
    }
}

// BIT MANIPULATION
// BIT OPERATORS

// 1. BINARY AND &

public class JavaBasics{
    public static void main(String args[]){
        int a = 5; // 101
        int b = 3; //  11
        System.err.println((a & b)); // Output 001
    }
}

// 2. BINARY OR |

public class JavaBasics{
    public static void main(String args[]){
        int a = 5; // 101
        int b = 3; //  11
        System.err.println((a | b)); // Output 111
    }
}

// 3. BINARY XOR ^

public class JavaBasics{
    public static void main(String args[]){
        int a = 5; // 101
        int b = 3; //  11
        System.err.println((a ^ b)); // Output 110
    }
}

// 4. BINARY ONE'S COMPLEMENT ~

public class JavaBasics{
    public static void main(String args[]){
        int a = 5; // 00000101
        System.err.println(~a); // Output 00000110 -> 6 -> -6
    }
}

// 5. BINARY LEFT SHIFT <<

public class JavaBasics{
    public static void main(String args[]){
        int a = 5; // 00000101
        int b = 2; 
        System.err.println(a << b); // Output 00010100 -> 20
    }
}

// 6. BINARY RIGHT SHIFT >>

public class JavaPractice{
    public static void main(String args[]){
        int a = 6; // 00000110
        int b = 1; 
        System.err.println(a >> b); // Output 00000011 -> 3
    }
}

// CHECK IF NUM IS ODD OR EVEN

public class JavaBasics{
    public static void oddOrEven(int n){
        int bitMask = (n & 1);
        if(bitMask == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String args[]){
        int n = 10;
        oddOrEven(n);

    }
}

// GET ITH BIT

public class JavaBasics{
    public static int getIthBit(int n, int i){
       int bitMask = (n >> i);
       if((bitMask & 1) == 1){
        return 1;
       }
       else{
        return 0;
       }
    }
    public static void main(String args[]){
        int n = 10;
        int i = 3;
        System.out.println(getIthBit(n, i));

    }
}

// SET ITH BIT

public class JavaBasics{
    public static int setIthBit(int n, int i){
       int bitMask = 1 << i;
       return (n | bitMask);
    }
    public static void main(String args[]){
        int n = 10;
        int i = 2;
        System.out.println(setIthBit(n, i));

    }
}

// TOGGLE ITH BIT

public class JavaPractice{
    public static int toggleIthBit(int n, int i){
       int bitMask = 1 << i;
       return (n ^ bitMask);
    }
    public static void main(String args[]){
        int n = 26;
        int i = 3;
        System.out.println(toggleIthBit(n, i));

    }
}

// CLEAR ITH BIT

public class JavaBasics{
    public static int clearIthBit(int n, int i){
       int bitMask = ~(1 << i);
       return (n & bitMask);
    }
    public static void main(String args[]){
        int n = 11;
        int i = 3;
        System.out.println(clearIthBit(n, i));

    }
}   

// UPDATE ITH BIT

public class JavaBasics{
    public static int updateIthBit(int n, int i, int newBit){
       if(newBit == 0){
        int bitMask = ~(1 << i);
        return (n & bitMask);
       }
       else if(newBit == 1){
        int bitMask = 1 << i;
        return (n | bitMask);
       }
       else{
        return -1;
       }
    }
    public static void main(String args[]){
        int n = 21;
        int i = 1;
        int newBit = 1;
        System.out.println(updateIthBit(n, i, newBit));

    }
}   

// CLEAR LAST ITH BIT

public class JavaBasics{
    public static int clearLastIthBit(int n, int i){
      int bitMask = -1 << i;
      return (n & bitMask);
    }
    public static void main(String args[]){
        int n = 15;
        int i = 2;
        System.out.println(clearLastIthBit(n, i));

    }
}   

// CLEAR ITH TO JTH RANGE BIT

public class JavaBasics{
    public static int clearRangeBit(int n, int i, int j){
      int a = -1 << (j+1);
      int b = (1 << i) - 1;
      int bitMask = a | b;
      return n & bitMask;
    }
    public static void main(String args[]){
        int n = 10;
        int i = 2;
        int j = 4;
        System.out.println(clearRangeBit(n, i, j));

    }
}   

// CHECK IF IT IS POWER OF 2

public class JavaBasics{
    public static boolean isPowerOfTwo(int n){
      boolean result = (n & (n - 1)) == 0;
      return result;
    }
    public static void main(String args[]){
        int n = 8;
        System.out.println(isPowerOfTwo(n));

    }
}

// COUNT SET BIT IN A NUMBER

public class JavaBasics{
    public static int countSetInBit(int n){
      int count = 0;
      while (n > 0) {
        if((n & 1) == 1){
            count++;
        }
        n = n >> 1;
      }

      return count;
    }
    public static void main(String args[]){
        int n = 21;
        System.out.println(countSetInBit(n));

    }
}   

// FAST EXPONENTIATION

public class JavaPractice{
    public static int fastExpo(int a, int n){
      int ans = 1;
      while(n > 0){
        if((n &1) != 0){
            ans = ans * a;
        }

        a = a * a;
        n = n >> 1;
      }
      return ans;
    }
    public static void main(String args[]){
        int n = 5;
        int a = 3;
        System.out.println(fastExpo(a, n));

    }
}   

// OOPS (OBJECT ORIENTED PROGRAMMING)

// CLASSES

class Students {
    // Properties / Variables (data)
    String name;
    int age;
    int marks;

    // Setter Methods 
    void setName(String newName) {
        name = newName;
    }

    void setAge(int newAge) {
        age = newAge;
    }

    void setMarks(int newMarks) {
        marks = newMarks;
    }

    // Method to check if the student passed using the class's marks variable
    boolean isPass() {
        if (marks < 33) {
            return false;
        } else {
            return true;
        }
    }
}

// OBJECT

public class JavaBasics {
    public static void main(String[] args) {
        // Create a student object
        Students s1 = new Students();

        // Set values
        s1.setName("Ravi");
        s1.setAge(16);
        s1.setMarks(75);

        // Print student details
        System.out.println("Name  : " + s1.name);
        System.out.println("Age   : " + s1.age);
        System.out.println("Marks : " + s1.marks);

        // Check and print result
        if (s1.isPass()) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}


// ACCESS MODIFIERS

// PRIVATE & PUBLIC

public class JavaBasics{
    public static void main(String args[]){
        BankAccount bankAcc = new BankAccount();
        bankAcc.showBalance();
    }
}

class BankAccount {
    private int balance = 5000;

    public void showBalance(){
        System.out.println("Balance = " + balance);
    }
}

// GETTERS AND SETTERS WITH THIS KEYWORD


public class JavaBasics{
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Kapil");
        System.out.println("Name = " + stu.getName());
    }     
}


// Student.java
class Student {
    private String name;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

// CONSTRUCTORS

// Example 1.

public class JavaBasics{
    public static void main(String[] args) {
        Student stu = new Student();
    }     
}


// Student.java
class Student {
   Student(){
        System.out.println("Constructor is Called...");
   }
}

// Example 2.

public class JavaBasics {
    public static void main(String[] args) {
        Student stu = new Student("Kapil", 20);
    }     
}


// Student.java
class Student {
   private String name;
   private int age;

   Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Name = " + this.name + " & Age = " + this.age);
   }
}

// TYPES OF CONSTRUCTOR

// 1. NON-PARAMETERIZED &  PARAMETERIZED

public class JavaBasics {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu2 = new Student("Kapil");
    }     
}


// Student.java
class Student {
   String name;
   int age;

   // 1. Non-Parameterzied 
   Student(){
    System.out.println("Construcor is called..");
   }

   // 2. Parameterzied
   Student(String name){
        this.name = name;
   }
}



// 3. COPY CONSTRUCTOR

// Shallow Copy

public class JavaBasics {
    public static void main(String args[]) {
        int[] marks = {80, 90, 100};        // original array

        Student stu = new Student("Kapil", 20, marks);  // original object
        // System.out.println(stu.marks[0]);   // print original

        Student stu2 = new Student(stu);    // shallow copy
        stu.marks[0] = 85;                  // change original
        System.out.println(stu2.marks[0]);  // reflects in copy
    }     
}

// Student.java
class Student {
    String name;         // student name
    int age;             // student age
    int[] marks;         // marks array

    Student(String name, int age, int[] marks) {
        this.name = name;     // assign name
        this.age = age;       // assign age
        this.marks = marks;   // assign array
    }

    Student(Student stu) {
        this.name = stu.name;     // copy name
        this.age = stu.age;       // copy age
        this.marks = stu.marks;   // shallow copy
    }
}

// Deep Copy

public class JavaPractice {
    public static void main(String args[]) {
        int[] marks = {80, 90, 100};        
        Student stu = new Student("Kapil", 20, marks);  
        System.out.println(stu.marks[0]);

        Student stu2 = new Student(stu);    
        stu.marks[0] = 85;                  
        System.out.println(stu2.marks[0]);  
    }     
}

class Student {
    String name;
    int age;
    int[] marks;

    Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    Student(Student stu) {
        this.name = stu.name;
        this.age = stu.age;
        this.marks = new int[stu.marks.length];
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = stu.marks[i];
        }
    }
}

// CONSTRUCTOR OVERLOADING..

public class JavaBasics {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu2 = new Student("Kapil");
        Student stu3 = new Student(20);

        System.out.println(stu2.name);
        System.out.println(stu3.age);
    }     
}


// Student.java
class Student {
   String name;
   int age;

   // 1. Non-Parameterzied 
   Student(){
    System.out.println("Construcor is called..");
   }

   // 2. Parameterzied
   Student(String name){
        this.name = name;
   }

   Student(int age){
        this.age = age;
   }
}

// INHERITANCE

// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class JavaBasics{
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.eat();   // Inherited method
        dog.bark();  // Own method
    }
}

// SINGLE LEVEL INHERITS

// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class JavaBasics {
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.eat();   // Inherited method
        dog.bark();  // Own method
    }
}

// MULTILEVEL INHERITS

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class JavaPractice {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   // From Animal
        puppy.bark();  // From Dog
        puppy.weep();  // From Puppy
    }
}

// HERARCHIAL INHERTANCE

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class JavaBasics {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}

// HYBRID INHERITANCE 
// LEARN INTO INTERFRENCE

// POLYMORPHISM

// METHOD OVERLOADING

class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class JavaBasics {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        System.out.println(obj.add(2, 3));         // 5
        System.out.println(obj.add(2.5, 3.5));     // 6.0
        System.out.println(obj.add(1, 2, 3));      // 6
    }
}



// METHOD OVERIDDING

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class JavaBasics {
    public static void main(String[] args) {
        Animal a; // reference of parent class

        a = new Dog();  // Dog object
        a.sound();      // Output: Dog barks

        a = new Cat();  // Cat object
        a.sound();      // Output: Cat meows
    }
}

// ABSTRACTION 
// ABSTRACT CLASSES

abstract class Animal {
    Animal() {
        System.out.println("Animal's Class Constructor");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }

    abstract void makeSound();
}

class Dog extends Animal{
    Dog() {
        System.out.println("Dog's Class Constructor");
    }

    void makeSound() {
        System.out.println("Bark Bark...");
    }
}


class Cat extends Animal{
    Cat() {
        System.out.println("Cat's Class Constructor");
    }

    void makeSound() {
        System.out.println("Meow Meow...");
    }
}

public class JavaBasics{
    public static void main(String args[]){
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}

// INTERFACE

// Step 1: Create the Interface
interface Vehicle {
    void start();      // abstract method
    void stop();       // abstract method
    int getSpeed();    // abstract method
}

// Step 2: Implementing the Interface in the Car class
class Car implements Vehicle {
    int speed;

    public void start() {
        speed = 50;
        System.out.println("Car started.");
    }

    public void stop() {
        speed = 0;
        System.out.println("Car stopped.");
    }

    public int getSpeed() {
        return speed;
    }
}

// Step 3: Implementing the Interface in the Bike class
class Bike implements Vehicle {
    int speed;

    public void start() {
        speed = 30;
        System.out.println("Bike started.");
    }

    public void stop() {
        speed = 0;
        System.out.println("Bike stopped.");
    }

    public int getSpeed() {
        return speed;
    }
}

// Step 4: Test in main method
public class JavaBasics {
    public static void main(String args[]) {
        Car myCar = new Car();   // Interface reference to Car object
        myCar.start();
        System.out.println("Car Speed: " + myCar.getSpeed());
        myCar.stop();

        System.out.println();

        Bike myBike = new Bike(); // Interface reference to Bike object
        myBike.start();
        System.out.println("Bike Speed: " + myBike.getSpeed());
        myBike.stop();
    }
}


// STATIC KEYWORD

class Student {
    String name;
    int rollNo;
    static String schoolName;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println(name + " - " + rollNo + " - " + schoolName);
    }
}

public class JavaBasics {
    public static void main(String args[]) {
        Student.schoolName = "Ramjas No 5";  // Set static variable using class name

        Student stu1 = new Student("Aman", 101);
        Student stu2 = new Student("Neha", 102);

        stu1.display();  // Aman - 101 - Ramjas No 5
        stu2.display();  // Neha - 102 - Ramjas No 5
    }
}

// SUPER KEYWORD

class Parent {
    String name;

    // Parameterized constructor
    Parent(String name) {
        this.name = name;
        System.out.println("Parent Constructor Called with name: " + name);
    }

    void display() {
        System.out.println("Name from Parent: " + name);
    }
}

class Child extends Parent {

    int age;

    // Child constructor calling parent constructor using super
    Child(String name, int age) {
        super(name);  // Calls Parent(String name) constructor
        this.age = age;
        System.out.println("Child Constructor Called with age: " + age);
    }

    void display() {
        super.display();  // calling parent method
        System.out.println("Age from Child: " + age);
    }
}

public class JavaBasics {
    public static void main(String args[]) {
        Child obj = new Child("Amit", 20);
        obj.display();
    }
}


// RECURSION BASIC PART 1

// PRINT NUMBER IN DESCENDING ORDER 10 TO 1

public class JavaBasics{
    public static void printDec(int n){
        // Base Case
        if(n == 1){
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");

        // Recursive Case
        printDec(n - 1);
    }
    public static void main(String args[]){
        int n = 10;
        printDec(n);
    }
}

// PRINT NUMBER IN ASENDING ORDER 1 TO 10

public class JavaBasics{
    public static void printAsec(int n){
        // Base Case
        if(n == 10){
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");

        // Recursive Case
        printAsec(n + 1);
    }
    public static void main(String args[]) {
        int n = 1;
        printAsec(n);
    }
}

// OR

public class JavaBasics{
    public static void printAsec(int n){
        // Base Case
        if(n == 1){
            System.out.print(n + " ");
            return;
        }

        // Recursive Case
        printAsec(n - 1);

        System.out.print(n + " ");  
    }
    public static void main(String args[]) {
        int n = 10;
        printAsec(n);
    }
}

// FIND FACTORIAL OF N

public class JavaBasics{
    public static int factorial(int n){
        //Base Case
        if(n == 0){
            return 1;
        }

        // Recursive Case
        int fact = n * factorial(n - 1);
        return fact;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(factorial(n));
    }
}

// FIND SUM OF FIRST N NATURAL NUMBER

public class JavaBasics{
    public static int sum(int n){
        //Base Case
        if(n == 1){
            return 1;
        }

        int sum = n + sum(n - 1);
        return sum;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(sum(n));
    }
}

// FIND NTH FIBONACCI NUMBER

public class JavaBasics{
    public static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int f1 = fib(n - 1); 
        int f2 = fib(n - 2);
        return f1 + f2;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(n + " Fibonacci no = " + fib(n));
    }
}

// CHECK IF ARRAY IS SORTED OR NOT

public class JavaBasics{
    public static boolean isSorted(int arr[], int i){
      if(i == arr.length - 1){
        return true;
      }

      if(arr[i] > arr[i + 1]){
        return false;
      }

      return isSorted(arr, i + 1);

    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        int i = 0;
        System.out.println(isSorted(arr, i));
    }
}


// FIRST OCCURRENCE

public class JavaBasics {
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int i = 0;
        int key = 5;
        int result = first(arr, key, i);

        if(result == -1){
            System.out.println(key + " is not found");
        }
        else{
            System.out.println(key + " is at index = " + result);
        }
    }

    public static int first(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return first(arr, key, i + 1);
    }
}

// LAST OCCURRENCE

public class JavaBasics {
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int i = 0;
        int key = 5;
        int result = last(arr, key, i);

        if(result == -1){
            System.out.println(key + " is not found");
        }
        else{
            System.out.println(key + " is at index = " + result);
        }
    }

    public static int last(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = last(arr, key, i + 1);

        if(isFound != -1){
            return isFound;
        }
        
        if(arr[i] == key){
            return i;
        }

        return isFound;
    }
}

// OR

public class JavaBasics {
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int i = 0;
        int key = 5;
        int result = first(arr, key, i);

        if(result == -1){
            System.out.println(key + " is not found");
        } else {
            System.out.println(key + " is at index = " + result);
        }
    }

    public static int first(int arr[], int key, int i){
        // Base case: if i reaches end of array
        if(i == arr.length){
            return -1;
        }

        // Check if current element matches the key
        if(arr[i] == key){
            return i;
        }

        // Recursive call
        return first(arr, key, i + 1);
    }
}


// PRINT X TO THE POWER N

public class JavaBasics {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(power(x, n));
    }

    public static int power(int x, int n){
      if(n == 0){
        return 1;
      }

      int pnm1 = power(x, n - 1);
      int xp = x * pnm1;

      return xp;
    }
}

// PRINT X TO THE POWER N OPTIMIZED

public class JavaBasics{
    public static void main(String args[]){
        int x = 2;
        int n = 10;
        System.out.println(optPower(x, n));
    }

    public static int optPower(int x, int n){
        if(n == 0){
            return 1;
        }

        int halfPower = optPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        

        return halfPowerSq;
    }
}

// RECURSION PART II

// TILING PROBLEM

public class JavaBasics{
    public static void main(String args[]){
        int n = 5;
        System.out.println("Total number of ways = " + totalWays(n));

    }

    public static int totalWays(int n){
        // Base Case
        if(n == 0 || n == 1){
            return 1;
        }

        int vertically = totalWays(n - 1);
        int horizontally = totalWays(n - 2);

        return vertically + horizontally;
    }
}

// REMOVE DUPLICATE IN STRING

public class JavaBasics{
    public static void main(String args[]){
        String str = "appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(), new boolean[26]);

    }

    public static void removeDuplicate(String str, int index, StringBuilder sb, boolean map[]){
        // Base Case
        if(index == str.length()){
            System.out.println(sb.toString());
            return;
        }

        char currChar = str.charAt(index);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, index + 1, sb, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicate(str, index + 1, sb.append(currChar), map);
        }
    }
}

// REVERSE STRING

public class JavaPractice {
    public static void main(String args[]) {
        String str = "Kapil";
        reverseString(str, str.length() - 1, new StringBuilder());
    }

    public static void reverseString(String str, int i, StringBuilder sb) {
        if (i < 0) {
            System.out.println(sb.toString());
            return;
        }

        sb.append(str.charAt(i));
        reverseString(str, i - 1, sb);
    }
}


// FRIENDS PAIRING PROBLEM

public class JavaPractice {
    public static int friendPairing(int n) {
        // Base Cases
        if (n == 1 || n == 0) return 1;
        if (n == 2) return 2;

        // Recurrence Relation:
        // 1. Friend stays single -> friendPairing(n - 1)
        int staySingle = friendPairing(n - 1);

        // 2. Friend pairs with (n - 1) others -> (n - 1) * friendPairing(n - 2)
        int pairs = (n - 1) * friendPairing(n - 2);
        return staySingle + pairs;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendPairing(n)); // Output: 4
    }
}

// BINARY STRING PROBLEM

// PRACTICE QUESTIONS

// 1. 

public class JavaBasics {
    public static void main(String argsp[]){
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;

        printIdxOfKey(arr, key, 0);
    }

    public static void printIdxOfKey(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }
        
        if(arr[i] == key){
            System.out.print(i + " ");
        } 

        printIdxOfKey(arr, key, i + 1);
    }
}

// 2.
// 3.

public class JavaBasics {

    public static void main(String[] args) {
        String str = "Kapil";
        System.out.println("Length of String = " + stringLength(str));
    }

    public static int stringLength(String str){
        if(str.equals("")){
            return 0;
        }

        int count = stringLength(str.substring(1));
        return 1 + count;
    }
}

// 4.
// 5.


// DIVIDE AND CONQUER

// BINARY SEARCH

public class JavaBasics {
    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length- 1;

        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int result = binarySearch(arr, target);

        if(result == -1){
            System.out.println(target + " Target not found");
        } else {
            System.out.println(target + " Target is at Index = " + result);
        }
    }
}

// MERGE 2 SORTED ARRAY 

public class JavaBasics{
    
    // Function to print array
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // Function to merge two sorted arrays
    public static void merge(int arr1[], int arr2[]){
        int left = arr1.length;
        int right = arr2.length;
        int mergeArr[] = new int[left + right];  // Result array

        int i = 0, j = 0, k = 0;

        // Merge elements in sorted order
        while(i < left && j < right){
            if(arr1[i] > arr2[j]){
                mergeArr[k] = arr2[j];
                j++;
                k++;
            } else {
                mergeArr[k] = arr1[i];
                i++;
                k++;
            }
        }

        // Add remaining elements from arr1
        while(i < left){
            mergeArr[k] = arr1[i];
            i++;
            k++;
        }

        // Add remaining elements from arr2
        while(j < right){
            mergeArr[k] = arr2[j];
            j++;
            k++;
        }

        printArray(mergeArr);  // Print merged array
    }

    public static void main(String args[]){
        int arr1[] = {3, 6, 9};
        int arr2[] = {2, 5, 8};

        merge(arr1, arr2);  // Call merge function
    }
}

//OR RECURSIVE 

public class JavaBasics {

    // Function to print elements of an array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Recursive function to merge two sorted arrays into mergeArr
    public static void merge(int arr1[], int arr2[], int mergeArr[], int i, int j, int k) {

        // If all elements from arr1 are added, copy remaining arr2 elements
        if (i == arr1.length) {
            while (j < arr2.length) {
                mergeArr[k] = arr2[j];
                k++;
                j++;
            }
            return;
        }

        // If all elements from arr2 are added, copy remaining arr1 elements
        if (j == arr2.length) {
            while (i < arr1.length) {
                mergeArr[k] = arr1[i];
                k++;
                i++;
            }
            return;
        }

        // Compare and add smaller element to mergeArr, then move respective pointer
        if (arr1[i] > arr2[j]) {
            mergeArr[k] = arr2[j];
            merge(arr1, arr2, mergeArr, i, j + 1, k + 1);
        } else {
            mergeArr[k] = arr1[i];
            merge(arr1, arr2, mergeArr, i + 1, j, k + 1);
        }
    }

    public static void main(String args[]) {
        int arr1[] = {3, 6, 9};  // First sorted array
        int arr2[] = {2, 5, 8};  // Second sorted array
        int mergeArr[] = new int[arr1.length + arr2.length];  // Array to store merged result

        merge(arr1, arr2, mergeArr, 0, 0, 0);  // Start merging from index 0
        printArray(mergeArr);  // Print the final merged array
    }
}

// MERGE SORTING 


// QUICK SORTING 

// SORTED AND ROTATED ARRAY SEARCH

public class JavaBasics{
    public static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
    
        while(start <= end) {
            int mid = start + (end - start) / 2;
    
            if(arr[mid] == target) {
                return mid; // Found it!
            }
    
            // Left half is sorted
            if(arr[start] <= arr[mid]) {
                // Check if target lies in the left half
                if(arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            // Right half is sorted
            else {
                if(arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1; // Not found
    }    
    
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = search(arr, target);
        if(index == -1){
            System.out.println("Target is not found");
        } else {
            System.out.println("Target is at index of = " + index);
        }
    }
}

// TIME AND SPACE COMPLEXITY

// BACKTRACKING

// ARRAYLIST

// OPERATION IN ARRAYLIST

import java.util.ArrayList;

public class JavaBasics {
    public static void main(String args[]) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // 1. Add Elements
        list.add("Apple");                // Add at the end
        list.add("Mango");
        list.add("Banana");
        list.add(1, "Orange");             // Insert at index 1

        System.out.println("After adding elements: " + list);

        // 2. Get Element
        String fruit = list.get(2);        // Get element at index 2
        System.out.println("Element at index 2: " + fruit);

        // 3. Remove Element
        list.remove(3);                    // Remove element at index 3 (Banana)
        list.remove("Apple");              // Remove first occurrence of "Apple"

        System.out.println("After removing elements: " + list);

        // 4. Set Element at Index
        list.set(1, "Grapes");              // Replace element at index 1 with "Grapes"

        System.out.println("After setting (replacing) element: " + list);

        // 5. Contains Element
        boolean hasMango = list.contains("Mango");   // Check if "Mango" exists
        boolean hasApple = list.contains("Apple");   // Check if "Apple" exists

        System.out.println("Contains Mango? " + hasMango);
        System.out.println("Contains Apple? " + hasApple);

        // 6. Print the final list
        System.out.println("Final List: " + list);
    }
}

// SIZE OF ARRAYLIST

import java.util.ArrayList;

public class JavaBasics {
    public static void main(String[] args) {
        // Create an ArrayList of Integer
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Add elements
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);

        // Print the size of the list
        System.out.println(numbersList.size());   // Output: 4
    }
}

// PRINT REVERSE OF ARRAYLIST
// [1,2,3,4,5] -> 5, 4, 3, 2, 1

import java.util.ArrayList;

public class JavaBasics {
    public static void main(String[] args) {
        // Create an ArrayList of Integer
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print ArrayList in reverse order
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

// FIND LARGEST NO IN AN ARRAYLIST
// [2, 5, 9, 3, 6] -> 9

import java.util.ArrayList;

public class JavaBasics {
    public static void main(String[] args) {
        // Create an ArrayList of Integer
        ArrayList<Integer> list = new ArrayList<>();
        
        // Add elements
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Largest number (initially set to smallest possible value)
        int largest = Integer.MIN_VALUE;

        // Loop to find the largest number
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > largest) {
                largest = list.get(i);
            }
        }

        // Print the largest number
        System.out.println("Largest No = " + largest);
    }
}

// SWAP 2 NO
// [2, 5, 9, 3, 6] -> [2, 3, 9, 5, 6]

import java.util.ArrayList;

public class JavaBasics {

    // Function to swap two elements in the list
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        // Create an ArrayList of Integer
        ArrayList<Integer> list = new ArrayList<>();
        
        // Add elements
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        
        // Indices to swap
        int idx1 = 1, idx2 = 3;

        // Print list before swapping
        System.out.println("Before swapping: " + list);

        // Swap elements
        swap(list, idx1, idx2);

        // Print list after swapping
        System.out.println("After swapping: " + list);
    }
}


// SORTING IN ARRAYLIST

import java.util.ArrayList;
import java.util.Collections;

public class JavaBasics {
    public static void main(String args[]) {
        // Create an ArrayList of Integer
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);

        // Print the original list
        System.out.println("Original List: " + list);

        // Sort in Increasing Order (Ascending)
        Collections.sort(list);
        System.out.println("Sorted in Increasing Order: " + list);

        // Sort in Decreasing Order (Descending)
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted in Decreasing Order: " + list);
    }
}

// MULTI-DIMENSIONAL ARRAYLIST
/*  [
    [1, 2, 3, 4, 5]
    [2, 4, 6, 8, 10]
    [3, 6, 9, 12, 15]
]
*/

import java.util.ArrayList;

public class JavaBasics {

    public static void main(String args[]) {
        // Create the main list to hold other lists (2D ArrayList)
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Create individual lists (rows) for 2D structure
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // Add elements to each list (simulating rows in a matrix)
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);  // Row 1 (multiplying by 1)
            list2.add(i * 2);  // Row 2 (multiplying by 2)
            list3.add(i * 3);  // Row 3 (multiplying by 3)
        }

        // Add the rows (lists) to the main list (2D ArrayList)
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // Print the 2D ArrayList (matrix)
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> curr = mainList.get(i);  // Get each row (list)
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j) + " ");  // Print each element in the row
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}

// CONTAINER WITH MOST WATER

// BRUTE FORCE - O(n2)
import java.util.ArrayList;

public class JavaBasics {
    public static int mostWater(ArrayList<Integer> height) {
        int max = 0; // Better to start from 0

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int minHeight = height.get(i) < height.get(j) ? height.get(i) : height.get(j);
                int width = j - i;
                int water = minHeight * width;

                if (water > max) {
                    max = water;
                }
            }
        }

        return max;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int maxWater = mostWater(height);

        System.out.println(maxWater); // Output: 49
    }
}


// 2 POINTER APPROACH - O(n)

import java.util.ArrayList;

public class JavaBasics {
    
    public static int mostWater(ArrayList<Integer> height) {
        int max = 0; // Stores maximum water
        int left = 0; // Start pointer
        int right = height.size() - 1; // End pointer

        while (left < right) {
            // Find the minimum height between two lines
            int minHeight = Math.min(height.get(left), height.get(right));

            // Width between left and right
            int width = right - left;

            // Calculate area (water contained)
            int water = minHeight * width;

            // Update max if current water is greater
            if (water > max) {
                max = water;
            }

            // Move the pointer with the shorter height
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return max; // Return the maximum water
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();

        // Add heights
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int maxWater = mostWater(height);

        System.out.println(maxWater); // Output: 49
    }
}

// PAIR SUM I 

// BRUTE FORCE 

import java.util.ArrayList;

public class JavaBasics {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 5;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pairSum(list, target));

    }
}

// 2 POINTER APPROACH

import java.util.ArrayList;

public class JavaBasics {
    // Function to find if a pair exists with given target sum
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                return true; // Pair found
            }

            if (sum > target) {
                right--; // Move right pointer leftwards to decrease sum
            } else {
                left++; // Move left pointer rightwards to increase sum
            }
        }

        return false; // No pair found
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 5;

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // Check for pair sum
        System.out.println(pairSum(list, target)); // Output: true
    }
}

// PAIR SUM II

import java.util.ArrayList;

public class JavaBasics {
    // Function to find if a pair exists with given target sum in a sorted & rotated array
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;

        // Find the pivot (the point where the next element is smaller)
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        int left = (pivot + 1) % n; // smallest element
        int right = pivot;          // largest element

        // Use two pointers to find if a pair exists
        while (left != right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                return true; // Pair found
            }

            if (sum < target) {
                left = (left + 1) % n; // Move left pointer forward (circular)
            } else {
                right = (n + right - 1) % n; // Move right pointer backward (circular)
            }
        }

        return false; // No pair found
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 16;

        // Add elements to the list (sorted + rotated)
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        // Check for pair sum
        System.out.println(pairSum2(list, target)); // Output: true
    }
}

// LINKED LIST

public class LinkedLists {

    // Node class to represent each element in the linked list
    public static class Node {
        int data;
        Node next;

        // Constructor to initialize node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Method to add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        // If list is empty, set head and tail to new node
        if (head == null) {
            head = tail = newNode;
        } else {
            // Link new node to current head and update head
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to add a node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        // If list is empty, set head and tail to new node
        if (head == null) {
            head = tail = newNode;
        } else {
            // Link tail to new node and update tail
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to add a node at a specific index in the list
    public void addMiddle(int index, int data) {
        Node newNode = new Node(data);

        // If index is 0, add at beginning
        if (index == 0) {
            addFirst(data);
            return;
        }

        size++;
        Node temp = head;
        int i = 0;

        // Traverse to the node before the desired index
        while (i < index - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        // If index is out of bounds
        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        // Link new node and insert it
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method to remove the first node of the list
    public int removeFirst() {
        // If list is empty
        if (size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }

        // If list has only one node
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Remove first node and update head
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Method to remove the last node of the list
    public int removeLast() {
        // If list is empty
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        // If only one node in the list
        if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Traverse to the second last node
        Node temp = head;
        int i = 0;
        while (i < size - 2) {
            temp = temp.next;
            i++;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    // Method to search for a target value in the linked list
    public int search(int target) {
        int idx = 0;
        Node temp = head;

        // Traverse through list until target is found
        while (temp != null) {
            if (temp.data == target) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }

        return -1; // Target not found
    }

    // Recursive helper method to find the index of a target value in the linked list
    private int searchRec(Node head, int target) {
        // Base case: reached end of list without finding the target
        if (head == null) {
            return -1;
        }

        // If current node's data matches the target
        if (head.data == target) {
            return 0;
        }

        // Recursive call to check the rest of the list
        int index = searchRec(head.next, target);

        // If not found in the rest of the list
        if (index == -1) {
            return -1;
        }

        // Add 1 to the index as we backtrack through the recursion
        return index + 1;
    }

    // Public method to initiate the recursive search from the head
    public int searchRecIdx(int target) {
        return searchRec(head, target);
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node curr = head;

        // Traverse through the list and reverse pointers
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Set head to the new front
        head = prev;
    }

    // Method to remove the nth node from the end of the list
    public void removeNth(int n) {
        // Step 1: Calculate size of the list
        int s = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            s++;
        }

        // Step 2: If removing the head (nth from end == size)
        if (n == s) {
            head = head.next;
            return;
        }

        // Step 3: Traverse to the (size - n - 1)th node
        int idx = 1;
        Node prev = head;
        while (idx < s - n) {
            prev = prev.next;
            idx++;
        }

        // Step 4: Remove the nth node
        prev.next = prev.next.next;
    }

    // Method to find the middle node of the linked list
    private Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;

        // Use slow-fast pointer approach to find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Method to check if the linked list is a palindrome
    public boolean isPalindrome() {
        // If list has 0 or 1 node, it's a palindrome
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the list
        Node midNode = findMidNode(head);

        // Step 2: Reverse the second half of the list
        Node prev = null;
        Node curr = midNode;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare left and reversed right half
        Node left = head;
        Node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;

        // Traverse through list and print each node
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main method to test the linked list operations
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);

        ll.addMiddle(2, 3);
        ll.printList();
        System.out.println(ll.isPalindrome());
    }
}
