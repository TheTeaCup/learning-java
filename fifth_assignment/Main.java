import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);

    int num;

    System.out.print("Enter a number between 1 and 5: ");

    num=keyboard.nextInt();

    switch (num)
    {
      case 1:
        System.out.println("1 is I");
        break;

      case 2:
        System.out.println("2 is II");
        break;

      case 3:
        System.out.println("3 is III");
        break;

      case 4:
        System.out.println("4 is IV");
        break;

      case 5:
        System.out.println("5 is V");
        break;

      default:
        System.out.println("Number out of range.");
    }
  }
}