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

public class JavaPractice {
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