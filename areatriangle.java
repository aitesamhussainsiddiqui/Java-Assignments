import java.util.Scanner;

// Area of a triangle can be calculated if lengths of
// its three sides is known by using the Heron’s
// formula which says that Square root of
// (s(s−a)(s−b)(s−c)) where s is half of the
// perimeter of the triangle that can be calculated
// by adding length of all the three sides and then
// dividing it by 2.(for further information
// suggested resource is
// https://www.cuemath.com/measurement/area
// -of-triangle/ ). The image given on right hand side of this
// question is available at the given URL.

public class eightassignment {

    public static void main (String[]args){
        Scanner read = new Scanner(System.in);
        double a;
        double b;
        double c;
        double S; //Semi Permimeter
        double num; // area before sqroot
        double A; //Area

        System.out.print("Enter the length of 1st side of triangle called a: ");
        a = read.nextDouble();
        
        System.out.print("Enter the length of 2nd side of triangle called b: ");
        b = read.nextDouble();
        
        System.out.print("Enter the length of 3rd side of triangle called c: ");
        c = read.nextDouble();

        S = (a+b+c)/2;
        num = (S*(S-a)*(S-b)*(S-c));
        A =  Math.sqrt(num); 

        System.out.print("The area of triangle is: " +A+ "Square Unit");

                              


    }
    

}
