import java.util.Scanner;

// Watts is the measure of power consumption of electrical appliances. Which can be
// calculated by using voltmeter and ammeter to read the voltage and ampere. Write a
// program that prints the Watts against the user given volt and ampere reading. 

public class Power{

    public static void main(String[]args){

        Scanner read= new Scanner(System.in);

        double P; //Power in Watts
        double V; //Voltage in Volts
        double I; //Current in Amphere

        System.out.println("Enter voltage in Volts : " );
        V = read.nextDouble();

        System.out.println("enter Current in Amphere : ");
        I = read.nextDouble();

        P = I * V;

        System.out.println("The value of Power for the given Voltage and Current : " +P+ "Watts" );


    }

}
