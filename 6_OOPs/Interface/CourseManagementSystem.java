/*
Q4. You need to design a course management system.
Requirements
Create interface CourseContent:
int getDuration()
String getCategory()
Create abstract class Course:
title, price
abstract method: double finalPrice()
Create 3 child classes:
ProgrammingCourse
DesignCourse
MarketingCourse

Logic:
Programming → GST 18%
Design → GST 12%
Marketing → GST 10% + (if duration > 20 hrs → extra 150₹)

Input:
Course type
Duration
Price
Calculate final price
Show course details
Explanation
Practices:
Different classes running same parent methods
Multiple logic layers (GST, extra charge)
Polymorphism + Interface usage
*/

import java.util.*;

interface CourseContent {
    int getDuration();
    String getCategory();
}

abstract class Course implements CourseContent {
    String title;
    int price;

    Course(String title, int price) {
        this.title = title;
        this.price = price;
    }

    abstract double finalPrice();
}

class ProgrammingCourse extends Course {
    int duration;

    ProgrammingCourse(String title, int price, int duration) {
        super(title, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getCategory() {
        return "Programming";
    }

    public double finalPrice() {
        return price + price * 0.18; // GST 18%
    }
}


class DesignCourse extends Course {
    int duration;

    DesignCourse(String title, int price, int duration) {
        super(title, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getCategory() {
        return "Design";
    }

    public double finalPrice() {
        return price + price * 0.12; 
    }
}


class MarketingCourse extends Course {
    int duration;

    MarketingCourse(String title, int price, int duration) {
        super(title, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getCategory() {
        return "Marketing";
    }

    public double finalPrice() {
        double gstPrice = price + price * 0.10; 
        if (duration > 20)
            return gstPrice + 150;
        return gstPrice;
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Course Type:");
        System.out.println("1. Programming");
        System.out.println("2. Design");
        System.out.println("3. Marketing");
        int type = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.println("Enter Course Title:");
        String title = sc.nextLine();

        System.out.println("Enter Course Price:");
        int price = sc.nextInt();

        System.out.println("Enter Course Duration (in hours):");
        int duration = sc.nextInt();

        Course c = null;

        switch (type) {
            case 1:
                c = new ProgrammingCourse(title, price, duration);
                break;

            case 2:
                c = new DesignCourse(title, price, duration);
                break;

            case 3:
                c = new MarketingCourse(title, price, duration);
                break;

            default:
                System.out.println("Invalid Course Type!");
                return;
        }

        System.out.println("\n---------------------- Course Details ----------------------");
        System.out.println("Title: " + c.title);
        System.out.println("Category: " + c.getCategory());
        System.out.println("Duration: " + c.getDuration() + " hrs");
        System.out.println("Base Price: " + c.price);
        System.out.println("Final Price (with GST/Extras): " + c.finalPrice());
    }
}
