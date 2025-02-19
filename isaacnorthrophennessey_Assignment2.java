import java.util.Scanner;
public class isaacnorthrophennessey_Assignment2 {
    public static void main(String[] args){
        Scanner xc = new Scanner(System.in);
        int arraysize = 0;
        String[] array1 = null;
        double[] array2 = null;
        System.out.println("Please enter the product amount: ");
        if (xc.hasNextInt()) { // checks if input is an integer
            arraysize = xc.nextInt();
            xc.nextLine(); // Consume the leftover newline after nextInt()
             array1 = new String[arraysize];
             array2 = new double[arraysize];
            for (int i = 0; i < arraysize; i++) {
                System.out.println("please enter the product name " + (i + 1) + " ");
                array1[i] = xc.nextLine(); // stores user input in array1
                System.out.println("please enter the product price " + (i + 1) + ": ");
                array2[i] = xc.nextDouble();
                xc.nextLine(); // Consume the leftover newline after nextInt()
            }
            xc.close(); // closes scanner
            for (int i = 0; i < array1.length; i++) { // outputs each array element
                System.out.println("product " + (i + 1) + " is " + array1[i] + " ");
                System.out.println("price for " + array1[i] + " is " + array2[i] + " dollar");
            }
        }
        products pro = new products();        
        pro.findMax(array2);
        pro.findMin(array2);
    }
}

