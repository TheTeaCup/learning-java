import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    double area, radius;

    System.out.println("To calculate the area of a circle");
    System.out.print("Enter a value for the radius: ");

    radius=keyboard.nextDouble();
    area = Math.PI * radius * radius;

    System.out.printf("The sum is %.2f", area);

  }
}