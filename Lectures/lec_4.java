package Lectures;
import javax.swing.JOptionPane;

class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }
}
class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}


public class lec_4 {
    public static void code() {
        int num = 1;
        while(num != 0) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Оберіть фігуру\n"
                    + "- - - - - - - - - - - - - - - - - - - - - - - \n"
                    + "Квадрат = 1\n"
                    + "Трикутник = 2\n"
                    + "Круг = 3"));

            switch (num) {
                default:
                    JOptionPane.showMessageDialog(null, "Помилка");
                case 1:
                    double side = Double.parseDouble(JOptionPane.showInputDialog("Введіть довжину сторони квадрата:"));
                    Square square = new Square(side);
                    JOptionPane.showMessageDialog(null, "Периметр квадрата: " + square.getPerimeter());
                    JOptionPane.showMessageDialog(null, "Площа квадрата: " + square.getArea());
                    break;

                case 2:
                    double a = Double.parseDouble(JOptionPane.showInputDialog("Введіть довжину 1 сторони трикутника:"));
                    double b = Double.parseDouble(JOptionPane.showInputDialog("Введіть довжину 2 сторони трикутника:"));
                    double c = Double.parseDouble(JOptionPane.showInputDialog("Введіть довжину 3 сторони трикутника:"));
                    Triangle triangle = new Triangle(a, b, c);

                    JOptionPane.showMessageDialog(null, "Периметр трикутника: " + triangle.getPerimeter());
                    JOptionPane.showMessageDialog(null, "Площа трикутника: " + triangle.getArea());
                    break;
                case 3:
                    double r = Double.parseDouble(JOptionPane.showInputDialog("Введіть довжину радіуса кола:"));
                    Circle circle = new Circle(r);
                    JOptionPane.showMessageDialog(null, "Периметр кола: " + circle.getPerimeter());
                    JOptionPane.showMessageDialog(null, "Площа кола: " + circle.getArea());
                    break;
            }


        }
    }


}
