import java.util.*;
import java.util.Scanner;
public class Multiplication_using_functions {
    public static int multiply(int a, int b){
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = s.nextInt();
        System.out.println("Enter the second number : ");
        int b = s.nextInt();
        int ne = multiply(a,b);
        System.out.println("Product of two numbers is : "+ne);
    }
}
