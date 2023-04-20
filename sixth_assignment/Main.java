import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    String roman;
    char found = 'N';
    System.out.print("Enter a roman number between I and V: ");
    roman=keyboard.nextLine();
    if (roman.equalsIgnoreCase("I")){
      System.out.println("I is 1");
      found = 'Y';
    }

    if (roman.equalsIgnoreCase("II")){
      System.out.println("II is 2");
      found = 'Y';
    }

    if (roman.equalsIgnoreCase("III")){
      System.out.println("III is 3");
      found = 'Y';
    }

    if (roman.equalsIgnoreCase("IV")){
      System.out.println("IV is 4");
      found = 'Y';
    }

    if (roman.equalsIgnoreCase("V")){
      System.out.println("V is 5");
      found = 'Y';
    }

    if (found == 'N')
      System.out.println("Number out of range");
  }
}