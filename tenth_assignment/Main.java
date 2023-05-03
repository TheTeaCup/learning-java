import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

    Arrays.sort(cars);

    for(int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
  }
}