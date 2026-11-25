package studentdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class StudentDAO {

    // Add Student
    public void addStudent(String name, String email, String course) {

        String sql = "INSERT INTO students (name, email, course) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, course);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student added successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // View Students
    public void viewStudents() {

        String sql = "SELECT * FROM students";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n--- Student Records ---");

            while (rs.next()) {

                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Course: " + rs.getString("course"));

                System.out.println("-------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 // Update Student
    public void updateStudent(int id, String name, String email, String course) {

        String sql = "UPDATE students SET name=?, email=?, course=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, course);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Updated Successfully!");
            } else {
                System.out.println("Student ID Not Found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 // Delete Student
    public void deleteStudent(int id) {

        String sql = "DELETE FROM students WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Deleted Successfully!");
            } else {
                System.out.println("Student ID Not Found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}