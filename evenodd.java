import java.util.Scanner;

// An even number is an integer of the form n=2k, where k is an integer. The even numbers
// are therefore ..., -4, -2, 0, 2, 4, 6, 8, 10, ...(REF:
// https://mathworld.wolfram.com/EvenNumber.html). While An odd number is an integer
// of the form n=2k+1, where k is an integer. The odd numbers are therefore ..., -3, -1, 1, 3, 5, 7, ... (REF: https://mathworld.wolfram.com/OddNumber.html). so for the purpose of
// writing a computer program we can deduce that if, upon dividing a real integer number by
// 2 leaves one as remainder then that number will be called an odd number otherwise it is
// an even number. Write a program that takes input an integer number and prints “EVEN” if
// it is an even number and if it is an odd number than it prints “ODD”.

public class seventhassignment {

    public static void main(String[]args){

        int k; // integer
        Scanner read = new Scanner(System.in);
        System.out.print("Enter any integer: "  );
        k = read.nextInt();

        if (k % 2 == 0){
            System.out.print("The given number " +k+  "is even.");
        }else {
            System.out.print("Hence the given number " +k+ " is odd.");
        }



    }

}
