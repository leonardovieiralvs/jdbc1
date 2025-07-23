package TestDB.CRUD;

import TestDB.DbConnection;
import TestDB.ExceptionTest;

import java.sql.*;

public class ProgramRead {
    public static void main(String[] args) {

        String sql = "SELECT * FROM seller";

        try (Connection conn = DbConnection.getConnection(); PreparedStatement pst = conn.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
            }
        } catch (SQLException e) {
            throw new ExceptionTest(e.getMessage());
        }
    }
}
