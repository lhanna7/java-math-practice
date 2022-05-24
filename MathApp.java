public class MathApp {
  public static void main(String[] args) {

    int job1Salary = 70_000;
    int job2Salary = 90_000;
    System.out.println(Math.max(job1Salary, job2Salary));

    int carPrice = 30_000;
    int truckPrice = 100_000;
    System.out.println(Math.min(carPrice, truckPrice));

    double circleRadius = 7.25;
    System.out.println(Math.PI * circleRadius * circleRadius);

    double sqRoot = 5.0;
    System.out.println(Math.sqrt(sqRoot));

    double x1 = 5;
    double y1 = 85;
    double x2 = 10;
    double y2 = 50;
    double xDiff = Math.abs(x2 - x1);
    double yDiff = Math.abs(y2 - y1);
    System.out.println(Math.hypot(xDiff, yDiff));

    double num2 = -3.8;
    System.out.println(Math.abs(num2));

    System.out.println(Math.random());
  }
}
