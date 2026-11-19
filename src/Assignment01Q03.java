import java.math.BigInteger;

public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = 10; // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");

        BigInteger current = BigInteger.ONE;
        BigInteger next = BigInteger.ONE;
        intnumOdd = 0;
        for ( int i=0; i<x; i++){
            System.out.print(current);
            if (current.testBit(0)) 
                numOdd++;
            if (i<x-1) 
                System.out.print("");
            BigInteger following = current.add(next);
            current = next;
            next = following;
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
