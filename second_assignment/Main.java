import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // create scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // declare variables for length, width, and area
        int length, width, area;

        // prompt user to enter length and read input
        System.out.print("Enter the length: ");
        length = scanner.nextInt();

        // prompt user to enter width and read input
        System.out.print("Enter the width: ");
        width = scanner.nextInt();

        // calculate the area
        area = length * width;

        // output the result using the required format
        System.out.println("The area of a rectangle with length " + length + " and width " + width + " is " + area + ".");
  }
}