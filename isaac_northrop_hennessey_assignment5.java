import java.util.Scanner;

public class isaac_northrop_hennessey_assignment5 {
    static int getDisknum(Scanner sc) {
        int disk = 0; // defines new disk variable to hold input
        if (sc.hasNextInt()) { // condition for holding input only from integers
            disk = sc.nextInt(); // stores the next input
        }
        return disk; // returns value stored
    }

    static String towrDisks(int n, int start, int des, int other) { // n to store disk num, start initialized to be 1
        if (n == 1) { // defines base case
            System.out.println(printdisk(n, start, des)); // prints disk when n == 1 in each recursion
        } else {
            other = 6 - (start + des); // sets helper peg to be difference of other disks
            towrDisks(n - 1, start, other, other); // first half of recursive call
            System.out.println(printdisk(n, start, des));// first call will print the base disk at halfmark in iterative
                                                         // sequence
                                                         // recursive calls to line 16 will print whenever n != 1
            towrDisks(n - 1, other, des, other); // begins the second half of iterations in honoi
        }
        return ""; // required to return a string hence the quotes
    }

    static String printdisk(int n, int origin, int des) {
        if (origin == 1 && des == 3) {
            return "Move disk " + n + " from copper peg to gold peg";
        } // 1 == copper
        if (origin == 3 && des == 1) {
            return "Move disk " + n + " from gold peg to copper peg";
        } // 2 == silver
        if (origin == 2 && des == 1) {
            return "Move disk " + n + " from silver peg to copper peg";
        } // 3 == gold
        if (origin == 1 && des == 2) {
            return "Move disk " + n + " from copper peg to silver peg";
        }
        if (origin == 2 && des == 3) {
            return "Move disk " + n + " from silver peg to gold peg";
        }
        if (origin == 3 && des == 2) {
            return "Move disk " + n + " from gold peg to silver peg";
        }
        return null;
    }

    public static void main(String[] args) {
        int or = 1; // defines the copper peg
        int des = 3; // defines the gold peg
        int aux = 6 - (or + des); // initializes silver or helper peg
        Scanner sc = new Scanner(System.in);
        System.out.println("How many discs to be moved: ");
        int num = getDisknum(sc);
        towrDisks(num, or, des, aux);

    }
}
