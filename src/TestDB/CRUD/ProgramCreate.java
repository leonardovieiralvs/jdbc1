package TestDB.CRUD;
import TestDB.DbConnection;
import TestDB.ExceptionTest;

import java.sql.*;

public class ProgramCreate {
    public static void main(String[] args) {

        String sql = "INSERT INTO department (Name) VALUES (?)";

        try (Connection conn = DbConnection.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, "Esport");
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new ExceptionTest(e. getMessage());
        }
    }
}
