import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);

    int num;

    System.out.print("Enter a number between 1 and 5: ");

    num=keyboard.nextInt();

    if((num < 1) || (num > 5))
      System.out.print("Number out of range");

    if (num == 1){
      System.out.println("1 is I");
    }

    if (num == 2){
      System.out.println("2 is II");
    }

    if (num == 3){
      System.out.println("3 is III");
    }

    if (num == 4){
      System.out.println("4 is IV");
    }

    if (num == 5){
      System.out.println("5 is V");
    }

  }
}