import java.util.*;
import java.util.Scanner;
public class Binomial_coefficient {

    public static int factorial(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f * i;
        }
        return f;
    }

    public static int bicff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int n_r = factorial(n-r );
        int bicff = fact_n / (fact_r * n_r) ;
        return bicff;
    }

    public static void main(String[] args){
        System.out.println("ADITYA VERMA");
        System.out.println(bicff(5,2));
    }
}
