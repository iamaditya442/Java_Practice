import java.util.*;
import java.util.Scanner;
public class Largest_of_two_numbers {
    public static void main(String[] args){
        System.out.println("Program for Largest of two numbers: ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the Second number: ");
        int b = s.nextInt();
        if(a>b){
            System.out.println("Largest number is FIRST NUMBER : " + a);
        }
        else{
            System.out.println("Largest number is SECOND NUMBER : " + b);
        }
    }
}
