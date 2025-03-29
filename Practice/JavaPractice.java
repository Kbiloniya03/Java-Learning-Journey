import java.util.*;

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

// public class JavaPractice{
//     public static void main(String args[]){
       
//         int n = 4;      //rows
//         int m = 5;      //columns
//         for(int l = 1; l <= n; l++){
//             for(int s = 1; s <= m; s++){
//                 if(l == 1 || s == 1 || l == n || s == m){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
        
//     }
// }

 
 public class JavaPractice{
    public static void main(String args[]){
       
     
        
    }
}