public class isaac_hennessey_assignment1_programA {
   public static void main(String[] args) {
      int num = 0; // sets num variable equal to zero
      int num2 = 1; // sets num2 variable equal to one
      int num3 = 1; // sets num3 variable equal to one
      for (int i = 0; i <= 9; i++) { // for loop repeats until i which starts at zero is equal to nine in order to
                                     // print the first ten digits of sequence
         System.out.println(num);
         num3 = num + num2; // sets num3 variable to be equal to the two previous values in sequence
         num = num2; // sets first number in sequence to the second number until next iteration
         num2 = num3; // sets second number in sequence to be equal to the last computed number in the
                      // fibonacci sequence
      }
   }
}
