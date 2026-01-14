import java.util.Scanner;

// Write a program that prints the percentage marks of high school graduates by taking input of sumof their obtained marks and maximum marks //

public class firstassignmentpercentage{

    public static void main(String[] args){

        
        float mom ;
        float mtm ;
        float pom ;
        float ptm ;
        float chom ;
        float chtm ;
        float com ;
        float ctm ;
        
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your Maths Obtained Marks: ");
        mom = read.nextFloat();

        System.out.print("Enter your Maths Total Marks: ");
        mtm = read.nextFloat();

        System.out.print("Enter your Physics Obtained Marks: ");
        pom = read.nextFloat();


        System.out.print("Enter your Physics Total Marks: ");
        ptm = read.nextFloat();

        System.out.print("Enter your Chemistry Obtained Marks: ");
        chom = read.nextFloat();

        System.out.print("Enter your Chemistry Total Marks: ");
        chtm = read.nextFloat();

        System.out.print("Enter your Computer Obtained Marks: ");
        com = read.nextFloat();

        System.out.print("Enter your Computer Total Marks: ");
        ctm = read.nextFloat();

        float TOM = mom + pom + chom + com;
        float TMM = mtm + ptm + chtm + ctm;

        System.out.println("Obtained Marks: "+ TOM);


        System.out.println("Total Marks: "+ TMM);
        
        float P = (TOM/TMM) * 100;

        System.out.println("Percentage: "+ P);
    }
}
