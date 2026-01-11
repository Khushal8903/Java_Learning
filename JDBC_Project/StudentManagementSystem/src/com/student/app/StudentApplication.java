package com.student.app;


import com.student.model.Student;
import com.student.service.*;
import java.util.Scanner;

public class StudentApplication {

    public static void main(String[] args) {

        StudentService service = new StudentServiceimpl();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n1 Add 2 View 3 Update 4 Delete 5 Exit");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        Student s = new Student();
                        System.out.print("Name: ");
                        s.setName(sc.next());
                        System.out.print("Email: ");
                        s.setEmail(sc.next());
                        System.out.print("Marks: ");
                        s.setMarks(sc.nextInt());
                        service.addStudent(s);
                    }

                    case 2 -> service.getAllStudents();

                    case 3 -> {
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        System.out.print("New Marks: ");
                        int marks = sc.nextInt();
                        service.updateStudentMarks(id, marks);
                    }

                    case 4 -> {
                        System.out.print("ID: ");
                        service.removeStudent(sc.nextInt());
                    }

                    case 5 -> System.exit(0);
                }
            }
        }
    }
}
