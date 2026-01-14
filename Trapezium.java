 import java.util.Scanner;

// A quadrilateral with at least one pair of parallel sides
// is called a trapezoid or trapezium. The area K of a trapezoid is given by K = h * (a + b)/2, where a and b are the lengths of the parallel sides, h
// is the height (the perpendicular distance between
// these sides). Write a program that takes input lengths
// of two parallel sides and the perpendicular distance
// between these two parallel lines, and prints the area
// of this trapezoid.

public class Trapezium{

    public static void main(String[] args){

        double a; //length of 1st parallel side
        double b; //length of 2nd parallel side
        double h; //perpendicular distance
        double k; //area of trapezium        

        Scanner read = new Scanner(System.in);

        System.out.println("Enter the value of 1st parallel side which is a : " );
        a = read.nextDouble();

        System.out.println("Enter the value of 2nd parallel side which is b : " );
        b = read.nextDouble();

        System.out.println("Enter the value of perpendicular distance is : " );
        h = read.nextDouble();

        k = h * ( a + b ) / 2 ;

        System.out.println("The area if the given trapezium for the given values are : " +k+ "square unit" );
        


    }

}
