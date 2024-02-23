import java.util.*;
import java.util.Scanner;
public class Sum_of_first_n_natural_numbers {
    public static void main(String[] args){
        System.out.println("Program to print sum of first n natural numbers : ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = s.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++){
            sum = sum + i;
            System.out.println("Sum of first n Natural numbers are : " + sum);
        }
    }
}
