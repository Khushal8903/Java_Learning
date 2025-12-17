import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String email;
    private String contact;
    private String course;
    private int marks;

   
    public int getId() { 
	return id; 
	}
    public void setId(int id) { 
	this.id = id;
	}

    public String getName() {
	return name; 
	}
    public void setName(String name) { 
	this.name = name; 
	}

    public String getEmail() { 
	return email; 
	}
    public void setEmail(String email) { 
	this.email = email; 
	}

    public String getContact() { 
	return contact;
	}
    public void setContact(String contact) { 
	this.contact = contact; 
	}

    public String getCourse() {
	return course; 
	}
    public void setCourse(String course) { 
	this.course = course; 
	}

    public int getMarks() {
	return marks; 
	}
    public void setMarks(int marks) { 
	this.marks = marks;
	}
	
	 public String toString() {
     
        return String.format("%d\t%s\t%s\t%s\t%s\t%d",
            id, name, email, contact, course, marks
        );
    }

}

class College {
    private Student[] students  = new Student[0]; 

    public void addStudents(Student... newStudents) {
        int oldLen = students.length;
        int newLen = oldLen + newStudents.length;
        Student[] temp = new Student[newLen];

      
        for (int i = 0; i < oldLen; i++) {
            temp[i] = students[i];
        }
        
        for (int i = 0; i < newStudents.length; i++) {
            temp[oldLen + i] = newStudents[i];
        }
        students = temp;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
	
}	

public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        College clg = new College();

        while (true) {
            System.out.println("\n\n1. Add Student Details."
                    + "\n2. Display All Student Details."
                    + "\n3. Search Student By Id or Name."
                    + "\n4. Delete Student By Email or Failed Students."
                    + "\n5. Update Student By Id or Name."
                    + "\n6. Sort Students By Id or Marks."
                    + "\n7. Display Topper."
                    + "\n8. Display Students with Marks 50-80."
                    + "\n9. Exit.");

            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter number of students to add: ");
                    int addCount = sc.nextInt();
                    Student[] newStudents = new Student[addCount];
                    for (int i = 0; i < addCount; i++) {
                        newStudents[i] = new Student();
                        System.out.println("Enter details (id name email contact course marks):");
                        newStudents[i].setId(sc.nextInt());
                        newStudents[i].setName(sc.next());
                        newStudents[i].setEmail(sc.next());
                        newStudents[i].setContact(sc.next());
                        newStudents[i].setCourse(sc.next());
                        newStudents[i].setMarks(sc.nextInt());
                    }
                    clg.addStudents(newStudents); 
                    break;

                case 2:
                    System.out.println("ID\tName\tEmail\tContact\tCourse\tMarks");
                    System.out.println("-----------------------------------------------");
                    for (Student s : clg.getStudents()) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.println("Search by: 1. ID  2. Name");
                    int sch = sc.nextInt();
                    boolean found = false;
                    if (sch == 1) {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        for (Student s : clg.getStudents()) {
                            if (s.getId() == id) {
                                System.out.println(s);
                                found = true;
                            }
                        }
                    } else {
                        System.out.print("Enter Name: ");
                        String name = sc.next();
                        for (Student s : clg.getStudents()) {
                            if (s.getName().equalsIgnoreCase(name)) {
                                System.out.println(s);
                                found = true;
                            }
                        }
                    }
                    if (!found) System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.println("Delete by: 1. Email  2. Failed Students (Marks < 40)");
                    int dCh = sc.nextInt();
                    Student[] students = clg.getStudents();
                    if (dCh == 1) {
                        System.out.print("Enter Email: ");
                        String email = sc.next();
                        boolean deleted = false;
                        int newSize = 0;
                        Student[] temp = new Student[students.length];
                        for (Student s : students) {
                            if (!s.getEmail().equalsIgnoreCase(email)) {
                                temp[newSize++] = s;
                            } else {
                                deleted = true;
                            }
                        }
                        Student[] resized = new Student[newSize];
                        for (int i = 0; i < newSize; i++) resized[i] = temp[i];
                        clg.setStudents(resized);
                        if (deleted) System.out.println("Student deleted.");
                        else System.out.println("No student found with this email.");
                    } else {
                        int newSize = 0;
                        Student[] temp = new Student[students.length];
                        for (Student s : students) {
                            if (s.getMarks() >= 40) {
                                temp[newSize++] = s;
                            }
                        }
                        Student[] resized = new Student[newSize];
                        for (int i = 0; i < newSize; i++) resized[i] = temp[i];
                        clg.setStudents(resized);
                        System.out.println("All failed students deleted.");
                    }
                    break;

                case 5:
                    System.out.println("Update by: 1. ID → Course  2. Name → Contact");
                    int u = sc.nextInt();
                    boolean updated = false;
                    if (u == 1) {
                        System.out.print("Enter ID: ");
                        int uid = sc.nextInt();
                        System.out.print("Enter New Course: ");
                        String newCourse = sc.next();
                        for (Student s : clg.getStudents()) {
                            if (s.getId() == uid) {
                                s.setCourse(newCourse);
                                updated = true;
                            }
                        }
                    } else {
                        System.out.print("Enter Name: ");
                        String uname = sc.next();
                        System.out.print("Enter New Contact: ");
                        String newContact = sc.next();
                        for (Student s : clg.getStudents()) {
                            if (s.getName().equalsIgnoreCase(uname)) {
                                s.setContact(newContact);
                                updated = true;
                            }
                        }
                    }
                    if (updated) System.out.println("Updated successfully.");
                    else System.out.println("Student not found.");
                    break;

                case 6:
                    System.out.println("Sort by: 1. ID Ascending  2. Marks Descending");
                    int sort = sc.nextInt();
                    students = clg.getStudents();
                    for (int i = 0; i < students.length - 1; i++) {
                        for (int j = 0; j < students.length - i - 1; j++) {
                            if ((sort == 1 && students[j].getId() > students[j + 1].getId())
                                    || (sort == 2 && students[j].getMarks() < students[j + 1].getMarks())) {
                                Student temp = students[j];
                                students[j] = students[j + 1];
                                students[j + 1] = temp;
                            }
                        }
                    }
                    clg.setStudents(students);
                    System.out.println("Sorted successfully.");
                    break;

                case 7:
                    students = clg.getStudents();
                    if (students.length > 0) {
                        Student topper = students[0];
                        for (Student s : students) {
                            if (s.getMarks() > topper.getMarks()){
							topper = s;
							}
                        }
                        System.out.println("Topper:\n" + topper);
                    } else {
                        System.out.println("No students available.");
                    }
                    break;

                case 8:
                    System.out.println("Students with marks between 50-80:");
                    found = false;
                    for (Student s : clg.getStudents()) {
                        if (s.getMarks() >= 50 && s.getMarks() <= 80) {
                            System.out.println(s);
                            found = true;
                        }
                    }
                    if (!found){
					System.out.println("No students found in this range.");
					}
                    break;

                case 9:
                    System.out.println("-----------Thank You----------");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
