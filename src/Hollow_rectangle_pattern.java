import java.util.*;
public class Hollow_rectangle_pattern {
    public static void hollowRectangle(int rows, int columns){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                if(i==1 || i==rows || j==1 || j == columns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        hollowRectangle(4,6);
    }
}
