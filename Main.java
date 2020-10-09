import java.util.Scanner;
/**
 * 
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    //creates an array
    int [] numbers = new int [2];
    //asks user to input numbers and stores them
    System.out.println("Please enter the 2 values for the array");
    numbers[0] = input.nextInt();
    numbers[1] = input.nextInt();
    //third variable apparently needed goes here
    int numThree = numbers [0];
    //checks which number is bigger
    if (numbers[0] < numbers[1]){
      System.out.println("Your numbers in ascending order are " + numbers[0] + " and " + numbers[1]);
    }else{ 
      /**
      *makes the ifrst number equal to the second number though and makes the second number equal the the first one through the 
      *variable that stored the value of the first number before it was changed
      */
      numbers[0] = numbers[1];
      numbers[1] = numThree;
      System.out.println("Your numbers in ascending order are " + numbers[0] + " and " + numbers[1]);
    }
     
  }
}
