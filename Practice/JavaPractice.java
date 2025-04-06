// import java.util.*;

// // While Loop

//  public class JavaPractice {
//     public static void main(String args[]) {

//         int i = 1;
//         while(i <= 10){
//             System.out.println(i);
//             i++;
//         }
    
//     }
// }

// // For loop

// public class JavaPractice {
//     public static void main(String args[]) {

//         for(int i=1; i<=10; i++){
//             System.out.println(i);
//         }

//     }
// }

// // Do While Loop

// public class JavaPractice {
//     public static void main(String args[]){

//         int i=1;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i <= 10);

//     }
// }

// Break & Continue Statement

// public class JavaPractice {
//     public static void main(String args[]) {  

//        int i = 1;  // Initialization
//        while(i <= 10) {  // Condition
//            if(i == 5) {
//                i++; // Increment before continue to avoid an infinite loop
//                continue;
//            }
//            System.out.println(i);
//            i++; // Increment
//        }
//     }
// }

// //PRATICE PROBLEM
// // 1. CHECK IS NUMBER IS PALINDROME (USING LOOPS)

// public class JavaPractice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 6 Digits Number:- ");
//         int n = sc.nextInt();
//         int number = n;
//         int reverse = 0;

//         for(int i=0; i<n; n/=10){
//             int lastDigit = n%10;
//             reverse = (reverse * 10) + lastDigit;
//         }

//         if(number == reverse){
//             System.out.println(number + " It is Palindrome");
//         }
//         else{
//             System.out.println(number + " It is Not Palindrome");
//         }

//     }
// }

// PRINT STAR PATTERNS

// public class JavaPractice {
//     public static void main(String args[]) {

//         for(int lines = 1; lines <= 4; lines++){
//             for(int star = 1; star <= lines; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }


// public class JavaPractice {
//     public static void main(String args[]) {

//         int n = 5;
//         for(int lines = 1; lines <= n; lines++){
//             for(int star = n; star >= lines; star--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// public class JavaPractice {
//     public static void main(String args[]) {

//     int n = 4;
//     for(int line = 1; line <= n; line++){
//         for(int num = 1; num <= line; num++){
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     }
// }

// public class JavaPractice {
//     public static void main(String args[]) {

//     int n = 4;
//     for(int line = 1; line <= n; line++){
//         for(int num = 4; num <= line; num++){
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     }
// }


// public class JavaPractice {
//     public static void main(String args[]) {
//         int a = 65;
//         char ch = (char) a;
//         System.out.print(a);
//     }
// }

// public class JavaPractice {
//     public static void main(String args[]) {
       
//        int n = 4;
//        char ch = 'A';
//        for(int line = 1; line <= n; line++){
//             for(int chars = 1; chars <= line; chars++){
//                 System.out.print(ch + " ");
//                 ch++;
//             }
//             System.out.println();
//        }

//     }
// }

// public class JavaPractice{
//     public static void main(String args[]) {
//         int n = 4;
//         for(int line = n; line >= 1; line--){
//             for(int num = 1; num <= line; num++){
//                 System.out.print(num + " ");
//             }

//             System.out.println();
//         }
//     }
// }

// PRACTICE PROBLEMS
// 1. FLOYD'S TRIANGEL PATTERN

// public class JavaPractice {
//     public static void main(String args[]) {
//         int n = 5;
//         int num = 1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

// 2. PYRAMID PATTERN

// import java.util.Scanner;

// public class JavaPractice {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();
//         scanner.close();

//         for (int i = 1; i <= rows; i++) {

//             for (int j = 1; j <= rows - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }
            
//             System.out.println();
//         }
//     }
// }


// public class JavaPractice{
//     public static void main(String args[]){
       
//        int rows = 8;
//        for(int line = 1; line <= rows; line++){
//             for(int space = 1; space <= rows - line; space++){
//                 System.out.print(" ");
//             }
//             for(int star = 1; star <= (2*line - 1); star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//        }

//     }
// }

// public class JavaPractice{
//     public static void main(String args[]){
       
//        int rows = 4;
//        for(int line = 1; line <= rows; line++){
//             for(int space = 1; space <= rows - line; space++){
//                 System.out.print(" ");
//             }
//             for(int star = 1; star <= line; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//        }
       

//     }
// }

// public class JavaPractice{
//     public static void main(String args[]){
       
//         int rows = 5;
//         for(int line = 1; line <= rows; line++){
//             for(int num = 1; num <= rows - line + 1; num++){
//                 System.out.print(num + " ");
//             }
//             System.out.println();
//         }

//     }
// }

// public class JavaPractice {
//     public static void main(String args[]) {
       
//         int rows = 5;      // number of rows
//         int columns = 5;   // number of columns
//         for (int currentRow = 1; currentRow <= rows; currentRow++) {
//             for (int space = 1; space <= rows - currentRow; space++) {
//                 System.out.print(" ");
//             }
//             for (int currentColumn = 1; currentColumn <= columns; currentColumn++) {
//                 if (currentRow == 1 || currentColumn == 1 || currentRow == rows || currentColumn == columns) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
            
//             System.out.println();
//         }
        
//     }
// }

 
//  public class JavaPractice{
//     public static void main(String args[]){
       
//      int rows = 5;
//      for(int line = 1; line <= rows; line++){
//         for(int space = 1; space <= rows - line; space++){
//             System.out.print(" ");
//         }
//         for(int star = 1; star <= rows; star++){
//             if(line == 1 || line == rows || star == 1 || star == rows){
//                 System.out.print("* ");
//             }
//             else{
//             System.out.print(" ");
//             }
//         }
//         System.out.println();
//      }
        
//     }
// }

// public class JavaPractice{
//     public static void main(String args[]){
//         int rows = 5;
//         for(int line = 1; line <= rows; line++){
//             for(int space = 1; space <= rows; space++){
//                 System.out.print(" ");
//             }
//             for(int num = 1; num <= line; num++){
//                 System.out.print(num);                
//             }
//             System.out.println();
//         }
//     }
// }

// public class JavaPractice{
//     public static void main(String args[]){
//         int rows = 5;

//         for(int line = 1; line <= rows; line++){

//             for(int space = 1; space <= rows - line; space++){
//                 System.out.print("  ");
//             }

//             for(int num = line; num >= 1; num--){
//                 System.out.print(num + " ");
//             }

//              for(int num = 2; num <= line; num++){
//                 System.out.print(num + " ");                
//             }

//             System.out.println();
//         }
//     }
// }

// public class JavaPractice{
//     public static void main(String args[]){
        
//        int rows = 5;
//        for(int line = 1; line <= rows; line++){
//         for(int star = 1; star <= line; star++){
//             if((line + star)%2 == 0){
//             System.out.print("1");
//             }
//             else{
//             System.out.print("0");
//             }
//         }
//         System.out.println();
//        }

//     }
// }

// public class JavaPractice{
//     public static void printHelloWorld(){
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }

//     public static void main(String args[]){
//         printHelloWorld();
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static void calculateSum(int num1, int num2){
//         int sum = num1 + num2;
//         System.out.print("Sum is " + sum);
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number:- ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number:- ");
//         int b = sc.nextInt();
//         calculateSum(a, b);
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static int product(int a, int b){
//         int pro = a * b;
//         return pro;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number:- ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number:- ");
//         int b = sc.nextInt();

//         int pro = product(a, b);
//         System.out.print("Product is " + pro);

//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static int factorial(int n){

//         if(n < 0){
//             System.out.print("For factorial enter postive no !");
//             return -1;
//         }

//         int fact = 1;
//         for(int i = 1; i <= n; i++){
//             fact *= i;
//         }
//         return fact;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your number:- ");
//         int a = sc.nextInt();
//         int fact = factorial(a);

//         if(fact != -1){
//             System.out.println("Factorial of " + a + " is " + fact);
//         }
//     }
// }

// public class JavaPractice{
//     public static int factorial(int n){
//         int fact = 1;
//         for(int i = 1; i <= n; i++){
//             fact *= i;
//         }
//         return fact;
//     }

//     public static int binoCoeff(int n, int r){
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);
//         int binoCoeff = fact_n/(fact_r*fact_nmr);

//         return binoCoeff;
//     }

//     public static void main(String args[]){
//         System.out.print(binoCoeff(10, 5));
//     }
// }


// public class JavaPractice{
//     public static int sum(int a, int b){
//         return a + b;
//     }

//     public static int sum(int a, int b, int c){
//         return a + b + c;
//     }

//     public static void main(String args[]){
//         System.out.println("Sum of 2 No:- " + sum(5, 3));
//         System.out.println("Sum of 3 No:- " + sum(5, 2, 1));
//     }
// }

// public class JavaPractice{
//     public static int sum(int a, int b){
//         return a + b;
//     }

//     public static float sum(float a, float b){
//         return a + b;
//     }

//     public static void main(String args[]){
//         System.out.println(sum(5, 3));
//         System.out.println(sum(4.2, 5.2));
//     }
// }

// public class JavaPractice{
//     public static int sum(int a, int b){
//         return a + b;
//     }

//     public static float sum(float a, float b){
//         return a + b;
//     }

//     public static void main(String args[]){
//         System.out.println(sum(5, 3));
//         System.out.println(sum(3.2f, 4.8f));
//     }
// }


// import java.util.*;

// public class JavaPractice {
//     public static boolean isPrime(int n) {
//         if (n <= 1) return false; // 0 and 1 are not prime
//         if (n == 2) return true; // 2 is prime
//         if (n % 2 == 0) return false; // Even numbers > 2 are not prime

//         // Loop from 2 to √n for efficiency
//         for (int i = 2; i * i <= n; i++) {
//             if (n % i == 0) {
//                 return false; // Found a divisor, not prime
//             }
//         }

//         return true; // No divisors found, it's prime
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number: ");
//         int n = sc.nextInt();

//         if (isPrime(n)) {
//             System.out.println(n + " is a prime number.");
//         } else {
//             System.out.println(n + " is not a prime number.");
//         }
//     }
// }


// import java.util.*;

// public class JavaPractice{
//     public static boolean isPrime(int n){
//         if(n == 2) return true;
//         if(n <= 1) return false;
//         if(n % 2 == 0) return false;

//         for(int i = 2; i <= Math.sqrt(n); i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void primeInRange(int n){
//         for(int i = 2; i <= n; i++){
//             if(isPrime(i)){
//                 System.out.print(i + " ");
//             }
//         }
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your Number:- ");
//         int n = sc.nextInt();
//         primeInRange(n);
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static void binToDec(int n){
//         int power = 0;
//         int decimal = 0;

//         for(int i = n; i > 0; i /= 10){
//             int lastDigit = i % 10;
//             decimal = decimal + (lastDigit * (int) Math.pow(2, power));
//             power++;
//         }

//         System.out.print(n + " Binary Num Decimal is " + decimal);
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your Binary Number:- ");
//         int n = sc.nextInt();
//         binToDec(n);
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static void main(String args[]){
//         double a = 5;
//         double result = a/2;
//         System.out.print(result);
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static void decToBin(int n){
//         int power = 0;
//         int binary = 0;

//         for(int i = n; i > 0; i/=2){
//             int lastDigit = i % 2;
//             binary = binary + (lastDigit * (int) Math.pow(10, power));
//             power++;
//         }

//         System.out.print("Binary no of " + n + " is " + binary);

//     }
//     public static void main(String args[]){
//       int decimalNo = 9;
//       decToBin(decimalNo);

//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static void average(double a, double b, double c){
//         double avg = (a + b + c)/3;
//         System.out.println("Average of " + a + " " + b + " " + c + " = " + avg);
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number:- ");
//         double a = sc.nextDouble();
//         System.out.print("Enter second number:- ");
//         double b = sc.nextDouble();
//         System.out.print("Enter third number:- ");
//         double c = sc.nextDouble();

//         average(a, b, c);
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static boolean isEven(int n){
//       if(n % 2 == 0){
//         return true;
//       }
//       else{
//         return false;
//       }
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number:- ");
//         int n = sc.nextInt();

//         if(isEven(n)){
//             System.out.print(true);
//         }
//         else{
//             System.out.print(false);
//         }
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static void isPalindrome(int n){
//         int num = n;
//         int rev = 0;

//         for(int i = n; i > 0; i/=10){
//             int lastDigit = i % 10;
//             rev = (rev * 10) + lastDigit;
//         }

//         if(num == rev){
//             System.out.print(n + " is Palindorme Number.");
//         }
//         else{
//             System.out.print(n + " is Not Palindorme Number.");
//         }
        
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number:- ");
//         int n = sc.nextInt();

//         isPalindrome(n);
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static void main(String args[]){
//         int a = -10;
//         int b = 20;
//         int c = 30;

//         System.out.println(Math.abs(a));
//     }
// }


// public class JavaPractice{
//     public static void main(String args[]){
//         int rows = 4;

//         for(int line = 1; line <= rows; line++){

//             for(int star = 1; star <= line; star++){
//                 System.out.print("* ");
//             }

//             for(int space = 1; space <= 2*(rows-line); space++){
//                 System.out.print("  ");
//             }

//             for(int star = 1; star <= line; star++){
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }

//             for(int line = rows; line >= 1; line--){

//             for(int star = 1; star <= line; star++){
//                 System.out.print("* ");
//             }

//             for(int space = 1; space <= 2*(rows-line); space++){
//                 System.out.print("  ");
//             }

//             for(int star = 1; star <= line; star++){
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
        
//     }
// }

// public class JavaPractice{
//     public static void main(String args[]){
//         int rows = 10;
//         for(int i = 1; i <= rows; i++){
//             for(int j = 1; j <= rows - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//          for(int i = rows - 1; i >= 1; i--){
//             for(int j = 1; j <= rows - i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class JavaPractice{
//     public static void main(String args[]){
//         int rows = 5;
//         for(int i = 1; i <= rows; i++){
//             for(int j = 1; j <= rows - i; j++){
//                 System.out.print("  ");
//             }
//             for(int k = 1; k <= (2 * i - 1); k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//          for(int i = rows - 1; i >= 1; i--){
//             for(int j = 1; j <= rows - i; j++){
//                 System.out.print("  ");
//             }
//             for(int k = 1; k <= (2 * i - 1); k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class JavaPractice{
//     public static void hollow_square_with_cross(int n){
//         //1st Half
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <=n; j++){
//                 if((i == j)){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }

//             for(int j = n-1; j >= 1; j--){
//                  if((i == j)){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//                 System.out.println();
//         }

//         //2nd Half
//         for(int i = n-1; i >= 1; i--){
//             for(int j = 1; j <=n; j++){
//                 if((i == j)){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }

//             for(int j = n-1; j >= 1; j--){
//                  if((i == j)){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//                 System.out.println();
//         }
//     }

//     public static void hour_glass(int n, int m){
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= m; j++){
                
//                 if(i == j || i == 1 || i+j == m+1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//         for(int i = n-1; i >= 1; i--){
//             for(int j = 1; j <= m; j++){
                
//                 if(i == j || i == 1 || i+j == m+1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }

//     public static void main(String args[]){
//         int n = 5;
//         int m = 9;
//         // hollow_square_with_cross(n);
//         hour_glass(n, m);
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int marks[] = new int[3];

//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();

//         System.out.println("Marks before updation");
//         System.out.print(marks[0] + " ");
//         System.out.print(marks[1] + " ");
//         System.out.println(marks[2] + " ");

//         marks[0] = marks[0] + 5;
//         marks[1] = marks[1] + 5;
//         marks[2] = marks[2] + 5;

//         System.out.println("Marks after updation");
//         System.out.print(marks[0] + " ");
//         System.out.print(marks[1] + " ");
//         System.out.println(marks[2] + " ");

//         System.out.println("Lenght of Marks Array = " + marks.length);
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static void update(int marks[], int notChangeable){
//         notChangeable = 50;
//         for(int i = 0; i < marks.length; i++){
//             marks[i] =  marks[i] + 5;
//         }
//     }

//     public static void main(String args[]){
//         int marks[] = {50, 60, 70, 80, 90, 100};
//         int notChangeable = 10;
//         update(marks, notChangeable);

//         System.out.println("Not Changeable = " + notChangeable);
//         System.out.print("Marks Array = ");
//         for(int i = 0; i < marks.length; i++){
//             System.out.print(marks[i] + " ");
//         }
//     }
// }


// public class JavaPractice{
//     public static int linearSearch(int numbers[], int key){
//         for(int i = 0; i < numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10;

//         int index = linearSearch(numbers, key);

//         if(index == -1){
//             System.out.print("Not Founded!");
//         }
//         else{
//             System.out.print("Key is at index = " + index);
//         }

//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static int largestNumber(int numbers[]){
//         // - Infinity = Integer.MIN_VALUE
//         int largest = Integer.MIN_VALUE; 

//         for(int i = 0; i < numbers.length; i++){
//             if(largest < numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }

//     public static int smallestNumber(int numbers[]){
//         // + Infinity = Integer.MAX_VALUE
//         int smallest = Integer.MAX_VALUE; 

//         for(int i = 0; i < numbers.length; i++){
//             if(smallest > numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//         return smallest;
//     }

//     public static void main(String args[]){
//         int numbers[] = {1, 2, 6, 3, 5};
//         int largest = largestNumber(numbers);
//         int smallest = smallestNumber(numbers);
        
//         System.out.println("Smallest Number in Array = " + smallest);
//         System.out.println("Largest Number in Array = " + largest);
//     }
// }

// public class JavaPractice{
//     public static int binarySearch(int numbers[], int key){
//             int start = 0;
//             int end = numbers.length - 1;

//             while(start <= end){
//             int mid = (start + end)/2;
//             if(numbers[mid] == key){
//                 return mid;
//             }
//             if(numbers[mid] < key){
//                 start = mid + 1;
//             }
//             else{
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
//         int key = 10;

//         int index = binarySearch(numbers, key);
//         if(index == -1){
//             System.out.print("Key Not Founded!");
//         }
//         else{
//             System.out.print("Key is at index = " + index);
//         }

//     }
// }

// public class JavaPractice{
//     public static void printPairs(int numbers[]){
//        for(int i = 0; i < numbers.length; i++){
//         int curr =  numbers[i];
//             for(int j = i + 1; j < numbers.length; j++){
//                 System.out.print("(" + curr + ", " + numbers[j] + ") ");
//             }
//             System.out.println();
//        }

//     }

//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10};
//         printPairs(numbers);
//     }
// }

// public class JavaPractice{
//     public static void printSubArray(int numbers[]){

//         for(int i = 0; i < numbers.length; i++){
//             int start = i;

//             for(int j = i; j < numbers.length; j++){
//                 int end = j;

//                 for(int k = start; k <= end; k++){
//                     System.out.print(numbers[k] + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }

//     }

//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10};
//        printSubArray(numbers);
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static void maxSumSubArray2(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         int currSum = 0;
//         int preflix[] = new int[numbers.length];

//         preflix[0] = numbers[0];

//         for(int i = 1; i < numbers.length; i++){
//             preflix[i] = preflix[i-1] + numbers[i];
//         }

//         for(int i = 0; i < numbers.length; i++){
//             int start = i;

//             for(int j = i + 1; j < numbers.length; j++){
//                 int end = j;

//                 currSum = start == 0 ? preflix[end] : preflix[end] - preflix[start - 1];

//                 if(currSum > largest){
//                     largest = currSum;
//                 }
//             }
//         }
//             System.out.println("Maximum of Subarray = " + largest);
//     } 

//     public static void main(String args[]){
//         int numbers[] = {1, -2, 6, -1, 3};
//         maxSumSubArray2(numbers);
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static void kadane(int numbers[]){
//         int maxSum = Integer.MIN_VALUE; 
//         int currSum = 0;

//         for(int i = 0; i < numbers.length; i++){
//             currSum = currSum + numbers[i];
//             if(currSum < 0){
//                 currSum = -1;
//             }

//             maxSum = Math.max(currSum, maxSum);
//         }  
//         System.out.print(maxSum);
//     }

//     public static void main(String args[]){
//         int numbers[] = {-10, -9, -2, -3, -4, -5};
//         kadane(numbers);
        
//     }
// }

// public class JavaPractice{
//     public static void sort(int array[]){
//         for(int i = 0; i < array.length; i++){
//             for(int j = i + 1; j < array.length; j++){
//                 if(array[i] < array[j]){
//                     int temp = array[j];
//                     array[j] = array[i];
//                     array[i] = temp;
//                 }
//             }
//         }

//     }

//     public static void main(String args[]){
//         int array[] = {5, 2, 4, 1, 6, 3};
//         sort(array);
        
//         System.out.print("Sorted Array = ");

//         for(int i = 0; i < array.length; i++){
//             System.out.print(array[i] + " ");
//         }
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static int trappedRainWater(int height[]){

//         //Calculation Left Max Boundary
//         int leftMax[] = new int[height.length];
//         leftMax[0] = height[0];

//         for(int i = 1; i < height.length; i++){
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }

//         //Calculation Right Max Boundary
//         int rightMax[] = new int[height.length];
//         rightMax[height.length - 1] = height[height.length - 1];

//         for(int i = height.length - 2; i >= 0; i--){
//             rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//         }

//         int trappedWater = 0;

//         //loop
//         for(int i = 0; i < height.length; i++){
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);

//             trappedWater += waterLevel - height[i];
//         }

//         return trappedWater;

//     }

//     public static void main(String args[]){
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.print("Trappped Water = " + trappedRainWater(height));
//     }
// }

// public class JavaPractice{
//     public static boolean isNumRepeat(int nums[]){
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i + 1; j < nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]){
//         int nums[] ={1, 2, 3, 4};
//         System.out.println(isNumRepeat(nums));
//     }
// }

// public class JavaPractice{
//     public static int target(int nums[], int key){
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]){
//         int nums[] = {4, 5, 6, 7, 0, 1, 2};
//         int key = 0;
//         int index = target(nums, key);
//         System.out.print(index);

//     }
// }

