import java.util.*;
public class Butterfly_pattern {
    public static void butterflyPattern(int n){
        for(int i=1;i<=n;i++){
            //STARS
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //SPACE
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //BOTTOM PART

        for(int i=n;i>=1;i--){
            //STARS
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //SPACE
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){

        butterflyPattern(5);
    }
}
