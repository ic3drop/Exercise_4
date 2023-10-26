import java.util.Scanner;
 class RectangleArea {
        private double length;
        private double width ;
        private double area;

    void getData(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the length of the rectangle: ");
        length = scanner.nextDouble();
        width = scanner.nextDouble();
    }
    void computeField(){
        area = length * width;
    }
    void fieldDisplay(){
        System.out.println("Area " + area);
    }

}
