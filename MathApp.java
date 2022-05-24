public class MathApp {
  public static void main(String[] args) {
    MathApp.findMax(30_000, 100_000);
    MathApp.findMin(30_000, 100_000);
    MathApp.getRadius(7.25);
    MathApp.findSqRt(5);
    MathApp.findDistance(5, 10, 85, 50);
    MathApp.getAbs(-3.8);
    MathApp.pickRandom();
  }

  private static void findMax(int job1Salary, int job2Salary) {
    System.out.println(Math.max(job1Salary, job2Salary));
  }

  private static void findMin(int carPrice, int truckPrice) {
    System.out.println(Math.min(carPrice, truckPrice));
  }

  private static void getRadius(double circleRadius) {
    System.out.println(Math.PI * circleRadius * circleRadius);
  }

  private static void findSqRt(double sqRoot) {
    System.out.println(Math.sqrt(sqRoot));
  }

  private static void findDistance(double x1, double x2, double y1, double y2) {
    double xDiff = Math.abs(x2 - x1);
    double yDiff = Math.abs(y2 - y1);
    System.out.println(Math.hypot(xDiff, yDiff));
  }

  private static void getAbs(double num2) {
    System.out.println(Math.abs(num2));
  }

  private static void pickRandom() {
    System.out.println(Math.random());

  }

}
