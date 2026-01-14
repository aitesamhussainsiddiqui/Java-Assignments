import java.util.Scanner;

// Write a program to calculate and print the original selling price if the discounted selling //
// price and discount percentage is entered by the user.//

public class OriginalSalePrice{

    public static void main(String[] args){

        double OSP; //Original Selling Price
        double DSP; //Discounted Selling Price
        double DA; //Discounted Amount
        double DP; //Discount Percentage

        Scanner read = new Scanner(System.in);

        System.out.println("Enter the Discounted Selling Price : ");
        DSP = read.nextDouble();

        System.out.println("Enter the Discount Percentage : ");
        DP = read.nextDouble();

        // Formula Dervation 
        // DSP = OSP - (DP/100 * OSP)
        // DSP = OSP (1 - DP / 100 )
        // OSP = DSP / (1- DP / 100)
        OSP = DSP/ (1 - DP / 100);

        System.out.println("The Original Selling Price is : " +OSP );



    }

}
