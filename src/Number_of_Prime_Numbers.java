import java.util.*;
public class Number_of_Prime_Numbers {
    public static boolean isPrime(int n){
        if(n==2){
            System.out.println(true);
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    public static boolean primeInRange(int n){
        for(int i = 2;i<=n;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
        return true;
    }
    public static void main(String[] args){
        primeInRange(20);
    }
}
