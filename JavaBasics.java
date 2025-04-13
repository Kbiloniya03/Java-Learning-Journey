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

