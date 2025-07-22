package TestDB.DBTest.CRUD;
import TestDB.DBTest.DBTest;
import TestDB.DBTest.ExceptionTest;

import java.sql.*;

public class ProgramCreate {
    public static void main(String[] args) {

        String sql = "INSERT INTO department (Name) VALUES (?)";

        try (Connection conn = DBTest.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, "Esport");
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new ExceptionTest(e. getMessage());
        }
    }
}
