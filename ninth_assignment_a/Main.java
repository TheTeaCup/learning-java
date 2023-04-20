public class Main {
  public static void main(String[] args) {
    int[] grades = {80, 95, 65, 90, 99};
    int total=0;
    for (int i = 0; i < grades.length; i++) {
      System.out.println(grades[i]);
      total = total + grades[i];
    }
    System.out.println("Total = " + total);

    System.out.println("Average = " + total / grades.length);
  }
}