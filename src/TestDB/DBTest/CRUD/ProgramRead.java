package TestDB.DBTest.CRUD;

import TestDB.DBTest.DBTest;
import TestDB.DBTest.ExceptionTest;

import java.sql.*;

public class ProgramRead {
    public static void main(String[] args) {

        String sql = "SELECT * FROM seller";

        try (Connection conn = DBTest.getConnection(); PreparedStatement pst = conn.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
            }
        } catch (SQLException e) {
            throw new ExceptionTest(e.getMessage());
        }
    }
}
