public class Methods {
    public static int addNumbers(int num1, int num2){
        return num1 + num2;
      }
    public static void main(String[] args){
        System.out.println(addNumbers(1,3));
    }
}

class Methods2 {
  public static double calculateArea(double triangleBase, double triangleHeight){
    double area = triangleBase * triangleHeight;
    area = area / 2;
    return area;
  }
  public static void main(String[] args) {
    double area = calculateArea(3.5, 7.0);
    System.out.println("The area of the triangle 1 is " + area);
    area = calculateArea(4.0, 10.0);
    System.out.println("The area of the triangle 2 is " + area);
    area = calculateArea(12.0, 3.0);
    System.out.println("The area of the triangle 3 is " + area);
  }
}