import java.util.Scanner;
// This Java code demonstrates the use of basic input/output and control flow skills. 
// It takes user input to determine the number of green bottles hanging on a wall 
// and then prints out a nursery rhyme-like song, adjusting the wording when there is only one bottle left. 
// The code showcases fundamental concepts like user input, loops, conditional statements, and string manipulation.

public class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    // Prompt the user for input
    System.out.println("How many bottles to start with?");
    
    // Read an integer input from the user
    int num = userInput.nextInt();
    
    // Array to store number words from "one" to "ten"
    String[] num2 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    
    // Initialize num1 with one less than the user's input
    int num1 = num - 1;
    
    // Start a loop while the number of bottles is greater than 0
    while (num > 0) {
      
      if (num != 1 && num != 2) {
        // Output the lyrics for more than two bottles
        System.out.println(num2[num1] + " green bottles, hanging on the wall\n" + num2[num1] + " green bottles, hanging on the wall\n" + "and if one green bottle, should accidentally fall\n" + "there'd be " + num2[(num1 - 1)] + " green bottles, hanging on the wall\n");
      } else if (num == 1) {
        // Output the lyrics for one bottle
        System.out.println(num2[num1] + " green bottle, hanging on the wall\n" + num2[num1] + " green bottle, hanging on the wall\n" + "and if one green bottle, should accidentally fall\n" + "there'd be no green bottles, hanging on the wall");
      } else if (num == 2) {
        // Output the lyrics for two bottles
        System.out.println(num2[num1] + " green bottles, hanging on the wall\n" + num2[num1] + " green bottles, hanging on the wall\n" + "and if one green bottle, should accidentally fall\n" + "there'd be " + num2[(num1 - 1)] + " green bottle, hanging on the wall\n");
      }
      
      // Decrement both num and num1 for the next iteration
      num = num - 1;
      num1 = num1 - 1;
    }
  }
}
