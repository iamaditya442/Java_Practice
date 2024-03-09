import java.util.*;
import java.util.Scanner;
public class Find_Factorial {

    public static int factorial(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args){
        System.out.println("ADITYA VERMA");
        System.out.println("Enter the number to find the factorial : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
}
