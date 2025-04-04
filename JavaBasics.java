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