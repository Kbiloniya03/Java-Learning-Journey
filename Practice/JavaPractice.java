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
//     public static int sum(int n){

//         if(n < 0){
//             System.out.print("For sum enter postive no !");
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
//         int fact = sum(a);

//         if(fact != -1){
//             System.out.println("sum of " + a + " is " + fact);
//         }
//     }
// }

// public class JavaPractice{
//     public static int sum(int n){
//         int fact = 1;
//         for(int i = 1; i <= n; i++){
//             fact *= i;
//         }
//         return fact;
//     }

//     public static int binoCoeff(int n, int r){
//         int fact_n = sum(n);
//         int fact_r = sum(r);
//         int fact_nmr = sum(n-r);
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

// import java.util.*;

// public class JavaPractice{
//     public static int stock(int prices[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i = 0; i < prices.length; i++){
//             if(buyPrice > prices[i]){
//                 buyPrice = prices[i];
//             }
//             else{
//                 int profit = prices[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit, profit);
//             }
//         }

//         return maxProfit;
//     }

//     public static void main(String args[]){
//         int prices[] = {7, 1, 5, 3, 6, 4};
//         System.out.println("Maximum Profit is = " + stock(prices));
//     }
// }


// import java.util.*;

// public class JavaPractice {
//     public static void bubbleSort(int nums[]) {
//         int n = nums.length;
//         for(int i = 0; i < n - 1; i++){
//             for(int j = 0; j < (n - i - 1); j++){
//                 if(nums[j] > nums[j + 1]){
//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int nums[] = {5, 4, 1, 3, 2};
//         bubbleSort(nums);
//         System.out.print("Sorted Array = ");
//         for (int i = 0; i < nums.length; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }


// public class JavaPractice {
//     public static void insertionSort(int nums[]) {
//         int n = nums.length;
//         for(int i = 1; i < n; i++){
//             int curr = nums[i];
//             int prev = i-1;

//             while(prev >= 0 && nums[prev] > curr){
//                 nums[prev+1] = nums[prev];
//                 prev--;
//             }
//             nums[prev+1] = curr;
//         }
        
//     }

//     public static void main(String args[]) {
//         int nums[] = {5, 4, 1, 3, 2};
//         insertionSort(nums);
//         System.out.print("Insertion Sorted Array = ");
//         for (int i = 0; i < nums.length; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }

// import java.util.Arrays;

// public class JavaPractice {
//     public static void main(String args[]) {
//         int nums[] = {5, 4, 1, 3, 2, 6, 9, 8, 7};
//         Arrays.sort(nums, 0, 5);

//         for(int i = 0; i < nums.length; i++){
//             System.out.print(nums[i] + " ");
//         }
//     }
// }


// import java.util.Arrays;
// import java.util.Collections;


// public class JavaPractice {
//     public static void main(String args[]) {
//         Integer nums[] = {5, 4, 1, 3, 2, 6, 9, 8, 7};
//         Arrays.sort(nums, Collections.reverseOrder());

//         for(int i = 0; i < nums.length; i++){
//             System.out.print(nums[i] + " ");
//         }
//     }
// }

// import java.util.*;

// public class JavaPractice {
//     public static void countingSort(int nums[]){
//         int maximum = Integer.MIN_VALUE;
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] > maximum){
//                 maximum = nums[i];
//             }
//         }

//         int count[] = new int[maximum + 1];

//         for(int i = 0; i < nums.length; i++){
//             count[nums[i]] = count[nums[i]] + 1;
//         }

//         int index = 0;

//         for(int i = 0; i < count.length; i++){
//             while(count[i] > 0){
//                 nums[index] = i;
//                 index++;
//                 count[i]--;
//             }
//         }

//     }

//     public static void main(String args[]) {
//        int nums[] = {1, 4, 1, 3, 2, 4, 3, 7};
//        countingSort(nums);

//        for(int i = 0; i < nums.length; i++){
//         System.out.print(nums[i] + " ");
//        }
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static void bubbleSort(int arr[]){
//         int n = arr.length;
//         for(int i = 0; i < n - 1; i++){
//             for(int j = 0; j < (n - i - 1); j++){
//                 if(arr[j] < arr[j + 1]){
//                     int temp = arr[j + 1];
//                     arr[j + 1] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//     }

//     public static void selectionSort(int arr[]){
//         int n = arr.length;
//         for(int i = 0; i < n - 1; i++){
//             int index = i;
//             for(int j = i + 1; j < n; j++){
//                 if(arr[index] < arr[j]){
//                  index = j;
//                 }
//             }
//             int temp = arr[index];
//             arr[index] = arr[i];
//             arr[i] = temp;
//         }   
//     }

//     public static void insertionSort(int arr[]){
//         for(int i = 1; i < arr.length; i++){
//             int curr = arr[i];
//             int j = i - 1;
//             while(j >= 0 && curr > arr[j]){
//                 arr[j + 1] =  arr[j];
//                 j--;
//             }
//             arr[j + 1] = curr;
//         }
//     }

//     public static void countingSort(int arr[]){
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }

//         int count[] = new int[max + 1];

//         for(int i = 0; i < arr.length; i++){
//             count[arr[i]] = count[arr[i]] + 1;
//         }

//         int index = arr.length - 1;

//         for(int i = 0; i < count.length; i++){
//             while(count[i] > 0){
//                 arr[index] = i;
//                 index--;
//                 count[i]--;
//             }
//         }
//     }

//     public static void printArray(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String args[]){
//         int nums[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
//         // bubbleSort(nums);
//         // selectionSort(nums);
//         insertionSort(nums);
//         // countingSort(nums);

//         printArray(nums);
//     }

// }

// import java.util.*;

// public class JavaPractice{
//     public static void main(String args[]){
//         int arr[][] = new int[4][4];
//         int rows = arr.length;
//         int columns = arr[0].length; 
//         Scanner sc = new Scanner(System.in);

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<columns; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<columns; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static boolean search(int arr[][], int key){
//         int rows = arr.length;
//         int columns = arr[0]. length;

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<columns; j++){
//                 if(arr[i][j] == key){
//                     System.out.print("Key is founded at cell = " + "(" + i + "," + j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.print("Key is not founded");
//         return false;
//     }

//     public static int largest(int arr[][]){
//         int rows = arr.length;
//         int columns = arr[0].length;
//         int largest = Integer.MIN_VALUE;

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<columns; j++){
//                 if(arr[i][j] > largest){
//                     largest = arr[i][j];
//                 }
//             }
//         }

//         return largest;
//     }

//     public static int smallest(int arr[][]){
//         int rows = arr.length;
//         int columns = arr[0].length;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<columns; j++){
//                 if(arr[i][j] < smallest){
//                     smallest = arr[i][j];
//                 }
//             }
//         }

//         return smallest;
//     }

//     public static void main(String args[]){
//         int arr[][] = new int[3][3];
//         int rows = arr.length;
//         int columns = arr[0].length; 
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter 2D Arrays Numbers(3x3) :- ");
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<columns; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         // Seacrh Method
//         System.out.print("Enter Key number :- ");
//         int key = sc.nextInt();
//         search(arr, key);

//         System.out.println();

//         // Largest Method
//         System.out.print("Largest Numbers in 2D Arrays is = " + largest(arr));

//         System.out.println();

//         // Smallest Method
//         System.out.print("Smallest Numbers in 2D Arrays is = " + smallest(arr));

//     }
// }

// public class JavaPractice{
//     public static void spiral(int arr[][]){
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = arr.length - 1;
//         int endCol = arr[0].length - 1;

//         while(startRow <= endRow && startCol <= endCol){
//             //1st
//             for(int i = startRow; i <= endRow; i++){
//                 System.out.print(arr[startRow][i] + " ");
//             }

//             //2nd 
//             for(int j = startCol + 1; j <= endCol; j++){
//                 System.out.print(arr[j][endCol] + " ");
//             }

//             //3rd 
//             for(int i = endRow - 1; i >= startRow; i--){
//                 System.out.print(arr[endRow][i] + " ");
//             }

//             //4th 
//             for(int j = endCol - 1; j > startCol; j--){
//                 System.out.print(arr[j][startCol] + " ");
//             }

//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;
//         }
//     }

//     public static void main(String args[]){
//         int arr[][] = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16},
//         };

//         spiral(arr);
//     }
// }


// public class JavaPractice{
//     public static void diagonalSum(int arr[][]){
//         int sum = 0;

//         for(int i = 0; i < arr.length; i++){
//             sum+= arr[i][i];
//             if(i != arr.length - i -1){
//                 sum += arr[i][arr.length - i -1];
//             }
//         }

//         System.out.print("Diagonal Sum = " + sum);
//     }

//     public static void main(String args[]){
//         int arr[][] = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16},
//         };

//         diagonalSum(arr);
//     }
// }

// public class JavaPractice{
//     public static boolean bruteForce(int arr[][], int key){
//         int rows = arr.length;
//         int columns = arr[0].length;

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<columns; j++){
//                 if(arr[i][j] == key){
//                     System.out.print(key + " Key is found at cell = " + "(" + i + "," + j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.print("Key is not found");
//         return false;
//     }

//     public static boolean binarySearch(int arr[][], int key){
//         int row = 0;
//         int columns = arr[0].length - 1;

//         while(row < arr.length && columns >= 0){
//             if(arr[row][columns] == key){
//                 System.out.println("Key is at cell = " + "(" + row + "," + columns + ")");
//                 return true;
//             }
//             else if(arr[row][columns] < key){
//                 row++;
//             }
//             else if(arr[row][columns] > key){
//                 columns--;
//             }
//         }

//         System.out.println("Key is not found");
//         return false;
//     }

//     public static void main(String args[]){
//         int arr[][] = {
//             {10, 20, 30, 40},
//             {15, 25, 35, 45},
//             {27, 29, 37, 48},
//             {32, 33, 39, 50},
//         };

//         int key = 33;

//         // bruteForce(arr, key);
//         binarySearch(arr,key);
//     }
// }

// public class JavaPractice{
//     public static void swapArray(int arr[][]){
//         int row = arr.length;
//         int column = arr[0].length;
//         int[][] transpose = new int [column][row];
//         for(int i=0; i<row; i++){
//             for(int j=0; j<column; j++){
//                 transpose[j][i] =arr[i][j];
//              }
//         }

//         for(int i=0; i<transpose.length; i++){
//             for(int j=0; j<transpose[0].length; j++){
//                 System.out.print(transpose[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         int arr[][] = {
//             {11, 12, 13},
//             {21, 22, 23},
//         };

//         swapArray(arr);
//     }
// }


// public class JavaPractice{
//     public static boolean isPalindrome(String word){
//        int n = word.length();

//         for(int i = 0; i < n/2; i++){
//             if(word.charAt(i) != word.charAt(n - i -1)){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]){
//         String word = "racecar";
//         System.out.print(isPalindrome(word));
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static float shortestPath(String path){
//         int x = 0;
//         int y = 0;
       
//        for(int i = 0; i < path.length(); i++){
//         //North
//         if(path.charAt(i) == 'N'){
//             y++;
//         }
//         //East
//         else if(path.charAt(i) == 'E'){
//             x++;
//         }
//         //South
//         else if(path.charAt(i) == 'S'){
//             y--;
//         }
//         //West
//         else{
//             x--;
//         }
//        }

//        int x2 = x*x;
//        int y2 = y*y;

//        return (float) Math.sqrt(x2 + y2);
//     }

//     public static void main(String args[]){
//         String path = "WNEENESENNN";
//         System.out.print("Shortest Path = " + shortestPath(path));
        
//     }
// }


// public class JavaPractice{
//     public static void main(String args[]){
//         String s1 = "Kapil";
//         String s2 = "Kapil";
//         String s3 = new String("Kapil");

//         // 1st case (Equal to)
//         if(s1 == s2){
//             System.out.println("Strings are equal");
//         }
//         else{
//             System.out.println("Strings are not equal");
//         }

//         // 2nd case (Not Equal to)
//         if(s1 == s3){
//             System.out.println("Strings are equal");
//         }
//         else{
//             System.out.println("Strings are not equal");
//         }

//         // 3rd case (Equal to)
//         if(s1.equals(s3)){
//             System.out.println("Strings are equal");
//         }
//         else{
//             System.out.println("Strings are not equal");
//         }
//     }
// }


// public class JavaPractice{
//     public static String subString(String str, int si, int ei){
//         String subStr = "";
//         for(int i = si; i < ei; i++){
//             subStr += str.charAt(i);
//         }
//         return subStr;
//     }

//     public static void main(String args[]){
//         String str = "HelloWorld";
//         System.out.println(subString(str, 0, 5));

//     }
// }

// public class JavaPractice {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello");

//         sb.append(" World");            
//         System.out.println(sb.toString());
//         //Output = "Hello World"

//         sb.insert(5, ",");             
//         System.out.println(sb.toString());
//         //Output = "Hello, World"

//         sb.replace(7, 12, "Java");     
//         System.out.println(sb.toString());
//         //Output = "Hello, Java  "

//         sb.reverse();                  
//         System.out.println(sb.toString());
//         //Output = "avaJ ,oellH"

//         sb.delete(0, 5);                
//         System.out.println(sb.toString());
//         //Output = ",oellH"

//         sb.reverse();                   
//         System.out.println(sb.toString());
//         //Output = "Hello,"
//     }
// }

// public class JavaPractice {
//     public static String toCapitalCase(String str) {
//         StringBuilder sb = new StringBuilder();
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for(int i = 1; i < str.length(); i++){
//             if(str.charAt(i) == ' '){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }
//             else{
//                 sb.append(str.charAt(i));
//             }
//         }
//        return sb.toString();
//     }

//     public static void main(String[] args) {
//         String str = "hi, i am kapil";
//         String result = toCapitalCase(str);
//         System.out.println(result);  // Output: Hi. I Am Kapil
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static int countSmallCaseVowels(String str){
//         int n = str.length();
//         int count = 0;

//         for(int i = 0; i < n; i++){
//             if(
//                 str.charAt(i) == 'a' ||
//                 str.charAt(i) == 'e' ||
//                 str.charAt(i) == 'i' ||
//                 str.charAt(i) == 'o' ||
//                 str.charAt(i) == 'u' 
//             ){
//                 count++;
//             }
//         }

//         return count;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your Word or Sentence:- ");
//         String str = sc.nextLine();
//         System.out.println(countSmallCaseVowels(str));
//         sc.close();
//     }
// }

// import java.util.Arrays;

// public class JavaPractice{
//     public static void isAnagram(String str1, String str2){
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();

//        if(str1.length() == str2.length()){
//         //Convert string to char array
//         char[] str1charArray = str1.toCharArray();
//         char[] str2charArray = str2.toCharArray();

//         //Sort the char array
//         Arrays.sort(str1charArray);
//         Arrays.sort(str2charArray);

//         //Checking if both are equal or not
//         boolean result = Arrays.equals(str1charArray, str2charArray);
//         if(result){
//             System.out.println(str1 + " and " + str2 + " are anagrams of each other");
//         }
//         else{
//             System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
//         }
//        }


//     }
//     public static void main(String args[]){
//         String str1 = "race";
//         String str2 = "care";

//         isAnagram(str1, str2);
//     }
// }

// import java.util.*;

// public class JavaPractice{
//     public static String tolowercase(String str){
//         StringBuilder sb = new StringBuilder();
//         int n = str.length();

//         for(int i=0; i<n; i++){
//             char ch = Character.toLowerCase(str.charAt(i));
//             sb.append(ch);
//         }

//         return sb.toString();
//     }

//     public static char[] stringToCharArray(String str){
//         char charArray[] = new char[str.length()];

//         for(int i = 0; i < charArray.length; i++){
//             charArray[i] = str.charAt(i);
//         }

//         return charArray;
//     }

//     public static void sortArray(char arr[]){
//         for(int i = 0; i < arr.length - 1; i++){
//             for(int j = 0; j < arr.length - i - 1; j++){
//                 if(arr[j] > arr[j + 1]){
//                     char temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static boolean arraysEqualTo(char[] arr1, char[] arr2) {
//         if (arr1.length != arr2.length) return false;

//         for (int i = 0; i < arr1.length; i++) {
//             if (arr1[i] != arr2[i]) return false;
//         }
        
//         return true;
//     }    

//     public static void isAnagram(String str1, String str2){
//         str1 = tolowercase(str1);
//         str2 = tolowercase(str2);

//         if(str1.length() == str2.length()){
//             char arr1[] = stringToCharArray(str1);
//             char arr2[] = stringToCharArray(str2);

//             sortArray(arr1);
//             sortArray(arr2);

//             boolean result = arraysEqualTo(arr1, arr2);

//             if(result){
//                 System.out.println(str1 + " and " + str2 + " are anagrams of each other");
//             }
//             else{
//                 System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
//             }
//         }
//         else{
//             System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
//         }        
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         //Input String 1 and 2 from user
//         System.out.print("Enter 1st String:- ");
//         String str1 = sc.nextLine();
//         System.out.print("Enter 2nd String:- ");
//         String str2 = sc.nextLine();
//         sc.close();

//         isAnagram(str1, str2);
//     }
// }

// public class JavaPractice{
//     public static String compress(String str){
//         StringBuilder sb = new StringBuilder();

//         for(int i = 0; i < str.length(); i++){
//             Integer count = 1;
//             while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
//                 count++;
//                 i++;
//             }
//             if(count > 1){
//                 sb.append(str.charAt(i));
//                 sb.append(count.toString());
//             }
//             else{
//                 sb.append(str.charAt(i));
//             }
//         }

//         return sb.length() > str.length() ? str : sb.toString();
//     }
//     public static void main(String args[]){
//        String str = "aaabbcccdd";
//        System.out.println(compress(str));
//     }
// }


// public class JavaPractice{
//     public static int countSetInBit(int n){
//       int count = 0;
//       while (n > 0) {
//         if((n & 1) == 1){
//             count++;
//         }
//         n = n >> 1;
//       }

//       return count;
//     }
//     public static void main(String args[]){
//         int n = 21;
//         System.out.println(countSetInBit(n));

//     }
// }   

// public class JavaPractice{
//     public static int fastExpo(int a, int n){
//       int ans = 1;
//       while(n > 0){
//         if((n &1) != 0){
//             ans = ans * a;
//         }

//         a = a * a;
//         n = n >> 1;
//       }
//       return ans;
//     }
//     public static void main(String args[]){
//         int n = 5;
//         int a = 3;
//         System.out.println(fastExpo(a, n));

//     }
// }   

// public class JavaPractice {
//     public static void main(String[] args) {
//         // Create a student object
//         Students s1 = new Students();

//         // Set values
//         s1.setName("Ravi");
//         s1.setAge(16);
//         s1.setMarks(75);

//         // Print student details
//         System.out.println("Name  : " + s1.name);
//         System.out.println("Age   : " + s1.age);
//         System.out.println("Marks : " + s1.marks);

//         // Check and print result
//         if (s1.isPass()) {
//             System.out.println("Result: Pass");
//         } else {
//             System.out.println("Result: Fail");
//         }
//     }
// }



// class Students {
//     // Properties / Variables (data)
//     String name;
//     int age;
//     int marks;

//     // Setter Methods 
//     void setName(String newName) {
//         name = newName;
//     }

//     void setAge(int newAge) {
//         age = newAge;
//     }

//     void setMarks(int newMarks) {
//         marks = newMarks;
//     }

//     // Method to check if the student passed using the class's marks variable
//     boolean isPass() {
//         if (marks < 33) {
//             return false;
//         } else {
//             return true;
//         }
//     }
// }


// public class JavaPractice{
//     public static void main(String args[]){
//         BankAccount bankAcc = new BankAccount();
//         bankAcc.showBalance();
//     }
// }

// class BankAccount {
//     private int balance = 5000;

//     public void showBalance(){
//         System.out.println("Balance = " + balance);
//     }
// }

// public class JavaPractice {
//     public static void main(String args[]) {
//         int marks[] = {80, 90, 100};
//         Student stu = new Student("Kapil", 20, marks);
//         System.out.println(stu.marks[0]);

//         Student stu2 = new Student(stu);
//         stu.marks[0] = 85;
//         System.out.println(stu2.marks[0]);
//     }     
// }


// // Student.java
// class Student {
//    String name;
//    int age;
//    int marks[];

//    Student(String name, int age, int marks[]){
//     this.name = name;
//     this.age = age;
//     this.marks = marks;
//    }

//    Student(Student stu){
//     this.name = stu.name;
//     this.age = stu.age;
//     this.marks = stu.marks;
//    }
// }


// public class JavaPractice {
//     public static void main(String args[]) {
//         int[] marks = {80, 90, 100};        
//         Student stu = new Student("Kapil", 20, marks);  
//         System.out.println(stu.marks[0]);

//         Student stu2 = new Student(stu);    
//         stu.marks[0] = 85;                  
//         System.out.println(stu2.marks[0]);  
//     }     
// }

// class Student {
//     String name;
//     int age;
//     int[] marks;

//     Student(String name, int age, int[] marks) {
//         this.name = name;
//         this.age = age;
//         this.marks = marks;
//     }

//     Student(Student stu) {
//         this.name = stu.name;
//         this.age = stu.age;
//         this.marks = new int[stu.marks.length];
//         for (int i = 0; i < this.marks.length; i++) {
//             this.marks[i] = stu.marks[i];
//         }
//     }
// }


// class Animal {
//     void eat() {
//         System.out.println("Eating...");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Barking...");
//     }
// }

// class Puppy extends Dog {
//     void weep() {
//         System.out.println("Weeping...");
//     }
// }

// public class JavaPractice {
//     public static void main(String[] args) {
//         Puppy puppy = new Puppy();
//         puppy.eat();   // From Animal
//         puppy.bark();  // From Dog
//         puppy.weep();  // From Puppy
//     }
// }

// abstract class Animal {
//     Animal() {
//         System.out.println("Animal's Class Constructor");
//     }

//     void sleep() {
//         System.out.println("Sleeping...");
//     }

//     abstract void makeSound();
// }

// class Dog extends Animal{
//     Dog() {
//         System.out.println("Dog's Class Constructor");
//     }

//     void makeSound() {
//         System.out.println("Bark Bark...");
//     }
// }


// class Cat extends Animal{
//     Cat() {
//         System.out.println("Cat's Class Constructor");
//     }

//     void makeSound() {
//         System.out.println("Meow Meow...");
//     }
// }

// public class JavaPractice{
//     public static void main(String args[]){
//         Dog dog = new Dog();
//         Cat cat = new Cat();

//         dog.makeSound();
//         cat.makeSound();
//     }
// }


// class Student {
//     String name;
//     int rollNo;
//     static String schoolName;

//     Student(String name, int rollNo) {
//         this.name = name;
//         this.rollNo = rollNo;
//     }

//     void display() {
//         System.out.println(name + " - " + rollNo + " - " + schoolName);
//     }
// }

// public class JavaPractice {
//     public static void main(String args[]) {
//         Student.schoolName = "Ramjas No 5";  // Set static variable using class name

//         Student stu1 = new Student("Aman", 101);
//         Student stu2 = new Student("Neha", 102);

//         stu1.display();  // Aman - 101 - Ramjas No 5
//         stu2.display();  // Neha - 102 - Ramjas No 5
//     }
// }


// class Parent {
//     String name;

//     // Parameterized constructor
//     Parent(String name) {
//         this.name = name;
//         System.out.println("Parent Constructor Called with name: " + name);
//     }

//     void display() {
//         System.out.println("Name from Parent: " + name);
//     }
// }

// class Child extends Parent {

//     int age;

//     // Child constructor calling parent constructor using super
//     Child(String name, int age) {
//         super(name);  // Calls Parent(String name) constructor
//         this.age = age;
//         System.out.println("Child Constructor Called with age: " + age);
//     }

//     void display() {
//         super.display();  // calling parent method
//         System.out.println("Age from Child: " + age);
//     }
// }

// public class JavaPractice {
//     public static void main(String[] args) {
//         Child obj = new Child("Amit", 20);
//         obj.display();
//     }
// }

// public class JavaPractice{
//     public static int fib(int n){
//         if(n == 0) return 0;
//         if(n == 1) return 1;

//         int f1 = fib(n - 1); 
//         int f2 = fib(n - 2);
//         return f1 + f2;
//     }
//     public static void main(String args[]){
//         int n = 5;
//         System.out.println(n + " Fibonacci no = " + fib(n));
//     }
// }


// public class JavaPractice{
//     public static boolean isSorted(int arr[], int i){
//       if(i == arr.length - 1){
//         return true;
//       }

//       if(arr[i] > arr[i + 1]){
//         return false;
//       }

//       return isSorted(arr, i + 1);

//     }
//     public static void main(String args[]){
//         int arr[] = {1, 2, 3, 4, 5};
//         int i = 0;
//         System.out.println(isSorted(arr, i));
//     }
// }

// public class JavaPractice {
//     public static int friendPairing(int n) {
//         // Base Cases
//         if (n == 1 || n == 0) return 1;
//         if (n == 2) return 2;

//         // Recurrence Relation:
//         // 1. Friend stays single -> friendPairing(n - 1)
//         int staySingle = friendPairing(n - 1);

//         // 2. Friend pairs with (n - 1) others -> (n - 1) * friendPairing(n - 2)
//         int pairs = (n - 1) * friendPairing(n - 2);
//         return staySingle + pairs;
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         System.out.println(friendPairing(n)); // Output: 4
//     }
// }


// public class JavaPractice {
//     public static void printArray(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void merge(int arr1[], int arr2[], int mergeArr[], int i, int j, int k){
//         // Base Case 
//         if(i == arr1.length){
//             while (j < arr2.length) {
//                 mergeArr[k] = arr2[j];
//                 k++;
//                 j++;
//             }
//             return;
//         }

//         if(j == arr2.length){
//             while (i < arr1.length) {
//                 mergeArr[k] = arr1[i];
//                 k++;
//                 i++;
//             }
//             return;
//         }

//         if(arr1[i] > arr2[j]){
//             mergeArr[k] = arr1[i];
//             merge(arr1, arr2, mergeArr, i + 1, j, k + 1);
//         } else {
//             mergeArr[k] = arr2[j];
//             merge(arr1, arr2, mergeArr, i, j + 1, k + 1);
//         }
//     }
//     public static void main(String[] args) {
//         int arr1[] = {9, 6, 3};
//         int arr2[] = {8, 5, 2};

//         int mergeArr[] = new int[arr1.length + arr2.length];
//         merge(arr1, arr2, mergeArr, 0, 0, 0);

//         printArray(mergeArr);
//     }
// }

// public class JavaPractice{
//     public static void printArray(int arr[]) {
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void merge(int arr[], int si, int mid, int ei){

//     }

//     public static void mergeSort(int arr[], int si, int ei){
//         if(si == ei){
//             return;
//         }

//         int mid = (si + ei)/2;          // Calculating mid part
//         mergeSort(arr, si, mid);        // Left part
//         mergeSort(arr, mid + 1, ei);    // Rigth part
//         merge(arr, si, mid, ei);        // Calling merge function

//     }
//     public static void main(String args[]){
//         int arr[] = {6, 3, 9, 5, 2, 8};
//         mergeSort(arr, 0, arr.length - 1);
//         printArray(arr);
//     }
// }

// public class JavaPractice{
//     public static int search(int arr[], int target) {
//         int start = 0;
//         int end = arr.length - 1;
    
//         while(start <= end) {
//             int mid = start + (end - start) / 2;
    
//             if(arr[mid] == target) {
//                 return mid; // Found it!
//             }
    
//             // Left half is sorted
//             if(arr[start] <= arr[mid]) {
//                 // Check if target lies in the left half
//                 if(arr[start] <= target && target < arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             } 
//             // Right half is sorted
//             else {
//                 if(arr[mid] < target && target <= arr[end]) {
//                     start = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             }
//         }
//         return -1; // Not found
//     }    
    
//     public static void main(String args[]){
//         int arr[] = {4, 5, 6, 7, 0, 1, 2};
//         int target = 0;

//         int index = search(arr, target);
//         if(index == -1){
//             System.out.println("Target is not found");
//         } else {
//             System.out.println("Target is at index of = " + index);
//         }
//     }
// }



// public class JavaPractice{
//     public static void printArray(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void modifiedBubbleSort(int arr[]){
//         for(int i = 0; i < arr.length - 1; i++){
//             boolean swap = false;
//             for(int j = 0; j < arr.length - 1 - i; j++){
//                 if(arr[j] > arr[j + 1]){
//                     int temp = arr[j + 1];
//                     arr[j + 1] = arr[j];
//                     arr[j] = temp;
//                     swap = true;
//                 }
//             }

//             if(swap == false){
//                 break;
//             }
//         }
//     }

//     public static int binarySearch(int arr[], int target){
//         int start = 0;
//         int end = arr.length - 1;

//         while (start <= end) {
//             int mid = (end + start)/2;

//             if(arr[mid] ==  target){
//                 return mid;
//             }

//             if(arr[mid] > target){
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }

//         return -1;
//     }

//     public static void backTracking(int arr[], int i, int j){
//      if(i == arr.length){
//         printArray(arr);
//         return;
//      }

//      arr[i] = j;
//      backTracking(arr, i + 1, j + 1);
//      arr[i] -= 2;
//     }
//     public static void main(String args[]){
//         int arr[] = new int[5];
//         backTracking(arr, 0, 1);
//         printArray(arr);
//     }
// }

// import java.util.ArrayList;

// public class JavaPractice {
//     // Function to find if a pair exists with given target sum in a sorted & rotated array
//     public static boolean pairSum2(ArrayList<Integer> list, int target) {
//         int n = list.size();
//         int pivot = -1;

//         // Find the pivot (the point where the next element is smaller)
//         for (int i = 0; i < n - 1; i++) {
//             if (list.get(i) > list.get(i + 1)) {
//                 pivot = i;
//                 break;
//             }
//         }

//         int left = (pivot + 1) % n; // smallest element
//         int right = pivot;          // largest element

//         // Use two pointers to find if a pair exists
//         while (left != right) {
//             int sum = list.get(left) + list.get(right);

//             if (sum == target) {
//                 return true; // Pair found
//             }

//             if (sum < target) {
//                 left = (left + 1) % n; // Move left pointer forward (circular)
//             } else {
//                 right = (n + right - 1) % n; // Move right pointer backward (circular)
//             }
//         }

//         return false; // No pair found
//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         int target = 16;

//         // Add elements to the list (sorted + rotated)
//         list.add(11);
//         list.add(15);
//         list.add(6);
//         list.add(8);
//         list.add(9);
//         list.add(10);

//         // Check for pair sum
//         System.out.println(pairSum2(list, target)); // Output: true
//     }
// }


