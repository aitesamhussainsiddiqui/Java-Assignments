import java.util.Scanner;
// Write a program that takes input of radius of circle and prints its circumference and area.//

public class secondassignmentcircle{

    public static void main(String[] args){
        double r ; //radius
        
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        r = read.nextDouble();
        double a = Math.PI * r * r ;  //area ka formula

        double c = 2 * Math.PI * r ;  //circumference ka formula

        System.out.println("Area of Circle: " + a + " Unit Square");
        
        System.out.println("Circumference of Circl: " + c + " Units");


    }


}
