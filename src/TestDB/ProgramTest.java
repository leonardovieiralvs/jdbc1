package TestDB;

import TestDB.CRUD.ProgramDelete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ProgramTest {
    public static void main(String[] args) {

        try (Connection conn = DbConnection.getConnection(); Statement st = conn.createStatement()) {

            st.executeUpdate("UPDATE seller SET BaseSalary = 100 WHERE DepartmentId = 3");

            int num = 1;
            if (num < 3) {
                throw new SQLException("Fake error: ");
            }

            st.executeUpdate("UPDATE seller SET BaseSalary = 200 WHERE DepartmentId = 4");
            conn.commit();

        } catch (SQLException e) {
                        
        }
    }
}
