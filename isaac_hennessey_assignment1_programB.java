public class isaac_hennessey_assignment1_programB {
  public static int totalVowels(String inputstring) { // declares totalVowels integer method that takes one parameter
                                                      // called inputstring
    int total = 0;
    for (int i = 0; i < inputstring.length(); i++) { // for loop iterates until reaching the total string length
        switch (inputstring.charAt(i)) {
        // conditional looks for each vowel at each iteration to determine whether to
            case 'a':
                total++;
                break;
            case 'e':
                total++;
                break;
            case 'i':
                total++;
                break;
            case 'o':
                total++;
                break;
            case 'u':
                total++;
                break;
            default:
                break;
        }

    }

    return total;
  }

  public static void main(String[] args) {
    String string1 = "Samford University";
    String string2 = "Italy";
    String string3 = "I want to go to the football game";
    String string4 = "Barnes and Nobles Bookstore";
    String string5 = "Avia Apartments";

    int num = totalVowels(string1); // calls totalVowels method to count the number of vowels in each string
    int num2 = totalVowels(string2);
    int num3 = totalVowels(string3);
    int num4 = totalVowels(string4);
    int num5 = totalVowels(string5);

    System.out.println(num); // prints number of vowels from string
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(num5);

  }
}