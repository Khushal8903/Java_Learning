/*
Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,
        	    Mathematics and Computer, calculate percentage and grade according to given conditions:
                    	percentage >= 90% : Grade A
                    	percentage >= 80% : Grade B
                    	percentage >= 70% : Grade C
                    	percentage >= 60% : Grade D
                    	percentage >= 40% : Grade E
                    	percentage < 40% : Grade F	
*/
import java.util.*;

public class GradeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the Marks of Physics: ");
        int phy = sc.nextInt();
        System.out.printf("Enter the Marks of Chemistry: ");
        int che = sc.nextInt();
        System.out.printf("Enter the Marks of Biology: ");
        int bio = sc.nextInt();
        System.out.printf("Enter the Marks of Computer: ");
        int comp = sc.nextInt();
        System.out.printf("Enter the Marks of Mathematics: ");
        int math = sc.nextInt();

        int total = phy + che + bio + comp + math;
        double percentage = (total / 500.0) * 100;

        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}
