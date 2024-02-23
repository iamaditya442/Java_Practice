import java.util.*;
import java.util.Scanner;
public class Reverse_of_Number {
    public static void main(String[] args){
        System.out.println("Program for REVERSE OF A NUMBER  : ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to REVERSE : ");
        int a = s.nextInt();
        System.out.println("Reverse of given number is as follows: ");
        while(a>0){
            int lastDigit = a%10;
            System.out.print(lastDigit);
            a = a/10;
        }
    }
}
