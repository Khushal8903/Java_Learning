/*
Q4. Area Calculator – Geometric Shapes
Interface: Shape
Method:
double area()
Implementing Classes:
Circle → π × r²
Rectangle → l × b
Triangle → ½ × base × height
Task:
Create 9 shapes (3 of each type).
Print area of each.
Find shape with maximum area.
Explanation:
Strengthens:
Interface polymorphism
Math logic per shape
Maximum value logic using loops
Usage of interface array
*/

import java.util.*;

interface Shape {
    public double area();
}
class Circle implements Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    public double area() {
        return 3.14 * r * r;
    }
}

class Rectangle implements Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
}

class Triangle implements Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double area() {
        return 0.5 * base * height;
    }
}

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape sp[] = new Shape[5];

        for (int i = 0; i < sp.length; i++) {
            System.out.println("Enter Shape Type: 1.Circle  2.Rectangle  3.Triangle");
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    sp[i] = new Circle(r);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double w = sc.nextDouble();
                    sp[i] = new Rectangle(l, w);
                    break;

                case 3:
                    System.out.print("Enter base: ");
                    double b = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    sp[i] = new Triangle(b, h);
                    break;

                default:
                    System.out.println("Invalid input! Try again.");
                    i--;
            }
        }

        printArea(sp);

        findMaxArea(sp);
    }

    public static void printArea(Shape sp[]) {
        System.out.println("\n------------------------------------------");
        for (int i = 0; i < sp.length; i++) {
            System.out.println("Shape " + (i + 1) + " (" + sp[i].getClass().getSimpleName() + ") = " + sp[i].area());
        }
    }

    public static void findMaxArea(Shape sp[]) {
        double max = sp[0].area();
        int index = 0;

        for (int i = 1; i < sp.length; i++) {
            if (sp[i].area() > max) {
                max = sp[i].area();
                index = i;
            }
        }

        System.out.println("\n------------------------------------------");
        System.out.println("Shape with Max Area: " + sp[index].getClass().getSimpleName());
        System.out.println("Max Area = " + max);
    }
}
