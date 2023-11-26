import java.util.*;

class Student {
    private String name;
    private int id;
    private boolean isPresent;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.isPresent = false;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void markPresent() {
        isPresent = true;
    }

    public void markAbsent() {
        isPresent = false;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Present: " + isPresent;
    }
}

class AttendanceManager {
    private List<Student> students;

    public AttendanceManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void markAttendance(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                student.markPresent();
                System.out.println("Attendance marked for Student: " + student.getName());
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    public void displayAttendance() {
        System.out.println("Attendance Report:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendanceManager manager = new AttendanceManager();

        // Add some sample students
        manager.addStudent(new Student("Alice", 1));
        manager.addStudent(new Student("Bob", 2));
        manager.addStudent(new Student("Charlie", 3));

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID to mark attendance: ");
                    int studentId = scanner.nextInt();
                    manager.markAttendance(studentId);
                    break;
                case 2:
                    manager.displayAttendance();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
