package Week3.Assignment3.Task3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Create instances of Student, Course, and Enrollment
        Student student = new Student(1, "John Doe", 20);
        Course course = new Course("CS101", "Introduction to Computer Science", "Dr. Smith");
        Enrollment enrollment = new Enrollment(student, course, "01-09-2023");

        // Serialize the instances to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("enrollments.ser"))) {
            out.writeObject(enrollment);  // Serialize the Enrollment object
            out.writeObject(student);  // Serialize the Student object
            out.writeObject(course);  // Serialize the Course object
            System.out.println("Enrollment serialized to enrollments.ser");
        } catch (IOException e) {
            System.err.println("Serialization Error: " + e.getMessage());
        }

        // Deserialize the instances from the file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("enrollments.ser"))) {
            Enrollment deserializedEnrollment = (Enrollment) in.readObject();  // Deserialize the Enrollment object
            Student deserializedStudent = (Student) in.readObject();  // Deserialize the Student object
            Course deserializedCourse = (Course) in.readObject();  // Deserialize the Course object
            System.out.println("Deserialized Enrollment: " + deserializedEnrollment);
            System.out.println("Deserialized Student: " + deserializedStudent);
            System.out.println("Deserialized Course: " + deserializedCourse);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization Error: " + e.getMessage());
        }
    }
}
