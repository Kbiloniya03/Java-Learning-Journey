//Practicing java in this file

import java.util.*;

public class JavaPractice {
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